package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Answer.GET_ALL_ANSWERS, query = "SELECT a FROM Answer a")})
public class Answer extends EntityRoot{

	public static final String GET_ALL_ANSWERS = "getAllAnswers";
	private static final long serialVersionUID = 1L;
	
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
