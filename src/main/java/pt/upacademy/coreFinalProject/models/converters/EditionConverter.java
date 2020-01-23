package pt.upacademy.coreFinalProject.models.converters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.Note;
import pt.upacademy.coreFinalProject.models.QuestionForum;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;
import pt.upacademy.coreFinalProject.models.DTOS.LessonDTO;
import pt.upacademy.coreFinalProject.services.AccountService;
import pt.upacademy.coreFinalProject.services.EditionService;
import pt.upacademy.coreFinalProject.services.LessonService;
import pt.upacademy.coreFinalProject.services.NoteService;
import pt.upacademy.coreFinalProject.services.QuestionService;


@RequestScoped
public class EditionConverter extends EntityConverter <Edition, EditionDTO> {
	
	@Inject
	private AccountService accountBus;
	
	@Inject 
	private LessonService lessonBus;
	
	@Inject 
	private LessonConverter lessonConverter;
	
	@Inject 
	private AccountConverter accountConverter;
	
	


	@Override
	public Edition toEntity(EditionDTO dto) {
		Edition edition = new Edition ();
		if (dto.getId() > 0) {
			edition.setId(dto.getId());
		}
		edition.setListAccount(dto.getAccountsDtos().stream().map(accountDto ->{
			return accountConverter.toEntity(accountDto).getId();
			}).collect(Collectors.toList()));
		edition.setName(dto.getName());
		edition.setType (dto.getType());
			
		return edition;
	}

	
	@Override
	public EditionDTO toDTO(Edition ent) {
		List<LessonDTO> listLessons = getLessonByEditionId (ent.getId());
		EditionDTO editionDTO = new EditionDTO (
				ent.getId(),
				ent.getName(),
				ent.getType(),
				listLessons,
				this.getAccountDTO(ent)
				);

		
		return editionDTO;
		
	}
	
	private List <LessonDTO> getLessonByEditionId (long id) {
		List <Lesson> listlessons = (List<Lesson>) lessonBus.get();
		List <LessonDTO> listLessonDTO = new ArrayList <LessonDTO> ();
		for (Lesson lesson : listlessons) {
			long editionId = lesson.getEditionIds();
			if (editionId == id) {
				LessonDTO lessonDto = lessonConverter.toDTO(lesson);
				listLessonDTO.add(lessonDto);
		}
		}
		return listLessonDTO;
	}
	
	private List <AccountDTO> getAccountDTO (Edition ent) {
		List <AccountDTO> listAccountsDtos = new ArrayList <AccountDTO> ();
		List <Account> listAccounts = ent.getListAccount().stream().map(accountid -> {
			return accountBus.get(accountid);
		}).collect(Collectors.toList());
		for (Account account : listAccounts) {
			listAccountsDtos.add(accountConverter.toDTO(account));

		}
		return listAccountsDtos;
	}
	
	

}

