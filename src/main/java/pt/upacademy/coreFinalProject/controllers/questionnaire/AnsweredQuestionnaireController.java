package pt.upacademy.coreFinalProject.controllers.questionnaire;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.EntityController;
import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;
import pt.upacademy.coreFinalProject.repositories.AnsweredQuestionsRepository;
import pt.upacademy.coreFinalProject.services.AnsweredQuestionsService;

@Path("questionnaire/answeredquestions")
@RequestScoped
public class AnsweredQuestionnaireController extends EntityControllerDTO<AnsweredQuestionsService, AnsweredQuestionsRepository, AnsweredQuestionnaireConverter, AnsweredQuestionnaire, AnsweredQuestionnaireDTO>{

}
