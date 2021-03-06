package pt.upacademy.coreFinalProject.controllers.questionnaire;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.controllers.core.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.questionnaire.Questionnaire;
import pt.upacademy.coreFinalProject.models.questionnaire.DTOs.QuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.questionnaire.DTOs.QuestionnairePreviewDTO;
import pt.upacademy.coreFinalProject.models.questionnaire.converters.QuestionnaireConverter;
import pt.upacademy.coreFinalProject.repositories.questionnaire.QuestionnaireRepository;
import pt.upacademy.coreFinalProject.services.questionnaire.QuestionnaireService;

@Path("questionnaire/questionnaire")
@RequestScoped
public class QuestionnaireController extends EntityControllerDTO<QuestionnaireService, QuestionnaireRepository, QuestionnaireConverter, Questionnaire, QuestionnaireDTO>{


//	@GET
//	@Path("/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public QuestionnaireDTO get(@PathParam("id") long id) {
//		return converter.toDTO(service.get(id)); //Usar metodo sem a rightAnswer
//	}
	
	
//	@GET
//    @Path("/account/empty/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//    public List<QuestionnaireDTO> getEmptyQuestionnairesByAccountId(@PathParam("id") long id) {
//    	
//		return converter.listToDTO(service.getEmptyQuestionnairesByAccountId(id));
//    }
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
//	public long create(Questionnaire entity) {
//		return service.create(entity);
//	}
	
	@POST
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String create(@QueryParam("id") List<String> userIds, QuestionnaireDTO dto) {
		
		service.createWithAccountId(userIds, converter.toEntity(dto));
		return "Done";
	}
	
	@GET
    @Path("/account/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public List<QuestionnairePreviewDTO> getAnsweredQuestionnairesByAccountId(@PathParam("id") long id) {
		return converter.questListToPreviewDTO(service.getAnsweredQuestionnairesByAccountId(id));
			
    }
}
