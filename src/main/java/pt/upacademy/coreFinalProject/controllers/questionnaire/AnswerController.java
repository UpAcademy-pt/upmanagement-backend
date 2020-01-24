package pt.upacademy.coreFinalProject.controllers.questionnaire;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.Answer;
import pt.upacademy.coreFinalProject.models.DTOS.AnswerDTO;
import pt.upacademy.coreFinalProject.models.converters.AnswerConverter;
import pt.upacademy.coreFinalProject.repositories.AnswerRepository;
import pt.upacademy.coreFinalProject.services.AnswerService;

@Path("questionnaire/answer")
@RequestScoped
public class AnswerController extends EntityControllerDTO<AnswerService, AnswerRepository, AnswerConverter, Answer, AnswerDTO>{

}
