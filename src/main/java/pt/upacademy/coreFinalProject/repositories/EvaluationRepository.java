package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Evaluation;

@RequestScoped
public class EvaluationRepository extends EntityRepository<Evaluation> {

	@Override
	protected Class<Evaluation> getEntityClass() {
		return Evaluation.class;
	}

	@Override
	protected String getAllEntities() {
		return Evaluation.GET_ALL_EVALUATIONS;
	}

}
