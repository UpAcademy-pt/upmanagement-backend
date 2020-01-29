package pt.upacademy.coreFinalProject.models.DTOS;

public class AnswerDTO extends EntityDTO{

	private long questionaireId;
	private String[] answer;
	private long questionId;

	public AnswerDTO() {}

	public AnswerDTO(long id, long questionaireId, String[] answer, long questionId) {
		setId(id);
		this.questionaireId = questionaireId;
		this.answer = answer;
		this.questionId = questionId;
	}

	public long getQuestionaireId() {
		return questionaireId;
	}
	
	public void setQuestionaireId(long questionaireId) {
		this.questionaireId = questionaireId;
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
