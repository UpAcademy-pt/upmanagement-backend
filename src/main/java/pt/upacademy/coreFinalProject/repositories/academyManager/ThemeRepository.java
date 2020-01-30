package pt.upacademy.coreFinalProject.repositories.academyManager;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Theme;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;

@RequestScoped
public class ThemeRepository extends EntityRepository<Theme> {

	@Override
	protected Class<Theme> getEntityClass() {
		return Theme.class;
	}

	@Override
	protected String getAllEntities() {
		return Theme.GET_ALL_THEMES;
	}

}
