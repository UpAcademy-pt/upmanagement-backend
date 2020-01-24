package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Set;

public class AccountDTO extends EntityDTO{
	
	private Set<QuestionnaireDTO> pendingQuentionnaires;
 
	public AccountDTO() {}

	public AccountDTO(long id, Set<QuestionnaireDTO> pendingQuentionnaires) {
		setId(id);
		this.pendingQuentionnaires = pendingQuentionnaires;
	}

	public Set<QuestionnaireDTO> getPendingQuentionnaires() {
		return pendingQuentionnaires;
	}

	public void setPendingQuentionnaires(Set<QuestionnaireDTO> pendingQuentionnaires) {
		this.pendingQuentionnaires = pendingQuentionnaires;
	}

}
