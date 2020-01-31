package pt.upacademy.coreFinalProject.repositories.lessons;

import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.lessons.AccountLessons;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;


@ApplicationScoped
public class AccountRepository extends EntityRepository <AccountLessons>{

	@Override
	protected Class<AccountLessons> getEntityClass() {
		return AccountLessons.class;
	}

	@Override
	protected String getAllEntities() {
		return AccountLessons.GET_ALL_LESSONS_ACCOUNTS;
	}

	protected String getAllEntitiesIds() {
		return AccountLessons.GET_ALL_LESSONS_ACCOUNTS_IDs;
	}

	protected String getEntitiesCount() {
		return AccountLessons.GET_LESSONS_ACCOUNT_COUNT;
	}
	
	protected String getAccountByUserById() {
		return AccountLessons.GET_LESSONS_ACCOUNT_BY_USERID;
	}
	
//	public Account getAccountByUserById(long id) {
//		TypedQuery<Account> query = entityManager.createNamedQuery(Account.GET_ACCOUNT_BY_USERID, Account.class);
//		query.setParameter("userId", id);
//		return query.getSingleResult();
//	}
	
	public AccountLessons getAccountByUserById(long id) {
	return entityManager.createNamedQuery(AccountLessons.GET_LESSONS_ACCOUNT_BY_USERID, AccountLessons.class).setParameter("userId", id).getResultList().stream().findFirst().orElse(null);
		
	}

	public void deleteAccountById(long id) {
		AccountLessons acc = entityManager.find(getEntityClass(), id);
		entityManager.remove(acc);
		
	}

}
