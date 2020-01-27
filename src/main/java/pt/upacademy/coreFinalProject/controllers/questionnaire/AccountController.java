package pt.upacademy.coreFinalProject.controllers.questionnaire;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.converters.AccountConverter;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;
import pt.upacademy.coreFinalProject.services.AccountService;


@Path("questionnaire/account")
@RequestScoped
public class AccountController extends EntityControllerDTO<AccountService, AccountRepository, AccountConverter, Account, AccountDTO>{
	
	public String getAccountQuestionnaires (){
		return Account.GET_ALL_ACCOUNTS;
	}
	
	@GET
    @Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public AccountDTO getAccountbyId(@PathParam("id") long id) {
		return converter.toDTO(service.get(id));
				//getEmptyQuestionnairesByAccountId
				
		//return converter.listToDTO(service.getEmptyQuestionnairesByAccountId(id));
    }
	
}
