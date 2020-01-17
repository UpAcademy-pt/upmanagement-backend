package pt.upacademy.coreFinalProject.controller;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.Repositories.AccountRepository;
import pt.upacademy.coreFinalProject.Services.AccountService;
import pt.upacademy.coreFinalProject.models.Account;

@Path("account")
@RequestScoped
public class AccountController extends EntityController<AccountService, AccountRepository, Account>{

}
