package pt.upacademy.coreFinalProject.models.converters;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Question;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionDTO;
import pt.upacademy.coreFinalProject.services.QuestionService;
import pt.upacademy.coreFinalProject.services.QuestionnaireService;


public class QuestionConverter extends EntityConverter<Question, QuestionDTO> {

	@Inject
	QuestionnaireService QUESTIONNAIRE_SERVICE;
	
	@Override
	public Question toEntity(QuestionDTO dto) {
		Question question = new Question();
		question.setId(dto.getId());
		question.setQuestionnaire(QUESTIONNAIRE_SERVICE.get(dto.getQuestionnarieId()));
		question.setQuestion(dto.getQuestion());
		question.setaType(dto.getaType());
		question.setOptions(dto.getOptions());
		question.setRightAnswer(dto.getRightAnswer());		
		
		return question;
	}
	
	@Override
	public QuestionDTO toDTO(Question entity) {
		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setId(entity.getId());
		questionDTO.setQuestionnarieId(entity.getQuestionnaire().getId());
		questionDTO.setQuestion(entity.getQuestion());
		questionDTO.setaType(entity.getaType());
		questionDTO.setOptions(entity.getOptions());
		questionDTO.setRightAnswer(entity.getRightAnswer());
		
		return questionDTO;
	}
}
