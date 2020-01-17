package pt.upacademy.coreFinalProject.Services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.Repositories.AnswerRepository;
import pt.upacademy.coreFinalProject.models.Answer;

@RequestScoped
public class AnswerService extends EntityService<AnswerRepository, Answer>{

}
