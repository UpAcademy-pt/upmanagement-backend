package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Template extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Qtype qType;
	private List<Question> questionList;
	private List<Role> editPrivacy;
	private List<Role> viewPrivacy;
	
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
	
	public List<Question> getQuestionList() {
		return questionList;
	}
	
	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
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

}
