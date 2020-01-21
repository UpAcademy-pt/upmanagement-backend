package pt.upacademy.coreFinalProject.repositories;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;

import pt.upacademy.coreFinalProject.models.Account;


@ApplicationScoped
public class AccountRepository extends EntityRepository <Account>{

	@Override
	protected Class<Account> getEntityClass() {
		return Account.class;
	}

	@Override
	protected String getAllEntities() {
		return Account.GET_ALL_ACCOUNTS;
	}

	protected String getAllEntitiesIds() {
		return Account.GET_ALL_ACCOUNT_IDs;
	}

	protected String getEntitiesCount() {
		return Account.GET_ACCOUNT_COUNT;
	}
	
	protected String getAccountByUserById() {
		return Account.GET_ACCOUNT_BY_USERID;
	}
	
	public Account getAccountByUserById(long id) {
		TypedQuery<Account> query = entityManager.createNamedQuery(Account.GET_ACCOUNT_BY_USERID, Account.class);
		query.setParameter("userId", id);
		return query.getSingleResult();
	}

}
