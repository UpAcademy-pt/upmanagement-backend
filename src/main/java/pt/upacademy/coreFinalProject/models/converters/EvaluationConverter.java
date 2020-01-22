package pt.upacademy.coreFinalProject.models.converters;

import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Evaluation;
import pt.upacademy.coreFinalProject.models.DTOS.EvaluationDTO;
import pt.upacademy.coreFinalProject.services.AccountService;
import pt.upacademy.coreFinalProject.services.GradeService;

public class EvaluationConverter extends EntityConverter<Evaluation, EvaluationDTO> {

	@Inject
	protected AccountService accService;
	@Inject
	protected GradeService gradeService;
	
	@Override
	public Evaluation toEntity(EvaluationDTO dto) {
		Evaluation evaluationEntity = new Evaluation();
		evaluationEntity.setId(dto.getId());
		evaluationEntity.setAccount(accService.get(dto.getAccountId()));
		evaluationEntity.setGrades(dto.getGradesIds().stream().map(gradesIds -> gradeService.get(gradesIds)).collect(Collectors.toSet()));
		evaluationEntity.setComment(dto.getComment());
		return evaluationEntity;
	}

	@Override
	public EvaluationDTO toDTO(Evaluation entity) {
		EvaluationDTO evaluationDto = new EvaluationDTO();
		evaluationDto.setId(entity.getId());
		evaluationDto.setAccountId(entity.getAccount().getId());
		evaluationDto.setGradesIds(entity.getGrades().parallelStream().map(grades -> grades.getId()).collect(Collectors.toList()));
		evaluationDto.setComment(entity.getComment());
		return evaluationDto;
	}
}
