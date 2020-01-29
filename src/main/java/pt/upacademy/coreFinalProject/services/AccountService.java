package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;

@RequestScoped
public class AccountService extends EntityService<AccountRepository, Account>{
	
	
//	public void addPendingQuestionnaireToAccount(long questionnaireId, long[] accountIds) {
//		repository.addPendingQuestionnaireToAccount(questionnaireId, accountIds);
//	}
	
	
	
}
