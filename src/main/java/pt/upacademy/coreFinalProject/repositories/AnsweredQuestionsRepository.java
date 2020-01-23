package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;

@RequestScoped
public class AnsweredQuestionsRepository extends EntityRepository<AnsweredQuestionnaire>{

	@Override
	protected Class<AnsweredQuestionnaire> getEntityClass() {
		return AnsweredQuestionnaire.class;
	}

	@Override
	protected String getAllEntities() {
		return AnsweredQuestionnaire.GET_ALL_ANSWEREDQUESTIONS;
	}

}
