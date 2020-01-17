package pt.upacademy.coreFinalProject.controller;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;
import pt.upacademy.coreFinalProject.services.AccountService;



@Path("account")
@RequestScoped
public class AccountController extends EntityController_<AccountService, AccountRepository, Account>{

}
