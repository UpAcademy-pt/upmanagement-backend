package pt.upacademy.coreFinalProject.controllers.lessons;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import pt.upacademy.coreFinalProject.controllers.core.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.lessons.Materials;
import pt.upacademy.coreFinalProject.models.lessons.DTOS.MaterialsDTO;
import pt.upacademy.coreFinalProject.models.lessons.converters.MaterialsConverter;
import pt.upacademy.coreFinalProject.repositories.lessons.MaterialsRepository;
import pt.upacademy.coreFinalProject.services.lessons.MaterialsService;

@Path("/aulas/materials")
@RequestScoped
public class MaterialsControler extends EntityControllerDTO<MaterialsService, MaterialsRepository, MaterialsConverter, Materials, MaterialsDTO> {

	@Override
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") long id) {
		service.delete(id);
		return Response.ok().build();
	}

}
