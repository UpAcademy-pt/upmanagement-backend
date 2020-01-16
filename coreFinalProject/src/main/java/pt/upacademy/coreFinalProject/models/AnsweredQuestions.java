package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class AnsweredQuestions extends Entity_ {
	
	private static final long serialVersionUID = 1L;
	
	private enum Qtype {
		quiz,
		evaluation
	}
	
	private Account accountId;
	private List<Question> questionsList;
	private long templateId;
	private Qtype type;
	
	
	public Account getAccountId() {
		return accountId;
	}
	public void setAccountId(Account accountId) {
		this.accountId = accountId;
	}
	public List<Question> getQuestionsList() {
		return questionsList;
	}
	public void setQuestionsList(List<Question> questionsList) {
		this.questionsList = questionsList;
	}
	public long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}
	public Qtype getType() {
		return type;
	}
	public void setType(Qtype type) {
		this.type = type;
		
	}
	

	
}
