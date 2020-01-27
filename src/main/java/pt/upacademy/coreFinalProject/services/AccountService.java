package pt.upacademy.coreFinalProject.services;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;

@RequestScoped
public class AccountService extends EntityService<AccountRepository, Account> {

	
	public Account getAccountByUserById(long userId) {
	
		if(repository.getAccountByUserById(userId) == null) { 
			Account newAccount = new Account();
						
			newAccount.setUserId(userId);
			 repository.addEntity(newAccount);
			 return repository.getAccountByUserById(userId);
			
		}
		else {
		return repository.getAccountByUserById(userId);
		}
	}
	
	public Account createAccount (Account account) {
		repository.addEntity(account);
		return account;
	}
	
	
}
