package pt.upacademy.coreFinalProject.repositories;


import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;

import pt.upacademy.coreFinalProject.models.Edition;



@ApplicationScoped
public class EditionRepository extends EntityRepository <Edition>{

	@Override
	protected Class<Edition> getEntityClass() {
		return Edition.class;
	}

	@Override
	protected String getAllEntities() {
		return Edition.GET_ALL_EDITIONS;
	}

	protected String getAllEntitiesIds() {
		return Edition.GET_ALL_EDITIONS_IDS;
	}


	protected String getEntitiesCount() {
		return Edition.GET_ALL_EDITIONS_COUNT;
	}

	public Collection<Edition> getbyAccountId(long id) {
		return entityManager.createNamedQuery(Edition.GET_EDITION_ACCOUNT_ID, getEntityClass()).setParameter("accountId", id).getResultList();
		
	}



}
