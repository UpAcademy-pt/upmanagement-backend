package pt.upacademy.coreFinalProject.services.lessons;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.lessons.QuestionForum;
import pt.upacademy.coreFinalProject.repositories.lessons.QuestionRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;



@RequestScoped
public class QuestionService extends EntityService <QuestionRepository, QuestionForum>{

	public Collection<QuestionForum> getQuestionsByEditionId(long id) {
		return repository.getQuestionsByEditionId(id);
	}
	
}
