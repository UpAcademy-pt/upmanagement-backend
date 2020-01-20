package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Module;
import pt.upacademy.coreFinalProject.models.DTOS.ModuleDTO;
import pt.upacademy.coreFinalProject.models.converters.ModuleConverter;
import pt.upacademy.coreFinalProject.repositories.ModuleRepository;
import pt.upacademy.coreFinalProject.services.ModuleService;

@Path("modules")
@RequestScoped
public class ModuleController extends EntityControllerDTO<ModuleService, ModuleRepository, ModuleConverter, Module, ModuleDTO> {

}
