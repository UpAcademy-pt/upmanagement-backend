package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;

@Entity
public class Answer extends Entity_{

	private static final long serialVersionUID = 1L;
	
	private enum AnswerType {
		multiple,
		open,
		singleOption
	}
	
	private String answer;
	private AnswerType rtype;
	private long questionId;
	
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public AnswerType getRtype() {
		return rtype;
	}
	public void setRtype(AnswerType rtype) {
		this.rtype = rtype;
	}
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	
	
	
	
	
}
