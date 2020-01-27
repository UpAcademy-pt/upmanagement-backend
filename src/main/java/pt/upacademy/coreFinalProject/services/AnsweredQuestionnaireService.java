package pt.upacademy.coreFinalProject.services;



import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;
import pt.upacademy.coreFinalProject.repositories.AnsweredQuestionnaireRepository;

@RequestScoped
public class AnsweredQuestionnaireService extends EntityService<AnsweredQuestionnaireRepository, AnsweredQuestionnaire>{
    
	@Inject
	AnsweredQuestionnaireRepository ANSWEREDQUESTIONNAIRE_REPOSITORY;
	
	public List<AnsweredQuestionnaire> getQuestFromAcc(long id) {
		return ANSWEREDQUESTIONNAIRE_REPOSITORY.getAllEntitiesId(id);
	}
    
}
