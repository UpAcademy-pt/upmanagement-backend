package pt.upacademy.coreFinalProject.Repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Answer;

@RequestScoped
public class AnswerRepository extends EntityRepository<Answer>{

	@Override
	protected Class<Answer> getEntityClass() {
		return Answer.class;
	}

	@Override
	protected String getAllEntities() {
		return Answer.GET_ALL_ANSWERS;
	}

}
