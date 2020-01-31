package pt.upacademy.coreFinalProject.models.questionnaire;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import pt.upacademy.coreFinalProject.models.core.EntityRoot;
import pt.upacademy.coreFinalProject.models.core.User;

@Entity
@NamedQuery(name = Template.GET_ALL_TEMPLATES, query = "SELECT t FROM Template t")
public class Template extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	public static final String GET_ALL_TEMPLATES = "getAllTemplates";
	
	@OneToMany( cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "questionnaire", fetch = FetchType.EAGER)
	private Set<Question> questionList;
	private String name;
	private Qtype qType;
	private String[] editPrivacy;
	private String[] viewPrivacy;

	public Template() {}

	public Template(long id, Set<Question> questionList, String name, Qtype qType, String[] editPrivacy, String[] viewPrivacy) {
		setId(id);
		this.questionList = questionList;
		this.name = name;
		this.qType = qType;
		this.editPrivacy = editPrivacy;
		this.viewPrivacy = viewPrivacy;
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
	
	public Set<Question> getQuestionList() {
		return questionList;
	}
	
	public void setQuestionList(Set<Question> questionList) {
		this.questionList = questionList;
	}

	public String[] getEditPrivacy() {
		return editPrivacy;
	}

	public void setEditPrivacy(String[] editPrivacy) {
		this.editPrivacy = editPrivacy;
	}

	public String[] getViewPrivacy() {
		return viewPrivacy;
	}

	public void setViewPrivacy(String[] viewPrivacy) {
		this.viewPrivacy = viewPrivacy;
	}
	
	

}
