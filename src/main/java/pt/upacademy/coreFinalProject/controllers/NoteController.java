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
import pt.upacademy.coreFinalProject.models.DTOS.NoteDTO;
import pt.upacademy.coreFinalProject.models.converters.NoteConverter;
import pt.upacademy.coreFinalProject.repositories.NoteRepository;
import pt.upacademy.coreFinalProject.services.NoteService;



@RequestScoped
@Path("notes")
public class NoteController extends EntityController<NoteService, NoteRepository, NoteConverter, Note, NoteDTO>{

	@Inject
	protected NoteService NS;
	
	@GET
	@Path("/notes/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<NoteDTO> getNotesByLessonId(@PathParam("id") long id) {
		return NS.getNotesByLessonId(id);
	}

	
	
	
	
	
}
