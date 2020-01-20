package pt.upacademy.coreFinalProject.repositories;


import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.Edition;



@ApplicationScoped
public class EditionRepository extends EntityRepository <Edition>{

	@Override
	protected Class<Edition> getEntityClass() {
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
