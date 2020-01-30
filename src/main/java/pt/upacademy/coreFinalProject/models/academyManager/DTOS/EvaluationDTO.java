package pt.upacademy.coreFinalProject.models.academyManager.DTOS;

import java.util.Set;

import pt.upacademy.coreFinalProject.models.academyManager.Grade;
import pt.upacademy.coreFinalProject.models.core.DTOS.EntityDTO;

public class EvaluationDTO extends EntityDTO {

	private Long accountId;
	private Set<Grade> grades;
	private String comment;
	
	public EvaluationDTO() {}
	
	public EvaluationDTO(Long accountId, Set<Grade> grades, String comment) {
		this.accountId = accountId;
		this.grades = grades;
		this.comment = comment;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Set<Grade> getGrades() {
		return grades;
	}

	public void setGrades(Set<Grade> grades) {
		this.grades = grades;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
