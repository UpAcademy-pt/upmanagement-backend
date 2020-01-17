package pt.upacademy.coreFinalProject.models.converters;

import pt.upacademy.coreFinalProject.models.Evaluation;
import pt.upacademy.coreFinalProject.models.DTOS.EvaluationDTO;

public class EvaluationConverter extends EntityConverter<Evaluation, EvaluationDTO> {

	@Override
	public Evaluation toEntity(EvaluationDTO dto) {
		Evaluation evaluationEntity = new Evaluation();
		evaluationEntity.setId(dto.getId());
		evaluationEntity.setUserId(dto.getUserId());
		evaluationEntity.setGrades(dto.getGrades());
		evaluationEntity.setComment(dto.getComment());
		return evaluationEntity;
	}

	@Override
	public EvaluationDTO toDTO(Evaluation entity) {
		EvaluationDTO evaluationDto = new EvaluationDTO();
		evaluationDto.setId(entity.getId());
		evaluationDto.setUserId(entity.getUserId());
		evaluationDto.setGrades(entity.getGrades());
		evaluationDto.setComment(entity.getComment());
		return evaluationDto;
	}
}
