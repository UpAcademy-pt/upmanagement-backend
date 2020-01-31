package pt.upacademy.coreFinalProject.models.lessons.DTOS;

import java.util.ArrayList;
import java.util.Collection;

import pt.upacademy.coreFinalProject.models.core.DTOS.EntityDTO;

public class EditionDTO extends EntityDTO {

	private String name;
	private String type;
	private Collection<LessonDTO> lessonsDtos = new ArrayList<LessonDTO>();
	private Collection<Long> accountsIds = new ArrayList<Long>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Collection<LessonDTO> getLessonsDtos() {
		return lessonsDtos;
	}

	public void setLessonsDtos(Collection<LessonDTO> lessonsDtos) {
		this.lessonsDtos = lessonsDtos;
	}

	public Collection<Long> getAccountsIds() {
		return accountsIds;
	}

	public void setAccountsIds(Collection<Long> accountsIds) {
		this.accountsIds = accountsIds;
	}

}
