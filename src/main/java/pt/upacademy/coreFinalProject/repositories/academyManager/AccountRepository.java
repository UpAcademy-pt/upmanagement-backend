package pt.upacademy.coreFinalProject.repositories.academyManager;

import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.AccountAcademy;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;

@RequestScoped
public class AccountRepository extends EntityRepository<AccountAcademy> {

	@Override
	protected Class<AccountAcademy> getEntityClass() {
		return AccountAcademy.class;
	}

	@Override
	protected String getAllEntities() {
		return AccountAcademy.GET_ALL_ACADEMY_ACCOUNTS;
	}
	
	public Collection<AccountAcademy> getByUserIds(Collection<Long> userIds) {
		return entityManager.createNamedQuery(AccountAcademy.GET_ACADEMY_ACCOUNTS_BY_USER_IDS, getEntityClass()).setParameter("usersIds", userIds).getResultList();
	}
	
	public List<AccountAcademy> getByUserId(long userId) {
		return entityManager.createNamedQuery(AccountAcademy.GET_ACADEMY_ACCOUNT_BY_USER_ID, getEntityClass()).setParameter("userId", userId).getResultList();
	}

}
