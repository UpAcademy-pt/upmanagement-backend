package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.Event;
import pt.upacademy.coreFinalProject.models.DTOS.EventDTO;


@ApplicationScoped
public class EventRepository extends EntityRepository <Event, EventDTO>{

	@Override
	protected Class<Event> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	protected String getAllEntitiesIds() {
		// TODO Auto-generated method stub
		return null;
	}


	protected String getEntitiesCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
