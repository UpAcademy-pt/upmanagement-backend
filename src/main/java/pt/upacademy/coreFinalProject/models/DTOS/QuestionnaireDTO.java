package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import pt.upacademy.coreFinalProject.models.Answer;
import pt.upacademy.coreFinalProject.models.Qtype;
import pt.upacademy.coreFinalProject.models.Role;

public class QuestionnaireDTO extends EntityDTO{

	private Set<QuestionDTO> questionList;
	private String name;
	private long accountId;
	private Qtype qType;
	private String[] editPrivacy;
	private String[] viewPrivacy;
	private Set<AnswerDTO> answerList;
	private int score;
	
	public QuestionnaireDTO() {}

	public QuestionnaireDTO(long id, Set<QuestionDTO> questionList, String name, long accountId, Qtype qType,
			String[] editPrivacy, String[] viewPrivacy, Set<AnswerDTO> answerList, int score, long createDate, long lastModifiedDate) {
		setId(id);
		setCreateDate(createDate);
		setLastModifiedDate(lastModifiedDate);
		this.questionList = questionList;
		this.name = name;
		this.accountId = accountId;
		this.qType = qType;
		this.editPrivacy = editPrivacy;
		this.viewPrivacy = viewPrivacy;
		this.answerList = answerList;
		this.score = score;
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

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public Qtype getqType() {
		return qType;
	}

	public void setqType(Qtype qType) {
		this.qType = qType;
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

	public Set<AnswerDTO> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(Set<AnswerDTO> answerList) {
		this.answerList = answerList;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
}
