package pt.upacademy.coreFinalProject.models.DTOS;

import java.time.LocalDate;

public class AnsweredQuestionnairePreviewDTO extends EntityDTO{
	private long questionnaireId;
	private long accountId;
	private LocalDate date;
	private int score;

	public AnsweredQuestionnairePreviewDTO() {}

	public AnsweredQuestionnairePreviewDTO(long id, long questionnaireId, long accountId, LocalDate date, int score) {
		setId(id);
		this.questionnaireId = questionnaireId;
		this.accountId = accountId;
		this.date = date;
		this.score = score;
	}

	public long getQuestionnaireId() {
		return questionnaireId;
	}
	
	public void setQuestionnaireId(long questionnaireId) {
		this.questionnaireId = questionnaireId;
	}
	
	public long getAccountId() {
		return accountId;
	}
	
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

}
