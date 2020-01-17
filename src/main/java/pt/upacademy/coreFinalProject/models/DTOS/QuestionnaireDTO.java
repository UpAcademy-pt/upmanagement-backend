package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;

import pt.upacademy.coreFinalProject.models.DTOS.EntityDTO;

public class QuestionnaireDTO {

	private List<QuestionDTO> questionList;
	private String name;
	private boolean template;
	
	public QuestionnaireDTO(List<QuestionDTO> questionList, String name, boolean template) {
		this.questionList = questionList;
		this.name = name;
		this.template = template;
	}

	public QuestionnaireDTO() {
	}

	public List<QuestionDTO> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<QuestionDTO> questionList) {
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
