package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;
import pt.upacademy.coreFinalProject.repositories.EditionRepository;



@RequestScoped
public class EditionService extends  EntityService <EditionRepository, Edition>{
	
	

}
