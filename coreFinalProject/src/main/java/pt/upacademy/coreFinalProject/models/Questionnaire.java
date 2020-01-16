package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Questionnaire extends Entity_{

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
