package pt.upacademy.coreFinalProject.models.converters;

import pt.upacademy.coreFinalProject.models.QuestionnaireDTO;

import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.Services.QuestionService;
import pt.upacademy.coreFinalProject.models.QuestionDTO;
import pt.upacademy.coreFinalProject.models.Questionnaire;

public class QuestionnaireConverter extends EntityConverter<Questionnaire, QuestionnaireDTO> {
	
	
	@Inject
	QuestionService QUESTION_SERVICE;

	@Override
	public Questionnaire toEntity(QuestionnaireDTO dto) {
		Questionnaire Questionnaire = new Questionnaire();
		Questionnaire.setID(dto.getId());
		Questionnaire.setQuestionList(dto.getQuestionList().stream().map(e -> QUESTION_SERVICE.retrieve(e.getId())).collect(Collectors.toList()));
		Questionnaire.setName(dto.getName());
		Questionnaire.setTemplate(dto.isTemplate());
		
		return Questionnaire;
	}

	@Override
	public QuestionnaireDTO toDTO(Questionnaire entity) {
		QuestionnaireDTO QuestionnaireDTO = new QuestionnaireDTO();
		QuestionnaireDTO.setId(entity.getID());
		
		QuestionnaireDTO.setQuestionList(entity.getQuestionList().stream().map(e -> new QuestionDTO(e.getQuestion(), e.getaType(), e.getOptions(), e.getFilter()) ).collect(Collectors.toList()));
		
		
		
		QuestionnaireDTO.setName(entity.getName());
		QuestionnaireDTO.setTemplate(entity.isTemplate());
		
		return QuestionnaireDTO;
	}

}
