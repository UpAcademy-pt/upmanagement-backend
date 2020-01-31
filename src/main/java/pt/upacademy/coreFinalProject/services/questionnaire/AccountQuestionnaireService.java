package pt.upacademy.coreFinalProject.services.questionnaire;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.questionnaire.AccountQuestionnaire;
import pt.upacademy.coreFinalProject.repositories.questionnaire.AccountQuestionnaireRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class AccountQuestionnaireService extends EntityService<AccountQuestionnaireRepository, AccountQuestionnaire>{
	
	
//	public void addPendingQuestionnaireToAccount(long questionnaireId, long[] accountIds) {
//		repository.addPendingQuestionnaireToAccount(questionnaireId, accountIds);
//	}
	
	
	
	public AccountQuestionnaire getAccountByUserId(long userId) {
		long[] userAcademies = new long[] {1, 2}; //Para apagar depois da integração dos projetos
		long accountId;
		AccountQuestionnaire account = repository.getEntityByUserId(userId);
		if (account == null) {
			accountId = repository.addEntity(new AccountQuestionnaire(0, userId, userAcademies));
			account = repository.getEntity(accountId);
		}
		return account;
	}
	
	public List<Long> getAccountIdListByUserList(List<Long> ids){
		return repository.getAccountIdListByUserList(ids);
	}
	
}
