package pt.upacademy.coreFinalProject.controllers;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.models.AnswerForum;
import pt.upacademy.coreFinalProject.repositories.AnswerRepository;
import pt.upacademy.coreFinalProject.services.AnswerService;

@Path("/aulas/answers") 
@RequestScoped
public class AnswerController extends EntityController <AnswerService, AnswerRepository, AnswerForum>{
	
	@Inject
	AnswerService AS;
	
	@GET
	@Path("/edition/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<AnswerForum> getAnswersByQuestionId(@PathParam("id") long id) {
		return AS.getAnswersByQuestionId(id);
	}
}
