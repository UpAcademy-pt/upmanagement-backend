package pt.upacademy.coreFinalProject.models.converters;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.services.AccountService;

public class AccountConverter extends EntityConverter<Account, AccountDTO>{
	
	@Inject
	AccountService ACCOUNT_SERVICE;

	@Override
	public Account toEntity(AccountDTO dto) {
		// long id, long userId, long[] pendingQuentionnairesIds, long[] userAcademies
		// return new Account(dto.getId(), ACCOUNT_SERVICE.get(dto.getId()), dto.getPendingQuentionnaires().stream().map());
		return null;
	}

	@Override
	public AccountDTO toDTO(Account entity) {
		// long id, Set<QuestionnaireDTO> pendingQuentionnaires
		return null;
	}

}
