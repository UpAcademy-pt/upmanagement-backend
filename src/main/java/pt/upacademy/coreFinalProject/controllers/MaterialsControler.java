package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import pt.upacademy.coreFinalProject.models.Materials;
import pt.upacademy.coreFinalProject.models.DTOS.MaterialsDTO;
import pt.upacademy.coreFinalProject.models.converters.MaterialsConverter;
import pt.upacademy.coreFinalProject.repositories.MaterialsRepository;
import pt.upacademy.coreFinalProject.services.MaterialsService;

@Path("/aulas/materials")
@RequestScoped
public class MaterialsControler extends EntityControllerDTO<MaterialsService, MaterialsRepository, MaterialsConverter, Materials, MaterialsDTO> {

	@Override
	@DELETE
	@Path("/{id}")
	public String delete(@PathParam("id") long id) {
		service.delete(id);
		return "SuperDelete done!";
	}

}
