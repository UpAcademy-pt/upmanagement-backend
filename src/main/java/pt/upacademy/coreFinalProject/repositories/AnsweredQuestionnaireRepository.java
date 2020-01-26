package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;

@RequestScoped
public class AnsweredQuestionnaireRepository extends EntityRepository<AnsweredQuestionnaire>{

	@Override
	protected Class<AnsweredQuestionnaire> getEntityClass() {
		return AnsweredQuestionnaire.class;
	}

	@Override
	protected String getAllEntities() {
		return AnsweredQuestionnaire.GET_ALL_ANSWEREDQUESTIONS;
	}
	
	public String getAllEntitiesId(long id) {
		return AnsweredQuestionnaire.GET_ALL_ANSWEREDQUESTIONS_ID;
	}

}
