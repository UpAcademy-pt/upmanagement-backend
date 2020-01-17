package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.Repositories.QuestionnaireRepository;
import pt.upacademy.coreFinalProject.Services.QuestionnaireService;
import pt.upacademy.coreFinalProject.models.Questionnaire;

@Path("questionnaire")
@RequestScoped
public class QuestionnaireController extends EntityController_<QuestionnaireService, QuestionnaireRepository, Questionnaire>{

}
