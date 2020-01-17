package pt.upacademy.coreFinalProject.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Note;
import pt.upacademy.coreFinalProject.models.DTOS.NoteDTO;
import pt.upacademy.coreFinalProject.models.converters.NoteConverter;
import pt.upacademy.coreFinalProject.repositories.NoteRepository;


@RequestScoped
public class NoteService extends EntityService <NoteRepository, Note, NoteDTO>{

	@Inject NoteConverter converter;
	
	
	public List<NoteDTO> getNotesByLessonId(long id){
		return repository.getNotesByLessonsIds(id).stream().map(note -> converter.toDTO(note)).collect(Collectors.toList());
		
	}
	
	
}
