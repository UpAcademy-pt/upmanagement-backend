package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.repositories.QuestionnaireRepository;

@RequestScoped
public class QuestionnaireService extends EntityService<QuestionnaireRepository, Questionnaire> {

}
