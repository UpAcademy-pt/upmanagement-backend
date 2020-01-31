package pt.upacademy.coreFinalProject.services.lessons;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.lessons.Lesson;
import pt.upacademy.coreFinalProject.repositories.lessons.LessonRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;


@RequestScoped
public class LessonService extends EntityService <LessonRepository, Lesson> {

	public Collection<Lesson> getLessonsByEditionId(long id) {
		return repository.getLessonsByEditionId(id);
	}
	
	public Collection<Lesson> getLessonByMaterialId(long id) {
		return repository.getLessonByMaterialId(id);
	}

}
