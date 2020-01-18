package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Question;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionDTO;
import pt.upacademy.coreFinalProject.models.converters.QuestionConverter;
import pt.upacademy.coreFinalProject.repositories.QuestionRepository;
import pt.upacademy.coreFinalProject.services.QuestionService;


@Path("question")
@RequestScoped
public class QuestionController extends EntityControllerDTO<QuestionService, QuestionRepository, QuestionConverter, Question, QuestionDTO>{

}
