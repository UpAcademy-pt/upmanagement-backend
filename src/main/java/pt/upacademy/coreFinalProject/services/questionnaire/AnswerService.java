package pt.upacademy.coreFinalProject.services.questionnaire;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.questionnaire.Answer;
import pt.upacademy.coreFinalProject.repositories.questionnaire.AnswerRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class AnswerService extends EntityService<AnswerRepository, Answer>{

}
