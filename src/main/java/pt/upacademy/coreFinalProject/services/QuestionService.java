package pt.upacademy.coreFinalProject.services;

import java.util.Collection;
import javax.enterprise.context.RequestScoped;
import pt.upacademy.coreFinalProject.models.QuestionForum;
import pt.upacademy.coreFinalProject.repositories.QuestionRepository;



@RequestScoped
public class QuestionService extends EntityService <QuestionRepository, QuestionForum>{

	public Collection<QuestionForum> getQuestionsByEditionId(long id) {
		return repository.getQuestionsByEditionId(id);
	}
	
}
