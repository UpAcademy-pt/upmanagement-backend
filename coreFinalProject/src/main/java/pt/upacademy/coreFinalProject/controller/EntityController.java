package pt.upacademy.coreFinalProject.controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pt.upacademy.coreFinalProject.Repositories.EntityRepository;
import pt.upacademy.coreFinalProject.Services.EntityService;
import pt.upacademy.coreFinalProject.models.Entity_;

@Transactional
public abstract class EntityController<S extends EntityService<R,E>, R extends EntityRepository<E>,E extends Entity_> {
	
	@Inject
	protected S service;
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEntityById(@PathParam("id") long id) {
		try { 
				return Response.status(200).entity(service.retrieve(id)).build();
			}
			catch (Exception e){
				e.printStackTrace();
				return Response.status(400).entity(e.getMessage()).build();
			}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
		public List<E> getAll(){
		return entityToDto(service.getAll());
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(E entity) {
		try { 
			service.create(entity);
			return Response.status(200).entity(entity.toString()).build();
		}
		catch (Exception e){
			e.printStackTrace();
			return Response.status(400).entity(e.getMessage()).build();
		}
	}
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateEntity(E entity) {
		try { 
			service.update(entity);
			return Response.ok().build();
		}
		catch (RuntimeException e) {
			e.printStackTrace();
			return Response.status(404).entity(e.getMessage()).build();
		} 
		catch (Exception e){
			e.printStackTrace();
			return Response.status(400).entity(e.getMessage()).build();
		}	
	}
	
	@DELETE
	@Path("/{id}")
	public Response deleteEntity(@PathParam("id") long id) {
		try { 
			service.delete(id);
			return Response.ok().build();
		}
		catch (Exception e){
			e.printStackTrace();
			return Response.status(400).entity(e.getMessage()).build();
		}
	}
	
}
