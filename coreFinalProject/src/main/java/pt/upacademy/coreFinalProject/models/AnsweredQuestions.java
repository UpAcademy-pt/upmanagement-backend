package pt.upacademy.coreFinalProject.models;

import java.util.List;

public class AnsweredQuestions {
	
	private enum Qtype {
		quiz,
		evaluation
	}
	
	private long id;
	private Account accountId;
	private List<Question> QuestionsList;
	private long templateId;
	private Qtype type;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Account getAccountId() {
		return accountId;
	}
	public void setAccountId(Account accountId) {
		this.accountId = accountId;
	}
	public List<Question> getQuestionsList() {
		return QuestionsList;
	}
	public void setQuestionsList(List<Question> questionsList) {
		QuestionsList = questionsList;
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
