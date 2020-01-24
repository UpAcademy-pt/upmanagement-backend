package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Set;

import pt.upacademy.coreFinalProject.models.Qtype;
import pt.upacademy.coreFinalProject.models.Role;

public class QuestionnaireDTO extends EntityDTO{

	private Set<QuestionDTO> questionList;
	private String name;
	private long[] accountIdList;
	private Qtype qType;
	private Role[] editPrivacy;
	private Role[] viewPrivacy;
	
	public QuestionnaireDTO() {}

	public QuestionnaireDTO(long id, Set<QuestionDTO> questionList, String name, long[] accountIdList, Qtype qType,
			Role[] editPrivacy, Role[] viewPrivacy) {
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
