package pt.upacademy.coreFinalProject.services;

import java.util.Collection;
import javax.enterprise.context.RequestScoped;
import pt.upacademy.coreFinalProject.models.AnswerForum;
import pt.upacademy.coreFinalProject.repositories.AnswerRepository;

@RequestScoped
public class AnswerService extends EntityService <AnswerRepository, AnswerForum> {

	public Collection<AnswerForum> getAnswersByQuestionId(long id) {
		return repository.getAnswersByQuestionId(id);
	}
}
