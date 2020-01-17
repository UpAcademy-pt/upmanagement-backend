package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.DTOS.LessonDTO;


@ApplicationScoped
public class LessonRepository extends EntityRepository <Lesson, LessonDTO> {

	@Override
	protected Class<Lesson> getEntityClass() {
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
