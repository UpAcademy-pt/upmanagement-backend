package pt.upacademy.coreFinalProject.controllers;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;
import pt.upacademy.coreFinalProject.models.converters.EditionConverter;
import pt.upacademy.coreFinalProject.repositories.EditionRepository;
import pt.upacademy.coreFinalProject.services.EditionService;


@RequestScoped
@Path ("/aulas/editions")
public class EditionController extends EntityControllerDTO <EditionService, EditionRepository, EditionConverter, Edition, EditionDTO> {
	
	@Inject
	protected EditionService service;
	
	@GET
	@Path("accounts/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<EditionDTO> getbyAccountId(@PathParam("id") long id) {
		Collection<EditionDTO> ent = service.getbyAccountId(id);
		return ent;
	}
}

	

