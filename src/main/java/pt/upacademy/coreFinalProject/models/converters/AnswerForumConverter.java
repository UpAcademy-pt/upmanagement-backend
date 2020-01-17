package pt.upacademy.coreFinalProject.models.converters;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.AnswerForum;
import pt.upacademy.coreFinalProject.models.DTOS.AnswerForumDTO;


@RequestScoped
public class AnswerForumConverter extends EntityConverter <AnswerForum, AnswerForumDTO>{

	@Override
	public AnswerForum toEntity(AnswerForumDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnswerForumDTO toDTO(AnswerForum ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
