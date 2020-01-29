package pt.upacademy.coreFinalProject.repositories;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Account;
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

	public void addPendingQuestionnaireToAccount(long questionnaireId, long[] accountIds) {
		entityManager.createNamedQuery(Account.ADD_PENDING_QUESTIONNAIRE).setParameter("questionnaireId", questionnaireId).setParameter("id", accountIds);
	}
	
	public Account getEntityByUserId(long userId) {
		List<Account> accountList = entityManager.createNamedQuery(Account.GET_ACCOUNT_BY_USERID, Account.class).setParameter("id", userId).getResultList();
		if (accountList.isEmpty()) {
			return null;
		}
		return accountList.get(0);
	}
	
}
