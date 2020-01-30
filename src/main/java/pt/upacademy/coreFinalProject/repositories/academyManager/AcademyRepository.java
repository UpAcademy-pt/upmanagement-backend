package pt.upacademy.coreFinalProject.repositories.academyManager;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Academy;

@RequestScoped
public class AcademyRepository extends EntityRepository<Academy> {

	@Override
	protected Class<Academy> getEntityClass() {
		return Academy.class;
	}

	@Override
	protected String getAllEntities() {
		return Academy.GET_ALL_ACADEMIES;
	}

}
