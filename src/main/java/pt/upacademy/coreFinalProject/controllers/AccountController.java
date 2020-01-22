package pt.upacademy.coreFinalProject.controllers;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.converters.AccountConverter;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;
import pt.upacademy.coreFinalProject.services.AccountService;

@Path("accounts")
@RequestScoped
public class AccountController extends EntityControllerDTO<AccountService,AccountRepository,AccountConverter,Account,AccountDTO> {
	
	@GET
	@Path("/q")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<AccountDTO> getByUserRole(@QueryParam("role") String role) {
		return service.getByUserRole(role).stream().map(account -> converter.toDTO(account)).collect(Collectors.toList());
	}

}
