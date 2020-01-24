package pt.upacademy.coreFinalProject.models.converters;

import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.AnswerDTO;
import pt.upacademy.coreFinalProject.models.DTOS.AnsweredQuestionnaireDTO;
import pt.upacademy.coreFinalProject.services.AnswerService;

public class AnsweredQuestionnaireConverter extends EntityConverter<AnsweredQuestionnaire, AnsweredQuestionnaireDTO>{

	@Inject
	AnswerService ANSWER_SERVICE;
	
	@Override
	public AnsweredQuestionnaire toEntity(AnsweredQuestionnaireDTO dto) {
		
		return new AnsweredQuestionnaire(
			dto.getId(),
			dto.getAnswerList().stream().map(e -> ANSWER_SERVICE.get(e.getId())).collect(Collectors.toSet()),
			dto.getQuestionnaireId(),
			dto.getAccountId(),
			dto.getqType(),
			dto.getDate(),
			dto.getScore()
			);
	}
	
	@Override
	public AnsweredQuestionnaireDTO toDTO(AnsweredQuestionnaire entity) {
		
		return new AnsweredQuestionnaireDTO(
			entity.getId(),
			entity.getAnswerList().stream().map(answer -> new AnswerDTO(answer.getId(), answer.getAnsweredQuestionaire().getId(), answer.getAnswer(), answer.getQuestionId())).collect(Collectors.toSet()),
			entity.getQuestionnaireId(),
			entity.getAccountId(),
			entity.getqType(),
			entity.getDate(),
			entity.getScore()
			);
	}

}
