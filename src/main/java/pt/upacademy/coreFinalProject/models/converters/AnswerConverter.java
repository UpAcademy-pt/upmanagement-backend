package pt.upacademy.coreFinalProject.models.converters;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Answer;
import pt.upacademy.coreFinalProject.models.DTOS.AnswerDTO;
import pt.upacademy.coreFinalProject.services.AnsweredQuestionnaireService;

public class AnswerConverter extends EntityConverter<Answer, AnswerDTO>{
	
	@Inject
	AnsweredQuestionnaireService ANSWER_QUESTIONNAIRE_SERVICE;

	@Override
	public Answer toEntity(AnswerDTO dto) {
		return new Answer(
				dto.getId(),
				ANSWER_QUESTIONNAIRE_SERVICE.get(dto.getAnsweredQuestionaireId()),
				dto.getAnswer(),
				dto.getQuestionId()
				);
	}

	@Override
	public AnswerDTO toDTO(Answer entity) {
		return new AnswerDTO(
				entity.getId(),
				entity.getAnsweredQuestionaire().getId(),
				entity.getAnswer(),
				entity.getQuestionId()
				);
	}

}
