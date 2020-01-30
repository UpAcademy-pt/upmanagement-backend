package pt.upacademy.coreFinalProject.services.questionnaire;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.questionnaire.Template;
import pt.upacademy.coreFinalProject.repositories.questionnaire.TemplateRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class TemplateService extends EntityService<TemplateRepository, Template>{

}
