package pt.upacademy.coreFinalProject.repositories.questionnaire;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.questionnaire.AccountQuestionnaire;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;
@RequestScoped
public class AccountQuestionnaireRepository extends EntityRepository<AccountQuestionnaire>{

	@Override
	protected Class<AccountQuestionnaire> getEntityClass() {
		return AccountQuestionnaire.class;
	}

	@Override
	protected String getAllEntities() {
		return AccountQuestionnaire.GET_ALL_ACCOUNTS;
	}

	public AccountQuestionnaire getEntityByUserId(long userId) {
		List<AccountQuestionnaire> accountList = entityManager.createNamedQuery(AccountQuestionnaire.GET_ACCOUNT_BY_USERID, AccountQuestionnaire.class).setParameter("id", userId).getResultList();
		if (accountList.isEmpty()) {
			return null;
		} else {
		return accountList.get(0);
		}
	}
	
	public List<Long> getAccountIdListByUserList(List<Long> ids){
		return entityManager.createNamedQuery(AccountQuestionnaire.GET_ACCOUNT_ID_LIST_BY_USERID_LIST, Long.class).setParameter("ids", ids).getResultList();
	}
	
}
