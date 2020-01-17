package pt.upacademy.coreFinalProject.Services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.Repositories.QuestionnaireRepository;
import pt.upacademy.coreFinalProject.models.Questionnaire;

@RequestScoped
public class QuestionnaireService extends EntityService_<QuestionnaireRepository, Questionnaire> {

}
