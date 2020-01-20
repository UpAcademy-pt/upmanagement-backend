package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Module;

@RequestScoped
public class ModuleRepository extends EntityRepository<Module> {

	@Override
	protected Class<Module> getEntityClass() {
		return Module.class;
	}

	@Override
	protected String getAllEntities() {
		return Module.GET_ALL_MODULES;
	}

}
