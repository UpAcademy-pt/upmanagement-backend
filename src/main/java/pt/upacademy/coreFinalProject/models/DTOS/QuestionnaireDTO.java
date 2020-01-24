package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;

import pt.upacademy.coreFinalProject.models.Qtype;
import pt.upacademy.coreFinalProject.models.Role;

public class QuestionnaireDTO extends EntityDTO{

	private List<QuestionDTO> questionList;
	private String name;
	private List<Long> accountIdList;
	private Qtype qType;
	private List<Role> editPrivacy;
	private List<Role> viewPrivacy;
	
	public List<QuestionDTO> getQuestionList() {
		return questionList;
	}
	
	public void setQuestionList(List<QuestionDTO> questionList) {
		this.questionList = questionList;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Long> getAccountIdList() {
		return accountIdList;
	}
	
	public void setAccountIdList(List<Long> accountIdList) {
		this.accountIdList = accountIdList;
	}
	
	public Qtype getqType() {
		return qType;
	}
	
	public void setqType(Qtype qType) {
		this.qType = qType;
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
