package pt.upacademy.coreFinalProject.models.converters;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.Note;
import pt.upacademy.coreFinalProject.models.DTOS.LessonDTO;
import pt.upacademy.coreFinalProject.services.NoteService;


@RequestScoped
public class LessonConverter extends EntityConverter <Lesson, LessonDTO> {
	
	@Inject
	protected NoteService NS;
	
	@Override
	public Lesson toEntity(LessonDTO dto) {
//		Lesson newLesson = new Lesson();
//		newLesson.setTitle(dto.getTitle());
//		newLesson.setDescription(dto.getDescription());
//		newLesson.setStudyMaterial(dto.getStudyMaterial());
//		newLesson.setNotes(dto.getNotesIds().stream().map(entityId -> {
//			Note note = NS.get(entityId);
//			note.setLesson(newLesson);
//		}));
//			
//			
//		}
		return null;
	}

	@Override
	public LessonDTO toDTO(Lesson ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
