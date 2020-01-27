package pt.upacademy.coreFinalProject.repositories;

import java.util.List;

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
	
	public List<AnsweredQuestionnaire> getAllEntitiesId(long id) {
		return entityManager.createNamedQuery(AnsweredQuestionnaire.GET_ALL_ANSWEREDQUESTIONS_ID, AnsweredQuestionnaire.class).setParameter("id", id).getResultList();
	}

}
