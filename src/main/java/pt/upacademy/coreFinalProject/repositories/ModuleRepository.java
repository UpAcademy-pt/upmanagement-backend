package pt.upacademy.coreFinalProject.repositories;

import pt.upacademy.coreFinalProject.models.Module;

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
