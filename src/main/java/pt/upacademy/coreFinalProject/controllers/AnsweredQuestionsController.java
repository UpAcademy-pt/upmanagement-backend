package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;
import pt.upacademy.coreFinalProject.repositories.AnsweredQuestionnaireRepository;
import pt.upacademy.coreFinalProject.services.AnsweredQuestionnaireService;

@Path("answeredquestions")
@RequestScoped
public class AnsweredQuestionsController extends EntityController<AnsweredQuestionnaireService, AnsweredQuestionnaireRepository, AnsweredQuestionnaire>{

}
