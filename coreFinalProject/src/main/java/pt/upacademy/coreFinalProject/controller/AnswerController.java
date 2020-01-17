package pt.upacademy.coreFinalProject.controller;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.Repositories.AnswerRepository;
import pt.upacademy.coreFinalProject.Services.AnswerService;
import pt.upacademy.coreFinalProject.models.Answer;


@Path("answer")
@RequestScoped
public class AnswerController extends EntityController_<AnswerService, AnswerRepository, Answer>{

}
