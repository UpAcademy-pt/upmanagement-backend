package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.AnsweredQuestions;
import pt.upacademy.coreFinalProject.repositories.AnsweredQuestionsRepository;

@RequestScoped
public class AnsweredQuestionsService extends EntityService<AnsweredQuestionsRepository, AnsweredQuestions>{

}
