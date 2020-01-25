package pt.upacademy.coreFinalProject.models.converters;

import java.util.stream.Collectors;

import pt.upacademy.coreFinalProject.models.Answer;
import pt.upacademy.coreFinalProject.models.AnsweredQuestionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.AnswerDTO;
import pt.upacademy.coreFinalProject.models.DTOS.AnsweredQuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.DTOS.AnsweredQuestionnairePreviewDTO;

public class AnsweredQuestionnaireConverter extends EntityConverter<AnsweredQuestionnaire, AnsweredQuestionnaireDTO>{

	@Override
	public AnsweredQuestionnaire toEntity(AnsweredQuestionnaireDTO dto) {
		AnsweredQuestionnaire answeredQuestionnaire = new AnsweredQuestionnaire();
		if(dto.getId() > 0) {
			answeredQuestionnaire.setId(dto.getId());
		}
		answeredQuestionnaire.setAnswerList(
				dto.getAnswerList().stream().map(answerDTO -> new Answer(
						answerDTO.getId(),
						answeredQuestionnaire,
						answerDTO.getAnswer(),
						answerDTO.getQuestionId()
						)).collect(Collectors.toSet()));
		answeredQuestionnaire.setQuestionnaireId(dto.getQuestionnaireId());
		answeredQuestionnaire.setAccountId(dto.getAccountId());
		answeredQuestionnaire.setqType(dto.getqType());
		answeredQuestionnaire.setDate(dto.getDate());
		answeredQuestionnaire.setScore(dto.getScore());
		return answeredQuestionnaire;
	}
	
	@Override
	public AnsweredQuestionnaireDTO toDTO(AnsweredQuestionnaire entity) {
		return new AnsweredQuestionnaireDTO(
			entity.getId(),
			entity.getAnswerList().stream().map(answer -> new AnswerDTO(
					answer.getId(),
					answer.getAnsweredQuestionaire().getId(),
					answer.getAnswer(),
					answer.getQuestionId()
					)).collect(Collectors.toSet()),
			entity.getQuestionnaireId(),
			entity.getAccountId(),
			entity.getqType(),
			entity.getDate(),
			entity.getScore()
			);
	}
	
	public AnsweredQuestionnairePreviewDTO toDTOPreview(AnsweredQuestionnaire entity) {
		return new AnsweredQuestionnairePreviewDTO(
				entity.getId(),
				entity.getQuestionnaireId(),
				entity.getAccountId(),
				entity.getDate(),
				entity.getScore()
				);
	}

}
