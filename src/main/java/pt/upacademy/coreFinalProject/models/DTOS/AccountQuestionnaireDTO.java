package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;

import pt.upacademy.coreFinalProject.models.core.DTOS.EntityDTO;

public class AccountQuestionnaireDTO extends EntityDTO{
	private long userId;
	private List<QuestionnairePreviewDTO> pendingQuestionnaires;
		  	
	public AccountQuestionnaireDTO() {}
		  
	
	public AccountQuestionnaireDTO(long id, long userId, List<QuestionnairePreviewDTO> pendingQuentionnaires) {
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
