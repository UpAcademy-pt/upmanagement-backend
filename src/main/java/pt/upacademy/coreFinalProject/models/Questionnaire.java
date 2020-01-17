package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = Questionnaire.GET_ALL_QUESTIONNAIRES, query = "SELECT q FROM Questionnaire q")})
public class Questionnaire extends Entity_{

	public static final String GET_ALL_QUESTIONNAIRES = "getAllQuestionnaire";
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private List<Question> questionList;
	private String name;
	private boolean template;
	
	public List<Question> getQuestionList() {
		return questionList;
	}
	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTemplate() {
		return template;
	}
	public void setTemplate(boolean template) {
		this.template = template;
	}
	
	
	
	
	
	
}
