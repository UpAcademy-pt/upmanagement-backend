package pt.upacademy.coreFinalProject.Services;

import java.util.Collection;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pt.upacademy.coreFinalProject.Repositories.EntityRepository_;
import pt.upacademy.coreFinalProject.models.Entity_;

@Transactional
public abstract class EntityService_<R extends EntityRepository_<E>, E extends Entity_> {
	//a class tem de ser abstrata
	
	@Inject
	protected R repository;
	
	//nao estava a retornar o id, coloquei void
	public void create(E entity) {
		repository.createEntity(entity);
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
	
	public Collection<E> getAll(){
		return repository.getAll();
	}

}
