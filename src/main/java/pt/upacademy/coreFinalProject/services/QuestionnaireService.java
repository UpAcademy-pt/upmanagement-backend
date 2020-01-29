package pt.upacademy.coreFinalProject.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionnairePreviewDTO;
import pt.upacademy.coreFinalProject.repositories.QuestionnaireRepository;

@RequestScoped
public class QuestionnaireService extends EntityService<QuestionnaireRepository, Questionnaire> {

	@Inject
	AccountService ACCOUNT_SERVICE;
	

	public List<Questionnaire> getEmptyQuestionnairesByAccountId(long id) {
		return repository.getEmptyQuestionnairesByAccountId(id);
	}
    
	public List<Questionnaire> getAnsweredQuestionnairesByAccountId(long id) {
		return repository.getAnsweredQuestionnairesByAccountId(id);
	}
	
	public void createWithAccountId(List<String> userIds, Questionnaire quest) {
		System.out.println(userIds.toString());
		List<Long> userIdsLong = userIds.stream().map(Long::valueOf).collect(Collectors.toList());
		List<Long> accountIds = ACCOUNT_SERVICE.getAccountIdListByUserList(userIdsLong);
		System.out.println(accountIds.toString());
		accountIds.stream().forEach(id -> {
			System.out.println(id);
			quest.setAccountId(id);
			create(quest);
		});		
	}
	
	
}
