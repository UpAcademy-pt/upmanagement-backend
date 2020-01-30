package pt.upacademy.coreFinalProject.controllers.academyManager;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.academyManager.Declarations;
import pt.upacademy.coreFinalProject.models.academyManager.DTOS.DeclarationsDTO;
import pt.upacademy.coreFinalProject.models.academyManager.DTOS.MissedClassDTO;
import pt.upacademy.coreFinalProject.models.academyManager.converters.DeclarationsConverter;
import pt.upacademy.coreFinalProject.repositories.academyManager.DeclarationsRepository;
import pt.upacademy.coreFinalProject.services.academyManager.DeclarationsService;

@Path("academy-manager/declarations")
@RequestScoped
public class DeclarationsController extends EntityControllerDTO<DeclarationsService,DeclarationsRepository,DeclarationsConverter,Declarations,DeclarationsDTO>{

	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response sendDeclaration(DeclarationsDTO declarations) {
		try {
			service.sendDeclaration(converter.toEntity(declarations));
			return Response.ok().build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(400).entity(e.getMessage()).build(); 
		}
	}
	
	@GET
	@Path("/account/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DeclarationsDTO> getallbyReceiverId(@PathParam("id") int accountId) {
		return service.getAllDeclarationsByReceiverId(accountId).stream().map(E -> converter.toDTO(E)).collect(Collectors.toList());
	}
	
	@PUT
	@Path("/verify")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response update(DeclarationsDTO mclass) {
		try {
		service.update(converter.toEntity(mclass));
		return Response.ok().build();
	} catch (Exception e) {
		e.printStackTrace();
		return Response.status(400).entity(e.getMessage()).build(); 
	}
	}
}
