package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;
import pt.upacademy.coreFinalProject.models.converters.EditionConverter;
import pt.upacademy.coreFinalProject.repositories.EditionRepository;
import pt.upacademy.coreFinalProject.services.EditionService;




@RequestScoped
public class EditionController extends EntityController <EditionService, EditionRepository, Edition> {

}
