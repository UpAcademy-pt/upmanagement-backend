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
	QuestionnaireConverter QUESTIONNAIRE_CONVERTER;
	
	@Inject
	QuestionnaireService QUESTIONNAIRE_SERVICE;
	
	@Override
	public Account toEntity(AccountDTO dto) {
		
//		Account account =  new Account();
//			if (dto.getId() > 0) {
//				account.setId(dto.getId());
//			}
//			account.setUserId(dto.getUserId());
//				account.setUserId(dto.getUserId());
//				if (dto.getPendingQuentionnaires() != null) {
//					account.setPendingQuentionnairesIds(dto.getPendingQuentionnaires().stream().mapToLong(pendingQuest -> pendingQuest.getId()).toArray());
//				}
//				account.setUserAcademies(userAcademies);
		return null;
	}
	
	@Override
	public AccountDTO toDTO(Account entity) {
		AccountDTO accountDTO =  new AccountDTO();
		accountDTO.setId(entity.getId());
		accountDTO.setPendingQuentionnaires(QUESTIONNAIRE_CONVERTER.questListToPreviewDTO(QUESTIONNAIRE_SERVICE.getEmptyQuestionnairesByAccountId(entity.getId())));
		accountDTO.setUserId(entity.getUserId());
		return accountDTO;
	}
	
}
