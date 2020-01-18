package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Answer;
import pt.upacademy.coreFinalProject.repositories.AnswerRepository;

@RequestScoped
public class AnswerService extends EntityService<AnswerRepository, Answer>{

}
