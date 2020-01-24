package pt.upacademy.coreFinalProject.controllers.questionnaire;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.EntityController;
import pt.upacademy.coreFinalProject.models.Answer;
import pt.upacademy.coreFinalProject.repositories.AnswerRepository;
import pt.upacademy.coreFinalProject.services.AnswerService;

@Path("questionnaire/answer")
@RequestScoped
public class AnswerController extends EntityControllerDTO<AnswerService, AnswerRepository, AnswerConverter, Answer, AnswerDTO>{

}
