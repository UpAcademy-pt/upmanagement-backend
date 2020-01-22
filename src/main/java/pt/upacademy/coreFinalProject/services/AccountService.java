package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.BadRequestException;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.User;
import pt.upacademy.coreFinalProject.models.DTOS.UserDTO;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;

@RequestScoped
public class AccountService extends EntityService<AccountRepository, Account> {

//	@Inject
//	UserService userServ;
	
	
	@Override
	public long create(Account account) {
		if(account.getUserId() == 0) {
			 throw new BadRequestException("Please enter a userId");
			 			}
		if(repository.getAccountByUserById(account.getUserId()) != null) { // TODO: testar
			throw new BadRequestException("User already exists in an account");
			
		}
		else {
		return repository.addEntity(account);
		}
	}
	
	

	
	
	public Account getAccountByUserById(long userId) {
	
		if(repository.getAccountByUserById(userId) == null) {
			Account newAccount = new Account();
						
			newAccount.setUserId(userId);
			return newAccount;
			
		}
		else {
		return repository.getAccountByUserById(userId);
		}
	}
	
}
