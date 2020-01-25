package pt.upacademy.coreFinalProject.models.converters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.services.AccountService;
import pt.upacademy.coreFinalProject.services.QuestionnaireService;

public class AccountConverter extends EntityConverter<Account, AccountDTO>{
	
	@Inject
	AccountService ACCOUNT_SERVICE;
	@Inject
	QuestionnaireService QUESTIONNAIRE_SERVICE;
	
	@Override
	public Account toEntity(AccountDTO dto) {
		long[] userAcademies = {1, 2}; // Tem que ser removido depois
		
		return new Account(dto.getId(),
				ACCOUNT_SERVICE.get(dto.getId()).getUserId(),
				dto.getPendingQuentionnaires().keySet().stream().mapToLong(i -> i).toArray(),
				userAcademies);
	}
	
	@Override
	public AccountDTO toDTO(Account entity) {
		Map<Long, String> pedindingQuestionnairesIds = new HashMap<Long, String>();
		Arrays.stream(entity.getPendingQuentionnairesIds()).forEach(id -> {
			Questionnaire questionnaire = QUESTIONNAIRE_SERVICE.get(id);
			pedindingQuestionnairesIds.put(questionnaire.getId(), questionnaire.getName());
		});
		return new AccountDTO(entity.getId(), pedindingQuestionnairesIds);
	}

}
