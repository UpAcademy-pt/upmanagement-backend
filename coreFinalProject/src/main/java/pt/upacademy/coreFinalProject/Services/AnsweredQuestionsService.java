package pt.upacademy.coreFinalProject.Services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.Repositories.AnsweredQuestionsRepository;
import pt.upacademy.coreFinalProject.models.AnsweredQuestions;

@RequestScoped
public class AnsweredQuestionsService extends EntityService_<AnsweredQuestionsRepository, AnsweredQuestions>{

}
