package pt.upacademy.coreFinalProject.controllers.questionnaire;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

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
	AnsweredQuestionnaireService answeredQuestionnaire_Service;
	
	
	@GET
    @Path("/account/{id}")
    public String getQuestsByAccId(long id) {
    	return answeredQuestionnaire_Service.getQuestFromAcc(id);
    }
    
}
