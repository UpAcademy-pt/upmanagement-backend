package pt.upacademy.coreFinalProject.repositories.academyManager;

import java.util.Collection;

import pt.upacademy.coreFinalProject.models.academyManager.Declarations;

public class DeclarationsRepository extends EntityRepository<Declarations>{

	@Override
	protected Class<Declarations> getEntityClass() {
		return Declarations.class;
	}

	@Override
	protected String getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}
	protected String getAllDeclarationsByAccountId() {
		return Declarations.GET_ALL_DECLARATIONS_BY_ACCOUNTID;
	}

	public Collection<Declarations> getAllDeclarationsByReceiverId(int accountId) {
		return entityManager.createNamedQuery(Declarations.GET_ALL_DECLARATIONS_BY_ACCOUNTID, getEntityClass()).setParameter("accountIdReceiver", accountId).getResultList();
	}

}
