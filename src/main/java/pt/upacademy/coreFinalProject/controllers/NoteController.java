package pt.upacademy.coreFinalProject.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.models.Note;
import pt.upacademy.coreFinalProject.repositories.NoteRepository;
import pt.upacademy.coreFinalProject.services.NoteService;



@RequestScoped
@Path("/aulas/notes")
public class NoteController extends EntityController<NoteService, NoteRepository, Note>{

	@Inject
	protected NoteService NS;
	
	@GET
	@Path("/lesson/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Note> getNotesByLessonId(@PathParam("id") long id) {
		return NS.getNotesByLessonId(id);
	}

	
	
	
	
	
}
