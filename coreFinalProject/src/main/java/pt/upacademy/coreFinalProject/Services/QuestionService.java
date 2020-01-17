package pt.upacademy.coreFinalProject.Services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.Repositories.QuestionRepository;
import pt.upacademy.coreFinalProject.models.Question;

@RequestScoped
public class QuestionService extends EntityService_<QuestionRepository, Question>{

}
