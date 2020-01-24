package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;

public class AccountDTO extends EntityDTO{
	
	private List<QuestionnaireDTO> pendingQuentionnaires;

	public List<QuestionnaireDTO> getPendingQuentionnaires() {
		return pendingQuentionnaires;
	}

	public void setPendingQuentionnaires(List<QuestionnaireDTO> pendingQuentionnaires) {
		this.pendingQuentionnaires = pendingQuentionnaires;
	}

}
