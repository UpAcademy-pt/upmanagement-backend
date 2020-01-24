package pt.upacademy.coreFinalProject.models;

import java.util.List;

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
	private List<Question> questionList;
	private String name;
	private List<Long> accountIdList;
	private Qtype qType;
	private List<Role> editPrivacy;
	private List<Role> viewPrivacy;
	
	public List<Long> getAccountIdList() {
		return accountIdList;
	}

	public void setAccountIdList(List<Long> accountIdList) {
		this.accountIdList = accountIdList;
	}

	public List<Role> getEditPrivacy() {
		return editPrivacy;
	}

	public void setEditPrivacy(List<Role> editPrivacy) {
		this.editPrivacy = editPrivacy;
	}

	public List<Role> getViewPrivacy() {
		return viewPrivacy;
	}

	public void setViewPrivacy(List<Role> viewPrivacy) {
		this.viewPrivacy = viewPrivacy;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}
	
	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Qtype getqType() {
		return qType;
	}
	
	public void setqType(Qtype qType) {
		this.qType = qType;
	}

}
