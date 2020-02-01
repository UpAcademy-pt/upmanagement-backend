package pt.upacademy.coreFinalProject.controllers.questionnaire;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.controllers.core.EntityController;
import pt.upacademy.coreFinalProject.models.questionnaire.Template;
import pt.upacademy.coreFinalProject.models.questionnaire.DTOs.QuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.questionnaire.converters.QuestionnaireConverter;
import pt.upacademy.coreFinalProject.repositories.questionnaire.TemplateRepository;
import pt.upacademy.coreFinalProject.services.questionnaire.TemplateService;

@Path("questionnaire/template")
@RequestScoped
public class TemplateController extends EntityController<TemplateService, TemplateRepository, Template>{

//	@Inject
//	private QuestionnaireConverter questionnaireConverter;
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Template getQuestionnaireFromTemplate(@PathParam("id") long id) {
		return service.get(id); 
	}
	
}
