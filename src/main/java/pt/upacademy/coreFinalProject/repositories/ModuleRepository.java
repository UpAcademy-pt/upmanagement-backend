package pt.upacademy.coreFinalProject.repositories;

import pt.upacademy.coreFinalProject.models.Module;
import pt.upacademy.coreFinalProject.models.DTOS.ModuleDTO;

public class ModuleRepository extends EntityRepository<Module, ModuleDTO> {

	@Override
	protected Class<Module> getEntityClass() {
		return Module.class;
	}

	@Override
	protected String getAllEntities() {
		return Module.GET_ALL_MODULES;
	}

}
