package pt.upacademy.coreFinalProject.repositories;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.Materials;


@ApplicationScoped
public class LessonRepository extends EntityRepository <Lesson> {

	@Override
	protected Class<Lesson> getEntityClass() {
		return Lesson.class;
	}

	@Override
	protected String getAllEntities() {
		
		return Lesson.GET_ALL_LESSONS;
	}
	
	public Collection<Materials> getMaterialsInLesson (long id){
		return entityManager.createNamedQuery(Lesson.GET_MATERIALS_IN_LESSON, Materials.class).setParameter("lessonId", id).getResultList();
		
		
	}

	
	

}
