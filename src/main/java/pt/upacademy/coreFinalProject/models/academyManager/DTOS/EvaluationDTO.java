package pt.upacademy.coreFinalProject.models.academyManager.DTOS;

import java.util.List;

public class EvaluationDTO extends EntityDTO {

	private Long accountId;
	private List<Long> gradesIds;
	private String comment;
	
	public EvaluationDTO() {}
	
	public EvaluationDTO(Long accountId, List<Long> gradesIds, String comment) {
		this.accountId = accountId;
		this.gradesIds = gradesIds;
		this.comment = comment;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public List<Long> getGradesIds() {
		return gradesIds;
	}

	public void setGradesIds(List<Long> gradesIds) {
		this.gradesIds = gradesIds;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
