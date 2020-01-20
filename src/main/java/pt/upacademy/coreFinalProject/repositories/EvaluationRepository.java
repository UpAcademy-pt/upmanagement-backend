package pt.upacademy.coreFinalProject.repositories;

import pt.upacademy.coreFinalProject.models.Evaluation;
import pt.upacademy.coreFinalProject.models.DTOS.EvaluationDTO;

public class EvaluationRepository extends EntityRepository<Evaluation, EvaluationDTO> {

	@Override
	protected Class<Evaluation> getEntityClass() {
		return Evaluation.class;
	}

	@Override
	protected String getAllEntities() {
		return Evaluation.GET_ALL_EVALUATIONS;
	}

}
