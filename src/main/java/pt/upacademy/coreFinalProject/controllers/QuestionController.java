package pt.upacademy.coreFinalProject.controllers;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.models.QuestionForum;
import pt.upacademy.coreFinalProject.repositories.QuestionRepository;
import pt.upacademy.coreFinalProject.services.AnswerService;
import pt.upacademy.coreFinalProject.services.QuestionService;

@Path("/aulas/questions")
@RequestScoped
public class QuestionController extends EntityController <QuestionService, QuestionRepository, QuestionForum>{
	
	@Inject
	protected QuestionService QS;
	@Inject
	protected AnswerService AS;
	
	@GET
	@Path("/edition/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<QuestionForum> getQuestionsByEditionId(@PathParam("id") long id) {
		return QS.getQuestionsByEditionId(id);
	}
	
	@Override
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public void delete(@PathParam("id") long id) {
		AS.deleteAnswersByQuestionId(id);
		service.delete(id);
	}
	
	
}
