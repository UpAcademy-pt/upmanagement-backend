package pt.upacademy.coreFinalProject.models.DTOS;

public class AnswerDTO {

	private long answeredQuestionaireId;
	private String answer;
	private long questionId;
	
	public long getAnsweredQuestionaireId() {
		return answeredQuestionaireId;
	}
	
	public void setAnsweredQuestionaireId(long answeredQuestionaireId) {
		this.answeredQuestionaireId = answeredQuestionaireId;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public long getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

}
