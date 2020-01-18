package pt.upacademy.coreFinalProject.models.converters;

import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Questionnaire;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionDTO;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionnaireDTO;
import pt.upacademy.coreFinalProject.services.QuestionService;

public class QuestionnaireConverter extends EntityConverter<Questionnaire, QuestionnaireDTO>{

	@Inject
	QuestionService QUESTION_SERVICE;
	
	//Se calhar aqui nao podemos fazer o cruzamento entre QuestionnaireConverter e Question Service
	//Talvez seja melhor criar o intermedio QuestionnaireService

	@Override
	public Questionnaire toEntity(QuestionnaireDTO dto) {
		Questionnaire Questionnaire = new Questionnaire();
		Questionnaire.setId(dto.getId());
		Questionnaire.setQuestionList(dto.getQuestionList().stream().map(e -> QUESTION_SERVICE.get(e.getId())).collect(Collectors.toList()));
		Questionnaire.setName(dto.getName());
		Questionnaire.setTemplate(dto.isTemplate());
		
		return Questionnaire;
	}

	@Override
	public QuestionnaireDTO toDTO(Questionnaire entity) {
		QuestionnaireDTO QuestionnaireDTO = new QuestionnaireDTO();
		QuestionnaireDTO.setId(entity.getId());
		QuestionnaireDTO.setQuestionList(entity.getQuestionList().stream().map(e -> new QuestionDTO(e.getQuestion(), e.getaType(), e.getOptions(), e.getFilter()) ).collect(Collectors.toList()));
		QuestionnaireDTO.setName(entity.getName());
		QuestionnaireDTO.setTemplate(entity.isTemplate());
		
		return QuestionnaireDTO;
	}
	
}
