package pt.upacademy.coreFinalProject.repositories;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Account;

@RequestScoped
public class AccountRepository extends EntityRepository<Account> {

	@Override
	protected Class<Account> getEntityClass() {
		return Account.class;
	}

	@Override
	protected String getAllEntities() {
		return Account.GET_ALL_ACCOUNTS;
	}
	
	public Collection<Account> getByUserIds(Collection<Long> userIds) {
		return entityManager.createNamedQuery(Account.GET_ACCOUNTS_BY_USER_IDS, getEntityClass()).setParameter("usersIds", userIds).getResultList();
	}
	
	public Collection<Account> getByUserId(long userId) {
		return entityManager.createNamedQuery(Account.GET_ACCOUNT_BY_USER_ID, getEntityClass()).setParameter("usersId", userId).getResultList();
	}

}
