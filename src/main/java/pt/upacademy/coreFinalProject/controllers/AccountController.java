package pt.upacademy.coreFinalProject.controllers;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.User;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;
import pt.upacademy.coreFinalProject.services.AccountService;
import pt.upacademy.coreFinalProject.services.UserService;


@RequestScoped
@Path ("account")
public class AccountController extends EntityController <AccountService, AccountRepository, Account>{

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Account getAccountByUserById (@PathParam("id") long userId) {
		return service.getAccountByUserById(userId);
	}

	
	
	
}
