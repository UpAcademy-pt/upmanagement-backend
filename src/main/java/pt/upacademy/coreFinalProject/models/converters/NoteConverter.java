//package pt.upacademy.coreFinalProject.models.converters;
//
//
//import javax.inject.Inject;
//
//import pt.upacademy.coreFinalProject.models.Note;
//import pt.upacademy.coreFinalProject.models.DTOS.NoteDTO;
//import pt.upacademy.coreFinalProject.services.LessonService;
//import pt.upacademy.coreFinalProject.services.UserService;
//
//public class NoteConverter extends EntityConverter<Note, NoteDTO>{
//
//	@Inject
//	LessonService LB;
//	UserService UB;
//	
//	
//	@Override
//	public Note toEntity(NoteDTO noteDTO) {
//		Note note = new Note();
//		
//		if(noteDTO.getId()>0) {
//			note.setId(noteDTO.getId());
//			}
//		
//		note.setLesson(noteDTO.getLessonId() > 0 ? LB.get(noteDTO.getLessonId()): null);
//		note.setDateOfNote(noteDTO.getDateOfNote());
//		note.setUser(noteDTO.getId() > 0 ? UB.get(noteDTO.getUserId()) : null); // verificar métodos do user do core quando tivermos
//
//		return note;
//	}
//
//	@Override
//	public NoteDTO toDTO(Note note) {
//		
//		return new NoteDTO(
//				(note.getLesson()==null) ? 0 : note.getLesson().getId(),
//				note.getDateOfNote(),
//				(note.getUser()==null) ? 0 : note.getUser().getId()
//				);
//				
//		
//		
//	}
//
//}
