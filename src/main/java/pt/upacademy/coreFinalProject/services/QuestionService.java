package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Question;
import pt.upacademy.coreFinalProject.repositories.QuestionRepository;

@RequestScoped
public class QuestionService extends EntityService<QuestionRepository, Question>{

}
