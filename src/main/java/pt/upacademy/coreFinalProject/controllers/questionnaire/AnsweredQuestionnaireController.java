package pt.upacademy.coreFinalProject.controllers.questionnaire;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.AnsweredQuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.converters.AnsweredQuestionnaireConverter;
import pt.upacademy.coreFinalProject.repositories.AnsweredQuestionnaireRepository;
import pt.upacademy.coreFinalProject.services.AnsweredQuestionnaireService;


@Path("questionnaire/answeredquestionnaire")
@RequestScoped
public class AnsweredQuestionnaireController extends EntityControllerDTO<AnsweredQuestionnaireService, AnsweredQuestionnaireRepository, AnsweredQuestionnaireConverter, AnsweredQuestionnaire, AnsweredQuestionnaireDTO>{
    
	@Inject
	AnsweredQuestionnaireService ANSWEREDQUESTIONNAIRE_SERVICE;
	
	
	@GET
    @Path("/account/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public List<AnsweredQuestionnaireDTO> getQuestsByAccId(@PathParam("id") long id) {
    	
		return converter.listToDTO(ANSWEREDQUESTIONNAIRE_SERVICE.getQuestFromAcc(id));
    }
    
}
