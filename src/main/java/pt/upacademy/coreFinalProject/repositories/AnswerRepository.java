package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.AnswerForum;



@ApplicationScoped
public class AnswerRepository extends EntityRepository <AnswerForum> {

	@Override
	protected Class<AnswerForum> getEntityClass() {
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
