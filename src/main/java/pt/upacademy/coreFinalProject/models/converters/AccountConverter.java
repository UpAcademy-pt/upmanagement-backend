package pt.upacademy.coreFinalProject.models.converters;

import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.services.AcademyService;
import pt.upacademy.coreFinalProject.services.EvaluationService;
import pt.upacademy.coreFinalProject.services.ThemeService;

public class AccountConverter extends EntityConverter<Account,AccountDTO> {
	
	@Inject
	protected ThemeService themeService;
	
	@Inject
	protected EvaluationService evalService;
	
	@Inject
	protected AcademyService academyService;

	@Override
	public Account toEntity(AccountDTO dto) {
		Account account = new Account();
		if(dto.getId() != 0) {
			account.setId(dto.getId());
		}
		account.setAcademicBackground(dto.getAcademicBackground());
		account.setAcademicDegree(dto.getAcademicDegree());
		account.setAge(dto.getAge());
		account.setLinkedInAdress(dto.getLinkedInAdress());
		account.setMissedDays(dto.getMissedDays());
		account.setMobilePhone(dto.getMobilePhone());
		account.setPhotoLink(dto.getPhotoLink());
		account.setUserId(dto.getUserId());
		account.setAcademies(dto.getAcademyIds().stream().map(academyId -> academyService.get(academyId)).collect(Collectors.toSet()));
		account.setThemes(dto.getThemeIds().stream().map(themeId -> themeService.get(themeId)).collect(Collectors.toSet()));
//		account.setEvaluations(dto.getEvaluationIds().stream().map(evalId -> evalService.get(evalId)).collect(Collectors.toSet()));       //GONCALO
		account.setNif(dto.getNif());
		return account;
	}

	@Override
	public AccountDTO toDTO(Account entity) {
		AccountDTO dto = new AccountDTO(
				entity.getUserId(),
				entity.getAge(),
				entity.getAcademies().stream().map(academy -> academy.getId()).collect(Collectors.toList()),
				entity.getAcademicDegree(),
				entity.getAcademicBackground(),
				entity.getPhotoLink(),
				entity.getMobilePhone(),
				entity.getLinkedInAdress(),
				entity.getThemes().stream().map(theme -> theme.getId()).collect(Collectors.toList()),
//				entity.getEvaluations().stream().map(evaluation -> evaluation.getId()).collect(Collectors.toList()),        //GONCALO
				entity.getMissedDays(),
				entity.getNif()
				);
		if(entity.getId() != 0) {
			dto.setId(entity.getId());
		}
		return dto;
	}

}
