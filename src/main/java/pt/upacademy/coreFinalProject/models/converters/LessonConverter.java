package pt.upacademy.coreFinalProject.models.converters;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.DTOS.LessonDTO;


@RequestScoped
public class LessonConverter extends EntityConverter <Lesson, LessonDTO> {

	@Override
	public Lesson toEntity(LessonDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LessonDTO toDTO(Lesson ent) {
		// TODO Auto-generated method stub
		return null;
	}

}
