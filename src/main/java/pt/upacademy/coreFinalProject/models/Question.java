package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Question.GET_ALL_QUESTIONS, query = "SELECT q FROM Question q")})
public class Question extends EntityRoot {

	public static final String GET_ALL_QUESTIONS = "getAllQuestion";
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Questionnaire questionnaire;
	private String question;
	private AnswerType aType;
	private String [] options;
	private int[] rightAnswer;

	public Question() {}

	public Question(Questionnaire questionnaire, String question, AnswerType aType, String[] options, int[] rightAnswer) {
		//setId(id);
		this.questionnaire = questionnaire;
		this.question = question;
		this.aType = aType;
		this.options = options;
		this.rightAnswer = rightAnswer;
	}

	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
	
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public AnswerType getaType() {
		return aType;
	}
	
	public void setaType(AnswerType aType) {
		this.aType = aType;
	}

	
	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] list) {
		this.options = list;
	}

	public int[] getRightAnswer() {
		return rightAnswer;
	}
	
	public void setRightAnswer(int[] rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

}
