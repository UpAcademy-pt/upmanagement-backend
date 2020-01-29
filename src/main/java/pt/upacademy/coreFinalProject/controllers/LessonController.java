package pt.upacademy.coreFinalProject.controllers;

import java.util.Collection;
import java.util.Collections;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.DTOS.LessonDTO;
import pt.upacademy.coreFinalProject.models.converters.LessonConverter;
import pt.upacademy.coreFinalProject.repositories.LessonRepository;
import pt.upacademy.coreFinalProject.services.LessonService;

@Path("/aulas/lessons")
@RequestScoped
public class LessonController extends EntityControllerDTO <LessonService, LessonRepository,LessonConverter, Lesson, LessonDTO> {

	public Collection<Lesson> getLessonsByEditionId(long id) {
		return service.getLessonsByEditionId(id);
	}
	
	public Collection<Lesson> getLessonByMaterialId(long id) {
		return service.getLessonByMaterialId(id);
	}
	
	@Override
	@DELETE
	@Path("/{id}")
	public String delete (@PathParam("id") long id) {
		Lesson deleteLesson = service.get(id);
		deleteLesson.setMaterials(Collections.emptyList());
		service.update(deleteLesson);
		service.delete(id);
		return "SuperDelete done!";
	}
	
}
