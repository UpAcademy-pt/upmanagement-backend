package pt.upacademy.coreFinalProject.models.converters;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import pt.upacademy.coreFinalProject.models.Answer;
import pt.upacademy.coreFinalProject.models.Question;
import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.models.Template;
import pt.upacademy.coreFinalProject.models.DTOS.AnswerDTO;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionDTO;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionnaireDTO;

public class QuestionnaireConverter extends EntityConverter<Questionnaire, QuestionnaireDTO>{

	@Override
	public Questionnaire toEntity(QuestionnaireDTO dto) {
		Questionnaire questionnaire = new Questionnaire();
		if (dto.getId() > 0) {
			questionnaire.setId(dto.getId());
		}
		questionnaire.setQuestionList(
				dto.getQuestionList().stream().map(e -> new Question(
				questionnaire, e.getQuestion(), e.getaType(), e.getOptions(), e.getRightAnswer()
				)).collect(Collectors.toSet()));
		questionnaire.setName(dto.getName());
		questionnaire.setAccountId(dto.getAccountId());
		questionnaire.setqType(dto.getqType());
		questionnaire.setEditPrivacy(dto.getEditPrivacy());
		questionnaire.setViewPrivacy(dto.getViewPrivacy());
		questionnaire.setAnswerList(
				dto.getAnswerList().stream().map(a -> new Answer(
				questionnaire, a.getAnswer(), a.getQuestionId() > 0 ? a.getQuestionId() : 0
				)).collect(Collectors.toSet()));
		questionnaire.setScore(dto.getScore());
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
		return questionnaireDTO;
	}
	//long id, long questionaireId, String answer, long questionId)
	public QuestionnaireDTO toDTO(Template template) {
		QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO();
		questionnaireDTO.setId(template.getId());
		questionnaireDTO.setQuestionList(template.getQuestionList().stream().map(e -> {
			QuestionDTO questionDTO = new QuestionDTO();
			questionDTO.setId(e.getId());
			questionDTO.setQuestionnarieId(e.getQuestionnaire().getId());
			questionDTO.setQuestion(e.getQuestion());
			questionDTO.setaType(e.getaType());
			questionDTO.setOptions(e.getOptions());
			questionDTO.setRightAnswer(e.getRightAnswer());
			return questionDTO;
		}).collect(Collectors.toSet()));
		questionnaireDTO.setName(template.getName());
		questionnaireDTO.setqType(template.getqType());
		questionnaireDTO.setEditPrivacy(template.getEditPrivacy());
		questionnaireDTO.setViewPrivacy(template.getViewPrivacy());
		return questionnaireDTO;
	}
	
	public List<QuestionnaireDTO> listToDTO(List<Questionnaire> entity){
		//Set<AnswerDTO> emptyAnswer = new HashSet<AnswerDTO>();
		return entity.stream()
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
						quest.getScore()
						)
						).collect(Collectors.toList());
	}
	
	
}
