package pt.upacademy.coreFinalProject.controllers.questionnaire;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.converters.QuestionnaireConverter;
import pt.upacademy.coreFinalProject.repositories.QuestionnaireRepository;
import pt.upacademy.coreFinalProject.services.QuestionnaireService;

@Path("questionnaire/questionnaire")
@RequestScoped
public class QuestionnaireController extends EntityControllerDTO<QuestionnaireService, QuestionnaireRepository, QuestionnaireConverter, Questionnaire, QuestionnaireDTO>{


//	@GET
//	@Path("/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public QuestionnaireDTO get(@PathParam("id") long id) {
//		return converter.toDTO(service.get(id)); //Usar metodo sem a rightAnswer
//	}
	
	
	
	
}
