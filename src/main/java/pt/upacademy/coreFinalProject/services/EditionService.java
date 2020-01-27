package pt.upacademy.coreFinalProject.services;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;
import pt.upacademy.coreFinalProject.models.converters.EditionConverter;
import pt.upacademy.coreFinalProject.repositories.EditionRepository;



@RequestScoped
public class EditionService extends  EntityService <EditionRepository, Edition>{
	
	@Inject
	protected EditionConverter converter;

	
	public Collection<EditionDTO> getbyAccountId(long id) {
		return repository.getbyAccountId(id).stream().map(ed -> converter.toDTO(ed)).collect(Collectors.toList());
	}

}
