package pt.upacademy.coreFinalProject.models.DTOS;

public class QuestionDTO {

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
	private long[] options;
	private Filter filter;
	
	

	
	public QuestionDTO(String question, AnswerType aType, long[] options, Filter filter) {
		this.question = question;
		this.aType = aType;
		this.options = options;
		this.filter = filter;
	}

	public QuestionDTO() {
	}

//	public QuestionDTO(String question2, pt.upacademy.coreFinalProject.models.Question.AnswerType getaType,
//			long[] options2, pt.upacademy.coreFinalProject.models.Question.Filter filter2) {
//		// TODO Auto-generated constructor stub
//	}

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
