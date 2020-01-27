package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;
import java.util.Set;

public class AccountDTO extends EntityDTO{
	private long userId;
	private List<QuestionnairePreviewDTO> pendingQuentionnaires;
		  	
	public AccountDTO() {}
		  
	
	public AccountDTO(long id, long userId, List<QuestionnairePreviewDTO> pendingQuentionnaires) {
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


	public List<QuestionnairePreviewDTO> getPendingQuentionnaires() {
		return pendingQuentionnaires;
	}


	public void setPendingQuentionnaires(List<QuestionnairePreviewDTO> pendingQuentionnaires) {
		this.pendingQuentionnaires = pendingQuentionnaires;
	}
	
	

}
