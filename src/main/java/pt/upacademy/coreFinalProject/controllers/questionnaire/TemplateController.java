package pt.upacademy.coreFinalProject.controllers.questionnaire;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.controllers.EntityController;
import pt.upacademy.coreFinalProject.models.Template;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.converters.QuestionnaireConverter;
import pt.upacademy.coreFinalProject.repositories.TemplateRepository;
import pt.upacademy.coreFinalProject.services.TemplateService;

@Path("questionnaire/template")
@RequestScoped
public class TemplateController extends EntityController<TemplateService, TemplateRepository, Template>{

	@Inject
	QuestionnaireConverter QUESTIONNAIRE_CONVERTER;
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public QuestionnaireDTO getQuestionnaireFromTemplate(@PathParam("id") long id) {
		return QUESTIONNAIRE_CONVERTER.toDTO(service.get(id)); 
	}
	
}
