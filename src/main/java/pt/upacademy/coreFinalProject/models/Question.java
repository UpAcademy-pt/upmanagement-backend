package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Question.GET_ALL_QUESTIONS, query = "SELECT q FROM Question q")})
public class Question extends Entity_{

	public static final String GET_ALL_QUESTIONS = "getAllQuestion";
	private static final long serialVersionUID = 1L;
	
	public enum AnswerType {
		multiple,
		open,
		singleOption
	}
	
	public enum Filter {
		academy,
		trainer,
		student
	}
	
	private String question;
	private AnswerType aType;
	private long rightAnswer;
	private long[] options;
	private Filter filter;
	
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
	public long[] getOptions() {
		return options;
	}
	public void setOptions(long[] options) {
		this.options = options;
	}
	public Filter getFilter() {
		return filter;
	}
	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	
	

	
}
