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
public class AccountConverter extends EntityConverter <Account,AccountDTO> {
	
	@Inject
	private EditionService editionBus;
	
	@Inject
	private NoteService noteBus;
	
	@Inject
	private LessonService lessonBus;
	
	@Inject
	private QuestionService questionBus;
	
	@Inject
	private AnswerService answerBus;
	
	@Inject
	private UserService userBus;
	
	@Inject
	private EventService eventBus;

	@Override
	public Account toEntity(AccountDTO dto) {
		
		Account account = new Account ();
		
		if(dto.getId() > 0) {
			account.setId(dto.getId());
		}
		
			account.setEditions(dto.getEditionsIds().stream().map(entityId -> {
				Edition edition = editionBus.get(entityId);
				return edition;
			}).collect(Collectors.toList()));
			
	 		account.setAnswers(dto.getAnswersIds().stream().map(entityId -> {
				AnswerForum answer = answerBus.get(entityId);
				return answer;
			}).collect(Collectors.toList()));
			
	 		account.setLessons(dto.getLessonsIds().stream().map(entityId -> {
	 			Lesson lesson = lessonBus.get(entityId);
	 				return lesson;
	 			}).collect(Collectors.toList()));
	 		
	 		account.setNotes(dto.getNotesIds().stream().map(entityId -> {
	 			Note notes = noteBus.get(entityId);
 				return notes;
 			}).collect(Collectors.toList()));

	 		account.setQuestions(dto.getQuestionsIds().stream().map(entityId -> {
	 			QuestionForum question = questionBus.get(entityId);
 				return question;
 			}).collect(Collectors.toList()));
	 		
	 		account.setEvents(dto.getEventsIds().stream().map(entityId -> {
	 			Event event = eventBus.get(entityId);
 				return event;
 			}).collect(Collectors.toList()));
	 		
	 		account.setUser(userBus.get(dto.getUserId()));
	 		
	 	return account;
		
	}

	@Override
	public AccountDTO toDTO(Account ent) {
		AccountDTO accountDTO = new AccountDTO (
				ent.getUser().getId(), //TODO
				ent.getEditions().stream().map(Edition :: getId).collect(Collectors.toList()),
				ent.getLessons().stream().map(Lesson :: getId).collect(Collectors.toList()),
				ent.getNotes().stream().map(Note :: getId).collect(Collectors.toList()),
				ent.getQuestions().stream().map(QuestionForum :: getId).collect(Collectors.toList()),
				ent.getAnswers().stream().map(AnswerForum :: getId).collect(Collectors.toList()),
				ent.getEvents().stream().map(Event :: getId).collect(Collectors.toList())
				);
		
		return accountDTO;
	}
	
	

}
