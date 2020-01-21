package pt.upacademy.coreFinalProject.models.converters;

import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.AnswerForum;
import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.Event;
import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.Note;
import pt.upacademy.coreFinalProject.models.QuestionForum;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.services.AnswerService;
import pt.upacademy.coreFinalProject.services.EditionService;
import pt.upacademy.coreFinalProject.services.EventService;
import pt.upacademy.coreFinalProject.services.LessonService;
import pt.upacademy.coreFinalProject.services.NoteService;
import pt.upacademy.coreFinalProject.services.QuestionService;
import pt.upacademy.coreFinalProject.services.UserService;

@RequestScoped
public class AccountConverter extends EntityConverter<Account, AccountDTO> {

	@Inject
	private EditionService editionBus;


	@Inject
	private UserService userBus;



	@Override
	public Account toEntity(AccountDTO dto) {

		Account account = new Account();

		if (dto.getId() > 0) {
			account.setId(dto.getId());
		}

		account.setEditions(dto.getEditionsIds().stream().map(entityId -> {
			Edition edition = editionBus.get(entityId);
			return edition;
		}).collect(Collectors.toList()));

		account.setUser(userBus.get(dto.getUserId()));

		return account;

	}

	@Override
	public AccountDTO toDTO(Account ent) {
		AccountDTO accountDTO = new AccountDTO(
				ent.getId(),
				(ent.getUser() == null) ? 0 :ent.getUser().getId(), 
				ent.getEditions().stream().map(Edition::getId).collect(Collectors.toList()));

		return accountDTO;
		
	}

}
