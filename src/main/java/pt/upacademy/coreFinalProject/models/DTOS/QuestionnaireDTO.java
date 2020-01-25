package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import pt.upacademy.coreFinalProject.models.Qtype;
import pt.upacademy.coreFinalProject.models.Role;

public class QuestionnaireDTO extends EntityDTO{

	private Set<QuestionDTO> questionList;
	private String name;
	private long[] accountIdList;
	private Qtype qType;
	private Set<Role> editPrivacy;
	private Set<Role> viewPrivacy;
	
	public QuestionnaireDTO() {}

	public QuestionnaireDTO(long id, Set<QuestionDTO> questionList, String name, long[] accountIdList, Qtype qType,
			Set<Role> editPrivacy, Set<Role> viewPrivacy) {
		setId(id);
		this.questionList = questionList;
		this.name = name;
		this.accountIdList = accountIdList;
		this.qType = qType;
		this.editPrivacy = editPrivacy;
		this.viewPrivacy = viewPrivacy;
	}

	public Set<QuestionDTO> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(Set<QuestionDTO> questionList) {
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
