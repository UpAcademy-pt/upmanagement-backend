package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Module;
import pt.upacademy.coreFinalProject.repositories.ModuleRepository;

@RequestScoped
public class ModuleService extends EntityService<ModuleRepository, Module> {

	@Inject
	protected ModuleRepository modRep;
	
}
