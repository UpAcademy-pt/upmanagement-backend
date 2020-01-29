package pt.upacademy.coreFinalProject.services;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.repositories.LessonRepository;


@RequestScoped
public class LessonService extends EntityService <LessonRepository, Lesson> {

	public Collection<Lesson> getLessonsByEditionId(long id) {
		return repository.getLessonsByEditionId(id);
	}
	
	public Collection<Lesson> getLessonByMaterialId(long id) {
		return repository.getLessonByMaterialId(id);
	}

}
