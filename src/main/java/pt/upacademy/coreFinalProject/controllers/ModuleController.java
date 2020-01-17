package pt.upacademy.coreFinalProject.controllers;

import pt.upacademy.coreFinalProject.models.Module;
import pt.upacademy.coreFinalProject.models.DTOS.ModuleDTO;
import pt.upacademy.coreFinalProject.models.converters.ModuleConverter;
import pt.upacademy.coreFinalProject.repositories.ModuleRepository;
import pt.upacademy.coreFinalProject.services.ModuleService;

public class ModuleController extends EntityController<ModuleService, ModuleRepository, ModuleConverter, Module, ModuleDTO> {

}
