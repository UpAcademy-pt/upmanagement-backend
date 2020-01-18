package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.repositories.QuestionnaireRepository;
import pt.upacademy.coreFinalProject.services.QuestionnaireService;

@Path("questionnaire")
@RequestScoped
public class QuestionnaireController extends EntityController<QuestionnaireService, QuestionnaireRepository, Questionnaire>{

}
