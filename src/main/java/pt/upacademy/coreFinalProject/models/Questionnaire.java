package pt.upacademy.coreFinalProject.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ 
	@NamedQuery(name = Questionnaire.GET_ALL_QUESTIONNAIRES, query = "SELECT q FROM Questionnaire q"),
	@NamedQuery(name = Questionnaire.GET_ALL_QUESTIONNAIRES_NOT_ANSWERED, query = "SELECT NEW pt.upacademy.coreFinalProject.models.DTOS.QuestionnairePreviewDTO(q.id, q.name) FROM Questionnaire q WHERE q.accountId = :id AND q.answerList IS EMPTY"),
	@NamedQuery(name = Questionnaire.GET_ALL_ANSWERED_QUESTIONNAIRES, query = "SELECT NEW pt.upacademy.coreFinalProject.models.Questionnaire(q.id, q.name, q.qType) FROM Questionnaire q WHERE q.accountId = :id AND q.answerList IS NOT EMPTY")
})
public class Questionnaire extends EntityRoot{

	public static final String GET_ALL_QUESTIONNAIRES = "getAllQuestionnaire";
	public static final String GET_ALL_QUESTIONNAIRES_NOT_ANSWERED = "getAllQuestionnaireNotAnswered";
	public static final String GET_ALL_ANSWERED_QUESTIONNAIRES = "getAllAnsweredQuestionnaires";
	private static final long serialVersionUID = 1L;
		
	@OneToMany( cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "questionnaire", fetch = FetchType.EAGER)
	private Set<Question> questionList;
	private String name;
	private long accountId;
	@OneToMany( cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "questionnaire", fetch = FetchType.EAGER)
	private Set<Answer> answerList;
	private Qtype qType;
	@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<Role> editPrivacy;
	@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<Role> viewPrivacy;
	private int score;
	
	public Questionnaire() {}

	public Questionnaire(long id, Set<Question> questionList, String name, long accountId, Qtype qType, Set<Role> editPrivacy,
			Set<Role> viewPrivacy) {
		setId(id);
		this.questionList = questionList;
		this.name = name;
		this.accountId = accountId;
		this.qType = qType;
		this.editPrivacy = editPrivacy;
		this.viewPrivacy = viewPrivacy;
	}

	public Questionnaire(long id, String name, Qtype qType) {
		setId(id);
		this.name = name;
		this.qType = qType;
	}
	
	public Set<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(Set<Question> questionList) {
		this.questionList = questionList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public Set<Answer> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(Set<Answer> answerList) {
		this.answerList = answerList;
	}

	public Qtype getqType() {
		return qType;
	}

	public void setqType(Qtype qType) {
		this.qType = qType;
	}

	public Set<Role> getEditPrivacy() {
		return editPrivacy;
	}

	public void setEditPrivacy(Set<Role> editPrivacy) {
		this.editPrivacy = editPrivacy;
	}

	public Set<Role> getViewPrivacy() {
		return viewPrivacy;
	}

	public void setViewPrivacy(Set<Role> viewPrivacy) {
		this.viewPrivacy = viewPrivacy;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


}
