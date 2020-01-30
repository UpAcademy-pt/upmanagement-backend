package pt.upacademy.coreFinalProject.repositories.lessons;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.lessons.QuestionForum;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;


@ApplicationScoped
public class QuestionRepository extends EntityRepository <QuestionForum> {

	@Override
	protected Class<QuestionForum> getEntityClass() {		
		return QuestionForum.class;
	}

	@Override
	protected String getAllEntities() {
		return QuestionForum.GET_ALL_QUESTIONS;
	}

	protected String getQuestionsByEditionId() {
		return QuestionForum.GET_QUESTIONS_BY_EDITION_ID;
	}
	
	public Collection<QuestionForum> getQuestionsByEditionId(long id) {
		return entityManager.createNamedQuery(QuestionForum.GET_QUESTIONS_BY_EDITION_ID, QuestionForum.class)
				.setParameter("editionId", id).getResultList();
	}
}
