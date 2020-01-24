package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Template;
import pt.upacademy.coreFinalProject.repositories.TemplateRepository;

@RequestScoped
public class TemplateService extends EntityService<TemplateRepository, Template>{

}
