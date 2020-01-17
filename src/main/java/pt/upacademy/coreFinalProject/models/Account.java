package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
	@NamedQuery(name = Account.GET_ALL_ACCOUNTS, query = "SELECT a FROM Account a"),
	@NamedQuery(name = Account.GET_ALL_ACCOUNT_IDs, query = "SELECT a.id FROM Account a"),
	@NamedQuery(name = Account.GET_ACCOUNT_COUNT, query = "SELECT COUNT(a.id) FROM Account a")})
public class Account extends EntityRoot  {
	
	private static final long serialVersionUID = 1L;


	public static final String GET_ALL_ACCOUNTS = "getAllAccounts";
	public static final String GET_ALL_ACCOUNT_IDs = "getAllAccountsIds";
	public static final String GET_ACCOUNT_COUNT = "getAccountCount";
	
	private User user;
	private List <Edition>  editions;
	private List <Lesson> lessons;
	private List <Note> notes;
	private List <QuestionForum> questions;
	private List <AnswerForum> answers;
	private List <Event> events;
	
	
	
	public Account(User user, List<Edition> editions, List<Lesson> lessons, List<Note> notes,
			List<QuestionForum> questions, List<AnswerForum> answers, List<Event> events) {
		this.user = user;
		this.editions = editions;
		this.lessons = lessons;
		this.notes = notes;
		this.questions = questions;
		this.answers = answers;
		this.events = events;
	}
	
	
	public Account() {
	}


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Edition> getEditions() {
		return editions;
	}
	public void setEditions(List<Edition> editions) {
		this.editions = editions;
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
		return "Account [user=" + user + ", editions=" + editions + ", lessons=" + lessons 
				+ ", notes=" + notes + ", questions=" + questions +", answers=" + answers + ", events=" + events + "]";
	}
	

}
