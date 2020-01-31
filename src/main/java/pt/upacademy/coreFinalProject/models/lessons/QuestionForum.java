package pt.upacademy.coreFinalProject.models.lessons;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import pt.upacademy.coreFinalProject.models.core.EntityRoot;

@Entity
@NamedQueries({ @NamedQuery(name = QuestionForum.GET_ALL_QUESTIONS, query = "SELECT q FROM QuestionForum q "),
		@NamedQuery(name = QuestionForum.GET_QUESTIONS_BY_EDITION_ID, query = "SELECT q FROM QuestionForum q WHERE q.editionId = :editionId")
})
public class QuestionForum extends EntityRoot {

	public static final String GET_ALL_QUESTIONS = "getAllQuestions";
	public static final String GET_QUESTIONS_BY_EDITION_ID = "getQuestionsByEditionId";

	private static final long serialVersionUID = 1L;

	private String title;
	private String description;
	private long editionId;
	private String nameOfUser;

	public static String getName() {
		return "QuestionForum";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getEditionId() {
		return editionId;
	}

	public void setEditionId(long editionId) {
		this.editionId = editionId;
	}

	public String getNameOfUser() {
		return nameOfUser;
	}

	public void setNameOfUser(String nameOfUser) {
		this.nameOfUser = nameOfUser;
	}

	@Override
	public String toString() {
		return "QuestionForum [title=" + title + ", description=" + description + ", editionId=" + editionId
				+ ", nameOfUser=" + nameOfUser + "]";
	}

}
