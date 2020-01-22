package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.Event;


@ApplicationScoped
public class EventRepository extends EntityRepository <Event>{

	@Override
	protected Class<Event> getEntityClass() {
		return Event.class;
	}

	@Override
	protected String getAllEntities() {
		return Event.GET_ALL_EVENTS;
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
