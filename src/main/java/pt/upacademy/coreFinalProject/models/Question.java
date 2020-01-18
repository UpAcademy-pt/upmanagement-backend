package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Question.GET_ALL_QUESTIONS, query = "SELECT q FROM Question q")})
public class Question extends EntityRoot {

	public static final String GET_ALL_QUESTIONS = "getAllQuestion";
	private static final long serialVersionUID = 1L;
	
	
	private String question;
	private AnswerType aType;
	private long rightAnswer;
	private String[] options;
	private Role filter;
	
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
	public long getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(long rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public Role getFilter() {
		return filter;
	}
	public void setFilter(Role filter) {
		this.filter = filter;
	}

	
	

	
}
