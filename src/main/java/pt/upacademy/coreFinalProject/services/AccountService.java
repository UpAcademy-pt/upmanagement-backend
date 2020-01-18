package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;

@RequestScoped
public class AccountService extends EntityService<AccountRepository,Account,AccountDTO> {
	
}
