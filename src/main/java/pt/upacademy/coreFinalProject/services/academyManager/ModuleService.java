package pt.upacademy.coreFinalProject.services.academyManager;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Module;
import pt.upacademy.coreFinalProject.repositories.academyManager.ModuleRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class ModuleService extends EntityService<ModuleRepository, Module> {
	
}
