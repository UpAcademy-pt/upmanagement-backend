package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Set;

public class AccountDTO extends EntityDTO{
	
	private Set<QuestionnairePreviewDTO> pendingQuentionnaires;
	
	public AccountDTO() {}

	public AccountDTO(long id, Set<QuestionnairePreviewDTO> pendingQuentionnaires) {
		setId(id);
		this.pendingQuentionnaires = pendingQuentionnaires;
	}

	public Set<QuestionnairePreviewDTO> getPendingQuentionnaires() {
		return pendingQuentionnaires;
	}

	public void setPendingQuentionnaires(Set<QuestionnairePreviewDTO> pendingQuentionnaires) {
		this.pendingQuentionnaires = pendingQuentionnaires;
	}

}
