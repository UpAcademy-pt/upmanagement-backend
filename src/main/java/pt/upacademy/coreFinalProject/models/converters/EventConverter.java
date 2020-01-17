package pt.upacademy.coreFinalProject.models.converters;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Event;
import pt.upacademy.coreFinalProject.models.DTOS.EventDTO;

@RequestScoped
public class EventConverter extends EntityConverter <Event, EventDTO>{

	@Override
	public Event toEntity(EventDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventDTO toDTO(Event ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
