package pt.upacademy.coreFinalProject.Services;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pt.upacademy.coreFinalProject.Repositories.EntityRepository;
import pt.upacademy.coreFinalProject.models.Entity_;

@Transactional
public class EntityService<R extends EntityRepository<E>, E extends Entity_> {
	
	
	@Inject
	protected R repository;
	
	public long create(E entity) {
		return repository.createEntity(entity);
	}
	
	public E retrieve(long id) {
		return repository.retrieveEntity(id);
	}
		
	
	public void update(E entity) {
		repository.updateEntity(entity);
	}
	
	public void delete(long id ) {
		repository.deleteEntity(id);
	}

}
