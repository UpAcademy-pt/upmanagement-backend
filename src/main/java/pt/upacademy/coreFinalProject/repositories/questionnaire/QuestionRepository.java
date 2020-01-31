package pt.upacademy.coreFinalProject.repositories.questionnaire;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.questionnaire.Question;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;

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
