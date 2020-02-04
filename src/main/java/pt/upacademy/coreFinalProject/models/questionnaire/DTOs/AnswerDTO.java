package pt.upacademy.coreFinalProject.models.questionnaire.DTOs;

import pt.upacademy.coreFinalProject.models.core.DTOS.EntityDTO;

public class AnswerDTO extends EntityDTO{

	private long questionnaireId;
	private String[] answer;
	private long questionId;
	private boolean rightAnswer;

	public AnswerDTO() {}

	public AnswerDTO(long id, long questionaireId, String[] answer, long questionId, boolean rightAnswer) {
		setId(id);
		this.questionnaireId = questionaireId;
		this.answer = answer;
		this.questionId = questionId;
		this.rightAnswer = rightAnswer;
	}

	public boolean isRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(boolean rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	public long getQuestionnaireId() {
		return questionnaireId;
	}
	
	public void setQuestionnaireId(long questionaireId) {
		this.questionnaireId = questionaireId;
	}
	
	public String[] getAnswer() {
		return answer;
	}
	
	public void setAnswer(String[] answer) {
		this.answer = answer;
	}
	
	public long getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

}
