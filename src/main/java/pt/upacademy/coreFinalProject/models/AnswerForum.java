package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ 
	@NamedQuery(name = AnswerForum.GET_ALL_ANSWERS, query = "SELECT a FROM AnswerForum a "),
	@NamedQuery(name = AnswerForum.GET_ANSWERS_BY_QUESTION_ID, query = "SELECT a FROM AnswerForum a WHERE a.questionId = :questionId"),
	@NamedQuery(name = AnswerForum.DELETE_ANSWER_BY_QUESTION_ID, query = "DELETE FROM AnswerForum a WHERE a.questionId = :questionId")
	
})
public class AnswerForum extends EntityRoot {

	public static final String GET_ALL_ANSWERS = "getAllAnswers";
	public static final String GET_ANSWERS_BY_QUESTION_ID = "getAnswersByQuestionId";
	public static final String DELETE_ANSWER_BY_QUESTION_ID = "deleteAnswerByQuestionId";
	
	private static final long serialVersionUID = 1L;
		
	private long questionId;
	private String nameOfUser;
	private String answer;
	
	public static String getName() {
		return "AnswerForum";
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getNameOfUser() {
		return nameOfUser;
	}

	public void setNameOfUser(String nameOfUser) {
		this.nameOfUser = nameOfUser;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "AnswerForum [questionId=" + questionId + ", nameOfUser=" + nameOfUser + ", answer=" + answer + "]";
	}
	
}
