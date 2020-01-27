package pt.upacademy.coreFinalProject.services;

import java.util.Set;

import pt.upacademy.coreFinalProject.models.Subscription;
import pt.upacademy.coreFinalProject.repositories.SubscriptionRepository;

public class SubscriptionService extends EntityService<SubscriptionRepository, Subscription>{

	public Set<Subscription> getSubscrionByAccountId (long id){
		
		return repository.getSubscrionByAccountId(id);
	}
	
	public Set<Subscription> getSubscrionByEditionId (long id){
		return repository.getSubscrionByEditionId(id);
	}
	
}
