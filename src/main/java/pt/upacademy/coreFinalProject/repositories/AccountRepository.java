package pt.upacademy.coreFinalProject.repositories;

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
	
}
