package pt.upacademy.coreFinalProject.Repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Question;

@RequestScoped
public class QuestionRepository extends EntityRepository<Question> {

	@Override
	protected Class<Question> getEntityClass() {
		return Question.class;
	}

	@Override
	protected String getAllEntities() {
		return Question.GET_ALL_QUESTIONS;
	}

}
