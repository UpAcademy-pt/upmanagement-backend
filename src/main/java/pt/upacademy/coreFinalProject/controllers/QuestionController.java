package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.Repositories.QuestionRepository;
import pt.upacademy.coreFinalProject.Services.QuestionService;
import pt.upacademy.coreFinalProject.models.Question;

@Path("question")
@RequestScoped
public class QuestionController extends EntityController_<QuestionService, QuestionRepository, Question>{

}
