package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;
import pt.upacademy.coreFinalProject.repositories.AnsweredQuestionnaireRepository;

@RequestScoped
public class AnsweredQuestionnaireService extends EntityService<AnsweredQuestionnaireRepository, AnsweredQuestionnaire>{

}
