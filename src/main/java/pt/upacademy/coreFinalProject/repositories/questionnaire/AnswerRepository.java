package pt.upacademy.coreFinalProject.repositories.questionnaire;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.questionnaire.Answer;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;

@RequestScoped
public class AnswerRepository extends EntityRepository<Answer>{

	@Override
	protected Class<Answer> getEntityClass() {
		return Answer.class;
	}

	@Override
	protected String getAllEntities() {
		return Answer.GET_ALL_ANSWERS_;
	}

}
