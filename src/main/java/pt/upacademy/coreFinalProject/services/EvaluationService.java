package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Evaluation;
import pt.upacademy.coreFinalProject.repositories.EvaluationRepository;

@RequestScoped
public class EvaluationService extends EntityService<EvaluationRepository, Evaluation> {

	@Inject
	protected EvaluationRepository evalRep;
}
