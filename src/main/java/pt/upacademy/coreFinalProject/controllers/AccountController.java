package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.converters.AccountConverter;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;
import pt.upacademy.coreFinalProject.services.AccountService;

@Path("accounts")
@RequestScoped
public class AccountController extends EntityControllerDTO<AccountService,AccountRepository,AccountConverter,Account,AccountDTO> {

	@Override
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String create(AccountDTO account) {
		System.out.println("Sucesso!");
		return "Success Again!";
	}
	
	@Override
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public AccountDTO get(@PathParam("id") long id) {
		return new AccountDTO(1, 30, null,"MSc","Biochem","www",1234,"www",null,null,null);
	}
	
	@Override
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String update(AccountDTO user) {
		System.out.println("Update funciona");
		return "Update Done!";
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String delete(@PathParam("id") long id) {
		System.out.println("Delete funciona");
		return "Delete Done!";
	}
}
