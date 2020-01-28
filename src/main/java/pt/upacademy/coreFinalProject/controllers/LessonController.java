package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.DTOS.LessonDTO;
import pt.upacademy.coreFinalProject.models.converters.LessonConverter;
import pt.upacademy.coreFinalProject.repositories.LessonRepository;
import pt.upacademy.coreFinalProject.services.LessonService;

@Path("/aulas/lessons")
@RequestScoped
public class LessonController extends EntityControllerDTO <LessonService, LessonRepository,LessonConverter, Lesson, LessonDTO> {

//	@Inject
//	protected LessonConverter converter;
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
//	public String create(LessonDTO lessonDto) {
//		return "Create works!";
//	}
	
}
