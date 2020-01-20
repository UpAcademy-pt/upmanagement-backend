package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.QuestionForum;


@ApplicationScoped
public class QuestionRepository extends EntityRepository <QuestionForum> {

	@Override
	protected Class<QuestionForum> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	protected String getAllEntitiesIds() {
		// TODO Auto-generated method stub
		return null;
	}

	protected String getEntitiesCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
