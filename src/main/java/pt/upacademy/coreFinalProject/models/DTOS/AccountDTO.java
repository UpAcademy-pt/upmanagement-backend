package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Map;

public class AccountDTO extends EntityDTO{
	
	//private Set<QuestionnaireDTO> pendingQuentionnaires;
	private Map<Long, String> pendingQuentionnaires;
 
	public AccountDTO() {}

	public AccountDTO(long id, Map<Long, String> pendingQuentionnaires) {
		setId(id);
		this.pendingQuentionnaires = pendingQuentionnaires;
	}

	public Map<Long, String> getPendingQuentionnaires() {
		return pendingQuentionnaires;
	}

	public void setPendingQuentionnaires(Map<Long, String> pendingQuentionnaires) {
		this.pendingQuentionnaires = pendingQuentionnaires;
	}

}
