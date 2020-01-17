package pt.upacademy.coreFinalProject.models.converters;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;


@RequestScoped
public class EditionConverter extends EntityConverter <Edition, EditionDTO> {

	@Override
	public Edition toEntity(EditionDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EditionDTO toDTO(Edition ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
