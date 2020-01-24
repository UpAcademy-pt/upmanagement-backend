package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;

import pt.upacademy.coreFinalProject.models.AnswerType;

public class QuestionDTO extends EntityDTO {

	private long questionnarieId;
	private String question;
	private AnswerType aType;
	private List<String> options; // nao colocar este atributo qd converter toDTO
	private int rightAnswer;
	
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
	
	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public int getRightAnswer() {
		return rightAnswer;
	}
	
	public void setRightAnswer(int rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	
	public long getQuestionnarieId() {
		return questionnarieId;
	}
	
	public void setQuestionnarieId(long questionnarieId) {
		this.questionnarieId = questionnarieId;
	}
	
}
