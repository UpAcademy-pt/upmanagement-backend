package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Set;

public class AccountDTO extends EntityDTO{
	
	private long userId;
	private Set<QuestionnairePreviewDTO> pendingQuentionnaires;
	
	public AccountDTO() {}

	public AccountDTO(long id, long userId, Set<QuestionnairePreviewDTO> pendingQuentionnaires) {
		setId(id);
		this.userId = userId;
		this.pendingQuentionnaires = pendingQuentionnaires;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Set<QuestionnairePreviewDTO> getPendingQuentionnaires() {
		return pendingQuentionnaires;
	}

	public void setPendingQuentionnaires(Set<QuestionnairePreviewDTO> pendingQuentionnaires) {
		this.pendingQuentionnaires = pendingQuentionnaires;
	}

}
