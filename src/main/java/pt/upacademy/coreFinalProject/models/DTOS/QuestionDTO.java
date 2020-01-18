package pt.upacademy.coreFinalProject.models.DTOS;

import pt.upacademy.coreFinalProject.models.AnswerType;
import pt.upacademy.coreFinalProject.models.Role;

public class QuestionDTO extends EntityDTO {


	
	private String question;
	private AnswerType aType;
	private String[] options;
	private Role filter;
	
	

	
	public QuestionDTO(String question, AnswerType aType, String[] options, Role filter) {
		this.question = question;
		this.aType = aType;
		this.options = options;
		this.filter = filter;
	}

	public QuestionDTO() {
	}

//	public QuestionDTO(String question2, pt.upacademy.coreFinalProject.models.Question.AnswerType getaType,
//			long[] options2, pt.upacademy.coreFinalProject.models.Question.Filter filter2) {
//		// TODO Auto-generated constructor stub
//	}

	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public AnswerType getaType() {
		return aType;
	}
	public void setaType(AnswerType aType) {
		this.aType = aType;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public Role getFilter() {
		return filter;
	}
	public void setFilter(Role filter) {
		this.filter = filter;
	}
	
}
