package pt.upacademy.coreFinalProject.Services;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pt.upacademy.coreFinalProject.models.Entity_;

@Transactional
public class EntityService<R extends EntityRepository<E>, E extends Entity_> {
	
	
	@Inject
	protected R repository;
	
	public E create(E entity) {
		return repository.createEntity(entity);
	}
	
	public E retrieve(long id) {
		return repository.retrieveEntity(id);
	}
		
	
	public E update(E entity) {
		return repository.updateEntity(entity);
	}
	
	public E delete(long id ) {
		return repository.deleteEntity(id);
	}

}
