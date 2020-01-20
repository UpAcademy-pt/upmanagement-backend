package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.ApplicationScoped;

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

}
