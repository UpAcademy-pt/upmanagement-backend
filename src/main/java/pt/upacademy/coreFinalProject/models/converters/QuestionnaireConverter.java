package pt.upacademy.coreFinalProject.models.converters;

import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Question;
import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.models.Template;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionDTO;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionnaireDTO;
import pt.upacademy.coreFinalProject.services.QuestionService;

public class QuestionnaireConverter extends EntityConverter<Questionnaire, QuestionnaireDTO>{

	@Inject
	QuestionService QUESTION_SERVICE;

	@Override
	public Questionnaire toEntity(QuestionnaireDTO dto) {
		Questionnaire questionnaire = new Questionnaire();
		questionnaire.setId(dto.getId());
		//questionnaire.setQuestionList(dto.getQuestionList().stream().map(e -> QUESTION_SERVICE.get(e.getId())).collect(Collectors.toSet()));
		questionnaire.setQuestionList(
				dto.getQuestionList().stream().map(e -> new Question(
				questionnaire, e.getQuestion(), e.getaType(), e.getOptions(), e.getRightAnswer()
				)).collect(Collectors.toSet()));
		questionnaire.setName(dto.getName());
		questionnaire.setAccountIdList(dto.getAccountIdList());
		questionnaire.setqType(dto.getqType());
		questionnaire.setEditPrivacy(dto.getEditPrivacy());
		questionnaire.setViewPrivacy(dto.getViewPrivacy());
		
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
		questionnaireDTO.setAccountIdList(entity.getAccountIdList());
		questionnaireDTO.setqType(entity.getqType());
		questionnaireDTO.setEditPrivacy(entity.getEditPrivacy());
		questionnaireDTO.setViewPrivacy(entity.getViewPrivacy());

		return questionnaireDTO;
	}
	
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
}
