package pt.upacademy.coreFinalProject.controllers;


import java.util.Collection;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.converters.AccountConverter;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;
import pt.upacademy.coreFinalProject.services.AccountService;



@RequestScoped
@Path ("/aulas/account")
public class AccountController extends EntityControllerDTO <AccountService, AccountRepository,AccountConverter, Account, AccountDTO>{

	@Inject
	protected AccountConverter converter;
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createAccount(Account account) {
		try {
			Account newAccount = service.createAccount(account);
			 
			 return Response.ok().entity(account.getId()).build(); 
			}
			 catch (Exception e) {
				e.printStackTrace();
				return Response.status(400).entity(e.getMessage()).build(); 
			}
	}
	
	@GET
	@Path("/user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAccountByUserById (@PathParam("id") long userId) {
		
		try {
		AccountDTO account = converter.toDTO(service.getAccountByUserById(userId));
		 
		 return Response.ok().entity(account.getId()).build(); 
		}
		 catch (Exception e) {
			e.printStackTrace();
			return Response.status(400).entity(e.getMessage()).build(); 
		}
		
	
	}
	


	
	
}
