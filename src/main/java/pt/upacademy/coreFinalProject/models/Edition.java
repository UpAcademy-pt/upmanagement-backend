package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({ @NamedQuery(name = Edition.GET_ALL_EDITIONS, query = "SELECT e FROM Edition e")
})
public class Edition extends EntityRoot  {
	
	public static final String GET_ALL_EDITIONS = "getAllEditions";
		
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String type;
	
	@OneToOne
	private Account account;
	
	@OneToMany ()
	private List <Lesson> lessons;

	@OneToMany ()
	private List <Note> notes;
	
	@OneToMany ()
	private List <QuestionForum> questions;
	
	@OneToMany()
	private List <AnswerForum> answers;
	
	@OneToMany ()
	private List <Event> events;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public List<QuestionForum> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionForum> questions) {
		this.questions = questions;
	}

	public List<AnswerForum> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerForum> answers) {
		this.answers = answers;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Edition [name=" + name  + ", type=" + type + "account=" + account +", lessons=" + lessons 
				+ ", notes=" + notes + ", questions=" + questions +", answers=" + answers + ", events=" + events + "]";
	}
	
	

}
