package pt.upacademy.coreFinalProject.controllers.lessons;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pt.upacademy.coreFinalProject.controllers.core.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.lessons.AccountLessons;
import pt.upacademy.coreFinalProject.models.lessons.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.lessons.converters.AccountConverter;
import pt.upacademy.coreFinalProject.repositories.lessons.AccountRepository;
import pt.upacademy.coreFinalProject.services.lessons.AccountService;

@RequestScoped
@Path ("/aulas/accounts")
public class AccountController extends EntityControllerDTO <AccountService, AccountRepository,AccountConverter, AccountLessons, AccountDTO>{
	@Inject
	protected AccountConverter converter;

	@GET
	@Path("/user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAccountByUserById (@PathParam("id") long userId) {
		try {
			AccountDTO account = converter.toDTO(service.getAccountByUserById(userId));

			return Response.ok().entity(account).build(); 
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response.status(400).entity(e.getMessage()).build(); 
		}
	}
}
