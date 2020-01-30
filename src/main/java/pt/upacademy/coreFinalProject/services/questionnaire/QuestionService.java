package pt.upacademy.coreFinalProject.services.questionnaire;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.questionnaire.Question;
import pt.upacademy.coreFinalProject.repositories.questionnaire.QuestionRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class QuestionService extends EntityService<QuestionRepository, Question>{

}
