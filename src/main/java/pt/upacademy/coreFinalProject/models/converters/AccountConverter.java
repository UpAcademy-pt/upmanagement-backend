package pt.upacademy.coreFinalProject.models.converters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionnairePreviewDTO;
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
		
		Account account =  new Account();
			account.setUserId(dto.getId());
//				if (dto.getId() > 0) {
//					account.setId(dto.getId());
//				}
//				account.setUserId(dto.getUserId());
//				if (dto.getPendingQuentionnaires() != null) {
//					account.setPendingQuentionnairesIds(dto.getPendingQuentionnaires().stream().mapToLong(pendingQuest -> pendingQuest.getId()).toArray());
//				}
//				account.setUserAcademies(userAcademies);
		return account;
	}
	
	
	@Override
	public AccountDTO toDTO(Account entity) {
		AccountDTO accountDTO =  new AccountDTO();
			accountDTO.setPendingQuentionnaires(QUESTIONNAIRE_SERVICE.getEmptyQuestionnairesByAccountId(entity.getId()));
//		Set<QuestionnairePreviewDTO> pedindingQuestionnaires = new HashSet<QuestionnairePreviewDTO>();
//		Arrays.stream(entity.getPendingQuentionnairesIds()).forEach(id -> {
//			Questionnaire questionnaire = QUESTIONNAIRE_SERVICE.get(id);
//			pedindingQuestionnaires.add(new QuestionnairePreviewDTO(questionnaire.getId(), questionnaire.getName()));
//		});
		accountDTO.setId(entity.getId());
		return accountDTO;
	}
	

}
