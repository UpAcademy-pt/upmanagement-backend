package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;
import java.util.Set;

public class AccountDTO extends EntityDTO{
	private long userId;
	private List<QuestionnairePreviewDTO> pendingQuestionnaires;
		  	
	public AccountDTO() {}
		  
	
	public AccountDTO(long id, long userId, List<QuestionnairePreviewDTO> pendingQuentionnaires) {
		 setId(id);
		 this.userId = userId;
		 this.pendingQuestionnaires = pendingQuentionnaires;
	}
		  
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public List<QuestionnairePreviewDTO> getPendingQuestionnaires() {
		return pendingQuestionnaires;
	}


	public void setPendingQuestionnaires(List<QuestionnairePreviewDTO> pendingQuentionnaires) {
		this.pendingQuestionnaires = pendingQuentionnaires;
	}
	
	

}
