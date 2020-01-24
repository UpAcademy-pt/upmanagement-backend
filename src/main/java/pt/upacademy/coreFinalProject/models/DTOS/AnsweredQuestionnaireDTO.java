package pt.upacademy.coreFinalProject.models.DTOS;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

import pt.upacademy.coreFinalProject.models.Qtype;

public class AnsweredQuestionnaireDTO extends EntityDTO {
	
	private Set<AnswerDTO> answerList;
	private long questionnaireId;
	private long accountId;
	private Qtype qType;
	private LocalDate date;
	private int score;

	public AnsweredQuestionnaireDTO() {}

	public AnsweredQuestionnaireDTO(long id, Set<AnswerDTO> answerList, long questionnaireId, long accountId, Qtype qType,
			LocalDate date, int score) {
		setId(id);
		this.answerList = answerList;
		this.questionnaireId = questionnaireId;
		this.accountId = accountId;
		this.qType = qType;
		this.date = date;
		this.score = score;
	}

	public Set<AnswerDTO> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(Set<AnswerDTO> answerList) {
		this.answerList = answerList;
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
	
	public Qtype getqType() {
		return qType;
	}
	
	public void setqType(Qtype qType) {
		this.qType = qType;
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
