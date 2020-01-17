package pt.upacademy.coreFinalProject.Repositories;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pt.upacademy.coreFinalProject.models.Entity_;


@Transactional
public abstract class EntityRepository<T extends Entity_> {
	
	@PersistenceContext(unitName = "database")
	protected EntityManager em;
	
	protected abstract Class<T> getEntityClass();
	
	protected abstract String getAllEntities();
	
	public Collection<T> getAll() {
		return em.createNamedQuery(getAllEntities(), getEntityClass()).getResultList();
	}
	
	
	public long createEntity(T t) {
		return em.merge(t).getID();
		
	}
	
	public T retrieveEntity(long id ) {
		return em.find(getEntityClass(), id);
		
	}
	
	public void updateEntity(T t) {
		em.merge(t);
	}
	
	public void deleteEntity(long id) {
		T entity = retrieveEntity(id);
		if (entity != null) {
			em.remove(entity);
		}
	}
	

}
