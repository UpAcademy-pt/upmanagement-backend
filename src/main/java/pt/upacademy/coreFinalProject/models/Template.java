package pt.upacademy.coreFinalProject.models;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Template extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany( cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "questionnaire", fetch = FetchType.EAGER)
	private Set<Question> questionList;
	private String name;
	private Qtype qType;
	private Role[] editPrivacy;
	private Role[] viewPrivacy;

	public Template() {}

	public Template(long id, Set<Question> questionList, String name, Qtype qType, Role[] editPrivacy, Role[] viewPrivacy) {
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
