package pt.upacademy.coreFinalProject.models;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = Questionnaire.GET_ALL_QUESTIONNAIRES, query = "SELECT q FROM Questionnaire q")})
public class Questionnaire extends EntityRoot{

	public static final String GET_ALL_QUESTIONNAIRES = "getAllQuestionnaire";
	private static final long serialVersionUID = 1L;
		
	// CascadeType.MERGE => Automatically updates Question after Questionnaire is updated
	// CascadeType.PERSIST => Automatically creates Question after Questionnaire is created with Questions
	// FetchType.EAGER => loads questionList when Questionnaire is loaded
	@OneToMany( cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "questionnaire", fetch = FetchType.EAGER)
	private Set<Question> questionList;
	private String name;
	private long[] accountIdList;
	private Qtype qType;
	private Role[] editPrivacy;
	private Role[] viewPrivacy;
	
	public Questionnaire() {}

	public Questionnaire(long id, Set<Question> questionList, String name, long[] accountIdList, Qtype qType, Role[] editPrivacy,
			Role[] viewPrivacy) {
		setId(id);
		this.questionList = questionList;
		this.name = name;
		this.accountIdList = accountIdList;
		this.qType = qType;
		this.editPrivacy = editPrivacy;
		this.viewPrivacy = viewPrivacy;
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

	public long[] getAccountIdList() {
		return accountIdList;
	}

	public void setAccountIdList(long[] accountIdList) {
		this.accountIdList = accountIdList;
	}

	public Qtype getqType() {
		return qType;
	}

	public void setqType(Qtype qType) {
		this.qType = qType;
	}

	public Role[] getEditPrivacy() {
		return editPrivacy;
	}

	public void setEditPrivacy(Role[] editPrivacy) {
		this.editPrivacy = editPrivacy;
	}

	public Role[] getViewPrivacy() {
		return viewPrivacy;
	}

	public void setViewPrivacy(Role[] viewPrivacy) {
		this.viewPrivacy = viewPrivacy;
	}
	

}
