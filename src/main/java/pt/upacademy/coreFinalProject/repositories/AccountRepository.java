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

	public Account getEntityByUserId(long userId) {
		List<Account> accountList = entityManager.createNamedQuery(Account.GET_ACCOUNT_BY_USERID, Account.class).setParameter("id", userId).getResultList();
		if (accountList.isEmpty()) {
			return null;
		} else {
		return accountList.get(0);
		}
	}
	
	public List<Long> getAccountIdListByUserList(List<Long> ids){
		return entityManager.createNamedQuery(Account.GET_ACCOUNT_ID_LIST_BY_USERID_LIST, Long.class).setParameter("ids", ids).getResultList();
	}
	
}
