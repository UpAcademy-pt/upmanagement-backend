package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;

@RequestScoped
public class AccountRepository extends EntityRepository<Account>{

	@Override
	protected Class<Account> getEntityClass() {
		return Account.class;
	}

	@Override
	protected String getAllEntities() {
		return Account.GET_ALL_ACCOUNTS;
	}

	public String addPendingQuestionnaireToAccount(long id) {
		return Account.ADD_PENDING_QUESTIONNAIRE;
	}
	
}
