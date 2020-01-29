package pt.upacademy.coreFinalProject.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;

@RequestScoped
public class AccountService extends EntityService<AccountRepository, Account>{
	
	
//	public void addPendingQuestionnaireToAccount(long questionnaireId, long[] accountIds) {
//		repository.addPendingQuestionnaireToAccount(questionnaireId, accountIds);
//	}
	
	
	
	public Account getAccountByUserId(long userId) {
		long[] userAcademies = new long[] {1, 2}; //Para apagar depois da integração dos projetos
		long accountId;
		Account account = repository.getEntityByUserId(userId);
		if (account == null) {
			accountId = repository.addEntity(new Account(0, userId, userAcademies));
			account = repository.getEntity(accountId);
		}
		return account;
	}
	
	public List<Long> getAccountIdListByUserList(List<Long> ids){
		return repository.getAccountIdListByUserList(ids);
	}
	
}
