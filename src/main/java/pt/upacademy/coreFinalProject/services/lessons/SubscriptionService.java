package pt.upacademy.coreFinalProject.services.lessons;

import java.util.Set;

import pt.upacademy.coreFinalProject.models.lessons.Subscription;
import pt.upacademy.coreFinalProject.repositories.lessons.SubscriptionRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

public class SubscriptionService extends EntityService<SubscriptionRepository, Subscription>{

	public Set<Subscription> getSubscrionByAccountId (long id){
		
		return repository.getSubscrionByAccountId(id);
	}
	
	public Set<Subscription> getSubscrionByEditionId (long id){
		return repository.getSubscrionByEditionId(id);
	}
	
}
