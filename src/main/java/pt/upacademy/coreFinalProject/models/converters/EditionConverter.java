package pt.upacademy.coreFinalProject.models.converters;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.Event;
import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.Note;
import pt.upacademy.coreFinalProject.models.QuestionForum;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;
import pt.upacademy.coreFinalProject.services.AccountService;
import pt.upacademy.coreFinalProject.services.EditionService;
import pt.upacademy.coreFinalProject.services.EventService;
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
	private QuestionService questionBus;
	
	@Inject
	private NoteService noteBus;
	
	@Inject 
	private EventService eventBus;


	@Override
	public Edition toEntity(EditionDTO dto) {
		Edition edition = new Edition ();
		if (dto.getId() > 0) {
			edition.setId(dto.getId());
		}
		
		edition.setName(dto.getName());
		edition.setType(dto.getType());
		edition.setAccounts(dto.getAccountIds().stream().map(entityId -> {
			Account account = accountBus.get(entityId);
			return account;
		}).collect(Collectors.toList()));

		edition.setLessons((List<Lesson>) dto.getLessonsIds().stream().map(lessonId ->   {
			return lessonBus.get(lessonId);
		}).collect(Collectors.toList()));
		
		
		edition.setQuestions(dto.getQuestionsIds().stream().map(questionId -> {
			return questionBus.get(questionId);
	}).collect(Collectors.toList()));
				
		
		edition.setEvents(dto.getEventsIds().stream().map(entId -> {
			return eventBus.get(entId);
		}).collect(Collectors.toList()));
		
		
		edition.setNotes(dto.getNotesIds().stream().map( noteId -> {
			return noteBus.get(noteId);
		}).collect(Collectors.toList()));
		
		return edition;
	}

	
	

	
	@Override
	public EditionDTO toDTO(Edition ent) {
		EditionDTO editionDTO = new EditionDTO (
				ent.getName(),
				ent.getType(),
				ent.getAccounts().stream().map(Account :: getId).collect(Collectors.toList()),
				ent.getLessons().stream().map(Lesson :: getId).collect(Collectors.toList()),
				ent.getNotes().stream().map(Note :: getId).collect(Collectors.toList()),
				ent.getQuestions().stream().map(QuestionForum :: getId).collect(Collectors.toList()),
				ent.getEvents().stream().map(Event :: getId).collect(Collectors.toList())
				);
		
		return editionDTO;
		
	}

}
