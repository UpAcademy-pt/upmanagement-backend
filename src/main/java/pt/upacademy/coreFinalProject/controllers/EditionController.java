package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.repositories.EditionRepository;
import pt.upacademy.coreFinalProject.services.EditionService;


@RequestScoped
@Path ("edition")
public class EditionController extends EntityController <EditionService, EditionRepository, Edition> {

	
	

}
