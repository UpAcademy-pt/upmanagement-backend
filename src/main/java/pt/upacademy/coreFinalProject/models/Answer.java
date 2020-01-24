package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Answer.GET_ALL_ANSWERS, query = "SELECT a FROM Answer a")})
public class Answer extends EntityRoot{

	public static final String GET_ALL_ANSWERS = "getAllAnswers";
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private AnsweredQuestionnaire answeredQuestionaire;
	private String answer;
	private long questionId;
	
	public AnsweredQuestionnaire getAnsweredQuestionaire() {
		return answeredQuestionaire;
	}
	
	public void setAnsweredQuestionaire(AnsweredQuestionnaire answeredQuestionaire) {
		this.answeredQuestionaire = answeredQuestionaire;
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
