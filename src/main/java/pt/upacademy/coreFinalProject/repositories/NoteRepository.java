package pt.upacademy.coreFinalProject.repositories;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;

import pt.upacademy.coreFinalProject.models.Note;
import pt.upacademy.coreFinalProject.models.DTOS.NoteDTO;



@ApplicationScoped
public class NoteRepository extends EntityRepository<Note, NoteDTO>{

	@Override
	protected Class<Note> getEntityClass() {
		return Note.class;
	}

	@Override
	protected String getAllEntities() {
		return Note.GET_ALL_NOTES;
	}


	protected String getAllEntitiesIds() {
		return Note.GET_ALL_NOTES_IDS;
	}

	
	protected String getEntitiesCount() {
		return Note.GET_NOTES_COUNT;
	}
	
	
	public List <Note> getNotesByLessonsIds(long id) {
		TypedQuery<Note> query = entityManager.createNamedQuery(Note.GET_NOTES_BY_LESSONS_IDS, Note.class);
		query.setParameter("lessonId", id);
		return query.getResultList();	
		
		
	}
	
}
