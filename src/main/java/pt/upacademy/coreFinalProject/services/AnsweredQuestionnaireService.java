package pt.upacademy.coreFinalProject.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;
import pt.upacademy.coreFinalProject.repositories.AnsweredQuestionnaireRepository;

@RequestScoped
public class AnsweredQuestionnaireService extends EntityService<AnsweredQuestionnaireRepository, AnsweredQuestionnaire>{
    
	@Inject
	AnsweredQuestionnaireRepository AnsweredQuestionnaire_Repository;
	
	public String getQuestFromAcc(long id) {
		return AnsweredQuestionnaire_Repository.getAllEntitiesId(id);
	}
    
}
