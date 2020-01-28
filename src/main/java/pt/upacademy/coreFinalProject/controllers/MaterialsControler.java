package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Materials;
import pt.upacademy.coreFinalProject.repositories.MaterialsRepository;
import pt.upacademy.coreFinalProject.services.MaterialsService;

@Path("/aulas/materials")
@RequestScoped
public class MaterialsControler extends EntityController<MaterialsService, MaterialsRepository, Materials> {

}
