package pt.upacademy.coreFinalProject.repositories.academyManager;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Evaluation;

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
