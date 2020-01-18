package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Module;
import pt.upacademy.coreFinalProject.models.DTOS.ModuleDTO;
import pt.upacademy.coreFinalProject.repositories.ModuleRepository;

@RequestScoped
public class ModuleService extends EntityService<ModuleRepository, Module, ModuleDTO> {

	@Inject
	protected ModuleRepository modRep;
	
}
