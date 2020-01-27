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
	private Questionnaire questionnaire;
	private String answer;
	private long questionId;

	public Answer() {}

	public Answer(long id, Questionnaire questionnaire, String answer, long questionId) {
		setId(id);
		this.questionnaire = questionnaire;
		this.answer = answer;
		this.questionId = questionId;
	}
	
	public Answer(Questionnaire questionnaire, String answer, long questionId) {
		this.questionnaire = questionnaire;
		this.answer = answer;
		this.questionId = questionId;
	}

	public Questionnaire getQuestionaire() {
		return questionnaire;
	}

	public void setQuestionaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
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
