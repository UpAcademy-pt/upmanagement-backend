package pt.upacademy.coreFinalProject.controllers.questionnaire;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.AnsweredQuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.converters.AnsweredQuestionnaireConverter;
import pt.upacademy.coreFinalProject.repositories.AnsweredQuestionnaireRepository;
import pt.upacademy.coreFinalProject.services.AnsweredQuestionnaireService;


@Path("questionnaire/answeredquestionnaire")
@RequestScoped
public class AnsweredQuestionnaireController extends EntityControllerDTO<AnsweredQuestionnaireService, AnsweredQuestionnaireRepository, AnsweredQuestionnaireConverter, AnsweredQuestionnaire, AnsweredQuestionnaireDTO>{

}
