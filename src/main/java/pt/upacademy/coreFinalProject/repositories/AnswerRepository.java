package pt.upacademy.coreFinalProject.repositories;

import java.util.Collection;
import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.AnswerForum;

@ApplicationScoped
public class AnswerRepository extends EntityRepository<AnswerForum> {

	@Override
	protected Class<AnswerForum> getEntityClass() {
		return AnswerForum.class;
	}

	@Override
	protected String getAllEntities() {
		return AnswerForum.GET_ALL_ANSWERS;
	}

	public Collection<AnswerForum> getAnswersByQuestionId(long id) {
		return entityManager.createNamedQuery(AnswerForum.GET_ANSWERS_BY_QUESTION_ID, AnswerForum.class)
				.setParameter("questionId", id).getResultList();

	}
	
	public void deleteAnswersByQuestionId (long id) {
		entityManager.createNamedQuery(AnswerForum.DELETE_ANSWER_BY_QUESTION_ID)
				.setParameter("questionId", id).executeUpdate();
		}

}
