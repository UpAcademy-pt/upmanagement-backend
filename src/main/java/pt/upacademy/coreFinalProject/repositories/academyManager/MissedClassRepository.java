package pt.upacademy.coreFinalProject.repositories.academyManager;

import java.util.List;

import pt.upacademy.coreFinalProject.models.academyManager.MissedClass;

public class MissedClassRepository extends EntityRepository<MissedClass> {

	@Override
	protected Class<MissedClass> getEntityClass() {
		return MissedClass.class;
	}

	@Override
	protected String getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected String getAllMissedClassesById() {
		return MissedClass.GET_ALL_MISSEDCLASSES_BY_ID;
	}

	public List<MissedClass> getAllMissedById(int accountId) {

		return entityManager.createNamedQuery(MissedClass.GET_ALL_MISSEDCLASSES_BY_ID, getEntityClass()).setParameter("accountId", accountId).getResultList();
	}

}
