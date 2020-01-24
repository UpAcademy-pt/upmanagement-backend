package pt.upacademy.coreFinalProject.controllers.academyManager;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.Module;
import pt.upacademy.coreFinalProject.models.DTOS.ModuleDTO;
import pt.upacademy.coreFinalProject.models.converters.ModuleConverter;
import pt.upacademy.coreFinalProject.repositories.ModuleRepository;
import pt.upacademy.coreFinalProject.services.ModuleService;

@Path("academy-manager/modules")
@RequestScoped
public class ModuleController extends EntityControllerDTO<ModuleService, ModuleRepository, ModuleConverter, Module, ModuleDTO> {

	/*@Override
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String create (ModuleDTO module) {
		System.out.println("created");
		return "created!";
	}*/
	
//	@Override
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
//	public String create (ModuleDTO module) {
//		System.out.println("created");
//		return "created!";
//	}
	@Override
	@POST
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ModuleDTO get (@PathParam("id") long id) {
		System.out.println("done");
		return new ModuleDTO (null, null, "JavaScript", null);
	}
	
	@Override
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String update (ModuleDTO module) {
		System.out.println("updated");
		return "updated!";
	}
	
	@Override
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String delete (@PathParam("id") long id) {
		System.out.println("deleted");
		return "deleted!";
	}
}
