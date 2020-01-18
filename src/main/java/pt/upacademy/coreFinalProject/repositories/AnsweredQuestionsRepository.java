package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.AnsweredQuestions;

@RequestScoped
public class AnsweredQuestionsRepository extends EntityRepository<AnsweredQuestions>{

	@Override
	protected Class<AnsweredQuestions> getEntityClass() {
		return AnsweredQuestions.class;
	}

	@Override
	protected String getAllEntities() {
		return AnsweredQuestions.GET_ALL_ANSWEREDQUESTIONS;
	}

}
