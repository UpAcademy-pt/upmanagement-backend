package pt.upacademy.coreFinalProject.repositories;

import java.util.HashSet;
import java.util.Set;

import pt.upacademy.coreFinalProject.models.Subscription;

public class SubscriptionRepository extends EntityRepository<Subscription>{

	@Override
	protected Class<Subscription> getEntityClass() {
		
		return Subscription.class;
	}

	@Override
	protected String getAllEntities() {
		
		return Subscription.GET_ALL_SUBSCRIPTIONS;
	}
	
	
	public Set<Subscription> getSubscrionByAccountId (long id){
		Set <Subscription> result =  new HashSet (entityManager.createNamedQuery(Subscription.GET_SUBSCRIPTION_BY_ACCOUNTID, Subscription.class).setParameter("accountId", id).getResultList());
		return result;
	}
	
	public Set<Subscription> getSubscrionByEditionId (long id){
		Set <Subscription> result =  new HashSet (entityManager.createNamedQuery(Subscription.GET_SUBSCRIPTION_BY_EDITIONID, Subscription.class).setParameter("editionId", id).getResultList());
		return result;
	}
	
	
	

}
