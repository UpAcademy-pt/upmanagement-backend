package pt.upacademy.coreFinalProject.models;

public class Question {

	private enum AnswerType {
		multiple,
		open,
		singleOption
	}
	
	private enum Filter {
		academy,
		trainer,
		student
	}
	
	private String question;
	private AnswerType atype;
	private long rightAnswer;
	private long[] options;
	private Filter filter;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public AnswerType getAtype() {
		return atype;
	}
	public void setAtype(AnswerType atype) {
		this.atype = atype;
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
