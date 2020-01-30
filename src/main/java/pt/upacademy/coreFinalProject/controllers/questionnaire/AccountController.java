package pt.upacademy.coreFinalProject.controllers.questionnaire;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.controllers.core.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.DTOS.AccountQuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.converters.AccountQuestionnaireConverter;
import pt.upacademy.coreFinalProject.models.questionnaire.AccountQuestionnaire;
import pt.upacademy.coreFinalProject.repositories.questionnaire.AccountQuestionnaireRepository;
import pt.upacademy.coreFinalProject.services.questionnaire.AccountQuestionnaireService;


@Path("questionnaire/account")
@RequestScoped
public class AccountController extends EntityControllerDTO<AccountQuestionnaireService, AccountQuestionnaireRepository, AccountQuestionnaireConverter, AccountQuestionnaire, AccountQuestionnaireDTO>{
	
//	public String getAccountQuestionnaires (){
//		return AccountQuestionnaire.GET_ALL_ACCOUNTS;
//	}
	
	@GET
    @Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public AccountQuestionnaireDTO getAccountbyId(@PathParam("id") long id) {
		
		return converter.toDTO(service.get(id));
				//getEmptyQuestionnairesByAccountId
				
		//return converter.listToDTO(service.getEmptyQuestionnairesByAccountId(id));
    }
	
	@GET
    @Path("/user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public AccountQuestionnaireDTO getAccountByUserId(@PathParam("id") long userId) {
		return converter.toDTO(service.getAccountByUserId(userId));
    }
	
}
