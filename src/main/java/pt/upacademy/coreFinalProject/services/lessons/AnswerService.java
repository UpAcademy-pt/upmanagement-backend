package pt.upacademy.coreFinalProject.services.lessons;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.lessons.AnswerForum;
import pt.upacademy.coreFinalProject.repositories.lessons.AnswerRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class AnswerService extends EntityService <AnswerRepository, AnswerForum> {

	public Collection<AnswerForum> getAnswersByQuestionId(long id) {
		return repository.getAnswersByQuestionId(id);
	}
	
	
	
	public void deleteAnswersByQuestionId (long id) {
		repository.deleteAnswersByQuestionId(id);
		}
}
