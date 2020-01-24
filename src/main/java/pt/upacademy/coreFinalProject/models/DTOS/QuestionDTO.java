package pt.upacademy.coreFinalProject.models.DTOS;

import pt.upacademy.coreFinalProject.models.AnswerType;

public class QuestionDTO extends EntityDTO {

	private long questionnarieId;
	private String question;
	private AnswerType aType;
	private String[] options;
	private int[] rightAnswer;
	
	public QuestionDTO() {}

	public QuestionDTO(long id, long questionnarieId, String question, AnswerType aType, String[] options, int[] rightAnswer) {
		setId(id);
		this.questionnarieId = questionnarieId;
		this.question = question;
		this.aType = aType;
		this.options = options;
		this.rightAnswer = rightAnswer;
	}

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

	public int[] getRightAnswer() {
		return rightAnswer;
	}
	
	public void setRightAnswer(int[] rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	
	public long getQuestionnarieId() {
		return questionnarieId;
	}
	
	public void setQuestionnarieId(long questionnarieId) {
		this.questionnarieId = questionnarieId;
	}
	
}
