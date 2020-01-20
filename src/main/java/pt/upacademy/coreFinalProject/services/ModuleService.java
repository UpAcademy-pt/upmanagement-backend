package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Module;
import pt.upacademy.coreFinalProject.repositories.ModuleRepository;

@RequestScoped
public class ModuleService extends EntityService<ModuleRepository, Module> {
	
}
