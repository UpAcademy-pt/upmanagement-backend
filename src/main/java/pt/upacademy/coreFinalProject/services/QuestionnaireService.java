package pt.upacademy.coreFinalProject.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionnairePreviewDTO;
import pt.upacademy.coreFinalProject.repositories.QuestionnaireRepository;

@RequestScoped
public class QuestionnaireService extends EntityService<QuestionnaireRepository, Questionnaire> {

	@Inject
	AccountService ACCOUNT_SERVICE;
	
//	public long create(Questionnaire entity) {
//		ACCOUNT_SERVICE.addPendingQuestionnaireToAccount(entity.getId(), entity.getAccountIdList());
//		return repository.addEntity(entity);
//	}
	

	public List<QuestionnairePreviewDTO> getEmptyQuestionnairesByAccountId(long id) {
		return repository.getEmptyQuestionnairesByAccountId(id);
	}
    
	public List<QuestionnairePreviewDTO> getAnsweredQuestionnairesByAccountId(long id) {
		return repository.getAnsweredQuestionnairesByAccountId(id);
	}
}
