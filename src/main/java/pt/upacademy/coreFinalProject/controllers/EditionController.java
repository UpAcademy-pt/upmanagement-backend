package pt.upacademy.coreFinalProject.controllers;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;
import pt.upacademy.coreFinalProject.models.converters.EditionConverter;
import pt.upacademy.coreFinalProject.repositories.EditionRepository;
import pt.upacademy.coreFinalProject.services.EditionService;


@RequestScoped
@Path ("edition")
public class EditionController extends EntityControllerDTO <EditionService, EditionRepository, EditionConverter, Edition, EditionDTO> {
	
	@Inject
	protected EditionService service;
	
	@Inject
	protected EditionConverter converter;
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String create(EditionDTO user) {
			service.create(converter.toEntity(user));
			return "edition created";
			
	}

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
			List<EditionDTO> entList =	service.get().stream().map(E -> converter.toDTO(E)).collect(Collectors.toList());
				return "entity retrieved : " +  entList;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String get(@PathParam("id") long id) {
		EditionDTO ent = converter.toDTO(service.get(id));
		return "entity retrieved : " +  ent;
	}
}
