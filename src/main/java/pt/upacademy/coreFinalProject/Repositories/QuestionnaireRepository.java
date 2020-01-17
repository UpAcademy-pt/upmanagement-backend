package pt.upacademy.coreFinalProject.Repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Questionnaire;

@RequestScoped
public class QuestionnaireRepository extends EntityRepository_<Questionnaire>{

	@Override
	protected Class<Questionnaire> getEntityClass() {
		return Questionnaire.class;
	}

	@Override
	protected String getAllEntities() {
		return Questionnaire.GET_ALL_QUESTIONNAIRES;
	}

}
