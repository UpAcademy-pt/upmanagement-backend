package pt.upacademy.coreFinalProject.repositories.academyManager;

import pt.upacademy.coreFinalProject.models.academyManager.Grade;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;

public class GradeRepository extends EntityRepository<Grade> {

	@Override
	protected Class<Grade> getEntityClass() {
		return Grade.class;
	}

	@Override
	protected String getAllEntities() {
		return Grade.GET_ALL_GRADES;
	}

}
