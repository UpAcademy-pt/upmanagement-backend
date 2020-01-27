package pt.upacademy.coreFinalProject.services;

import java.util.List;
import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Note;
import pt.upacademy.coreFinalProject.repositories.NoteRepository;

@RequestScoped
public class NoteService extends EntityService<NoteRepository, Note> {

	public List<Note> getNotesByLessonId(long id) {
		return repository.getNotesByLessonsIds(id);
	}

	public List<Note> getNotesByAccountId(long id) {
		return repository.getNotesByAccountId(id);
	}

}
