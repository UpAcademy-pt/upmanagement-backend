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
import javax.persistence.OneToMany;

@Entity
public class Template extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany( cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "questionnaire", fetch = FetchType.EAGER)
	private Set<Question> questionList;
	private String name;
	private Qtype qType;
	@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<Role> editPrivacy;
	@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<Role> viewPrivacy;

	public Template() {}

	public Template(long id, Set<Question> questionList, String name, Qtype qType, Set<Role> editPrivacy, Set<Role> viewPrivacy) {
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
	
	

}
