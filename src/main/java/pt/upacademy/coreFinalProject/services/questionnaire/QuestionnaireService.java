package pt.upacademy.coreFinalProject.services.questionnaire;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.questionnaire.Qtype;
import pt.upacademy.coreFinalProject.models.questionnaire.Questionnaire;
import pt.upacademy.coreFinalProject.repositories.questionnaire.QuestionnaireRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class QuestionnaireService extends EntityService<QuestionnaireRepository, Questionnaire> {

	@Inject
	private AccountQuestionnaireService accountQuestionnaireService;
	

	public List<Questionnaire> getEmptyQuestionnairesByAccountId(long id) {
		return repository.getEmptyQuestionnairesByAccountId(id);
	}
    
	public List<Questionnaire> getAnsweredQuestionnairesByAccountId(long id) {
		return repository.getAnsweredQuestionnairesByAccountId(id);
	}
	
	public List<Questionnaire> getAllTemplates() {
		return repository.getAllTemplates();
	
	}
	
	public List<Questionnaire> getAllQuizzesByAccountId(long id) {
		return repository.getAllQuizzesByAccountId(id);
	
	}
	
	public Questionnaire getTemplateById(long id) {
		return repository.getEntity(id);
	}
	
	public void createWithAccountId(List<String> userIds, boolean template, Questionnaire quest) {
		
		System.out.println(template);
		System.out.println(template);
		if (template) {
			quest.setTemplate(true);
			long templateId = create(quest);
			System.out.println(templateId);
			quest.setTemplateId(templateId);
		}
		quest.setTemplate(false);
		
		
		List<Long> userIdsLong = userIds.stream().map(Long::valueOf).collect(Collectors.toList());
		List<Long> accountIds = accountQuestionnaireService.getAccountIdListByUserList(userIdsLong);
		accountIds.stream().forEach(id -> {
			quest.setAccountId(id);
			create(quest);
		});		
	}
	
	@Override
	public void update(Questionnaire questionnaire) {
		if (questionnaire.getqType().equals(Qtype.QUIZ)) {
			questionnaire.calculateScore();
		}
		repository.editEntity(questionnaire);
	}

}
