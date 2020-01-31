package pt.upacademy.coreFinalProject.models.questionnaire.converters;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import pt.upacademy.coreFinalProject.models.core.converters.EntityConverter;
import pt.upacademy.coreFinalProject.models.questionnaire.Answer;
import pt.upacademy.coreFinalProject.models.questionnaire.Question;
import pt.upacademy.coreFinalProject.models.questionnaire.Questionnaire;
import pt.upacademy.coreFinalProject.models.questionnaire.DTOs.AnswerDTO;
import pt.upacademy.coreFinalProject.models.questionnaire.DTOs.QuestionDTO;
import pt.upacademy.coreFinalProject.models.questionnaire.DTOs.QuestionnaireDTO;
import pt.upacademy.coreFinalProject.models.questionnaire.DTOs.QuestionnairePreviewDTO;

public class QuestionnaireConverter extends EntityConverter<Questionnaire, QuestionnaireDTO>{

	@Override
	public Questionnaire toEntity(QuestionnaireDTO dto) {
		Questionnaire questionnaire = new Questionnaire();
		if (dto.getId() > 0) {
			questionnaire.setId(dto.getId());
		}
		questionnaire.setQuestionList(
				dto.getQuestionList().stream().map(e -> new Question(
				e.getId() > 0 ? e.getId() : 0, questionnaire, e.getQuestion(), e.getaType(), e.getOptions(), e.getRightAnswer()
				)).collect(Collectors.toSet()));
		questionnaire.setName(dto.getName());
		questionnaire.setAccountId(dto.getAccountId());
		questionnaire.setqType(dto.getqType());
		questionnaire.setEditPrivacy(dto.getEditPrivacy());
		questionnaire.setViewPrivacy(dto.getViewPrivacy());
		questionnaire.setAnswerList(
				dto.getAnswerList().stream().map(a -> new Answer(
				a.getId() > 0 ? a.getId() : 0, questionnaire, a.getAnswer(), a.getQuestionId() > 0 ? a.getQuestionId() : 0
				)).collect(Collectors.toSet()));
		questionnaire.setScore(dto.getScore());
		questionnaire.setTemplateId(dto.getTemplateId());
		questionnaire.setCreateDate(dto.getCreateDate());
		questionnaire.setLastModifiedDate(dto.getLastModifiedDate());
		questionnaire.setTemplate(dto.isTemplate());
		return questionnaire;
	}
	
	@Override
	public QuestionnaireDTO toDTO(Questionnaire entity) {
		QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO();
		questionnaireDTO.setId(entity.getId());
		questionnaireDTO.setQuestionList(entity.getQuestionList().stream().map(e -> {
			QuestionDTO questionDTO = new QuestionDTO();
			questionDTO.setId(e.getId());
			questionDTO.setQuestionnarieId(e.getQuestionnaire().getId());
			questionDTO.setQuestion(e.getQuestion());
			questionDTO.setaType(e.getaType());
			questionDTO.setOptions(e.getOptions());
			questionDTO.setRightAnswer(e.getRightAnswer());			
			return questionDTO;
		}).collect(Collectors.toSet()));
		questionnaireDTO.setName(entity.getName());
		questionnaireDTO.setAccountId(entity.getAccountId());
		questionnaireDTO.setqType(entity.getqType());
		questionnaireDTO.setEditPrivacy(entity.getEditPrivacy());
		questionnaireDTO.setViewPrivacy(entity.getViewPrivacy());
		questionnaireDTO.setAnswerList(entity.getAnswerList().stream().map(a -> {
			AnswerDTO answerDTO = new AnswerDTO();
			answerDTO.setId(a.getId());
			answerDTO.setQuestionnaireId(a.getQuestionaire().getId());
			answerDTO.setAnswer(a.getAnswer());
			answerDTO.setQuestionId(a.getQuestionId());
			return answerDTO;
		}).collect(Collectors.toSet()));
		questionnaireDTO.setScore(entity.getScore());
		questionnaireDTO.setTemplateId(entity.getTemplateId());
		questionnaireDTO.setCreateDate(entity.getCreateDate());
		questionnaireDTO.setLastModifiedDate(entity.getLastModifiedDate());
		questionnaireDTO.setTemplate(entity.isTemplate());
		return questionnaireDTO;
	}
	
	
	public List<QuestionnaireDTO> listToDTO(List<Questionnaire> entities){
		//Set<AnswerDTO> emptyAnswer = new HashSet<AnswerDTO>();
		return entities.stream()
				.map(quest -> new QuestionnaireDTO(
						quest.getId(),
						quest.getQuestionList().stream().map(question -> new QuestionDTO(
								question.getId(),
								question.getQuestionnaire().getId(),
								question.getQuestion(),
								question.getaType(),
								question.getOptions(),
								question.getRightAnswer()
								)).collect(Collectors.toSet()),
						quest.getName(),
						quest.getAccountId(),
						quest.getqType(),
						quest.getEditPrivacy(),
						quest.getViewPrivacy(),
						(quest.getAnswerList() == null) ? new HashSet<AnswerDTO>() :
							quest.getAnswerList().stream().map(answer -> new AnswerDTO(
								answer.getId(),
								answer.getQuestionaire().getId(),
								answer.getAnswer(),
								answer.getQuestionId()
								)).collect(Collectors.toSet()),
						quest.getScore(),
						quest.getTemplateId(),
						quest.getCreateDate(),
						quest.getLastModifiedDate(),
						quest.isTemplate()
						)
						).collect(Collectors.toList());
	}
	
	public List<QuestionnairePreviewDTO> questListToPreviewDTO(List<Questionnaire> entities){
		return entities.stream().map(quest -> new QuestionnairePreviewDTO(
				quest.getId(),
				quest.getName(),
				quest.getqType(),
				quest.getEditPrivacy(),
				quest.getViewPrivacy(),
				quest.getCreateDate(),
				quest.getLastModifiedDate()
				)).collect(Collectors.toList());
	}
	
}
