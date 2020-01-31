package pt.upacademy.coreFinalProject.services.lessons;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.lessons.AccountLessons;
import pt.upacademy.coreFinalProject.repositories.lessons.AccountRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class AccountService extends EntityService<AccountRepository, AccountLessons> {

//	@Inject
//	protected 
	
	public AccountLessons getAccountByUserById(long userId) {
	
		if(repository.getAccountByUserById(userId) == null) { 
			AccountLessons newAccount = new AccountLessons();
						
			newAccount.setUserId(userId);
			 repository.addEntity(newAccount);
			 return repository.getAccountByUserById(userId);
			
		}
		else {
		return repository.getAccountByUserById(userId);
		}
	}
	
	public AccountLessons createAccount (AccountLessons account) {
		repository.addEntity(account);
		return account;
	}
	
	public void deleteAcountById(long id) {
		repository.deleteAccountById(id);
		
	}
}
