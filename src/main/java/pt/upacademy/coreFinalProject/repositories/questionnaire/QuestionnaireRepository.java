package pt.upacademy.coreFinalProject.repositories.questionnaire;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.questionnaire.Questionnaire;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;

@RequestScoped
public class QuestionnaireRepository extends EntityRepository<Questionnaire>{

	@Override
	protected Class<Questionnaire> getEntityClass() {
		return Questionnaire.class;
	}

	@Override
	protected String getAllEntities() {
		return Questionnaire.GET_ALL_QUESTIONNAIRES;
	}

	public List<Questionnaire> getEmptyQuestionnairesByAccountId(long id) {
		return entityManager.createNamedQuery(Questionnaire.GET_ALL_QUESTIONNAIRES_NOT_ANSWERED, Questionnaire.class).setParameter("id", id).getResultList();
	}
	
	public List<Questionnaire> getAnsweredQuestionnairesByAccountId(long id) {
		return entityManager.createNamedQuery(Questionnaire.GET_ALL_ANSWERED_QUESTIONNAIRES, Questionnaire.class).setParameter("id", id).getResultList();
	
	}
	
}
