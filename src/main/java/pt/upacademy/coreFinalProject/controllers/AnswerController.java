package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Answer;
import pt.upacademy.coreFinalProject.repositories.AnswerRepository;
import pt.upacademy.coreFinalProject.services.AnswerService;

@Path("answer")
@RequestScoped
public class AnswerController extends EntityController<AnswerService, AnswerRepository, Answer>{

}
