package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Theme;

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
