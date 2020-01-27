package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

public class EditionDTO extends EntityDTO {

	private String name;
	private String type;
//	private List<LessonDTO> lessonsDtos = new ArrayList<LessonDTO>();
	private List<Long> accountsIds = new ArrayList<Long>();

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

	public List<Long> getAccountsIds() {
		return accountsIds;
	}

	public void setAccountsIds(List<Long> accountsIds) {
		this.accountsIds = accountsIds;
	}

//	public List<LessonDTO> getLessonsDtos() {
//		return lessonsDtos;
//	}
//
//	public void setLessonsDtos(List<LessonDTO> lessonsDtos) {
//		this.lessonsDtos = lessonsDtos;
//	}



//	@Override
//	public String toString() {
//		return "EditionDTO [editionId=" + editionId + ", name=" + name + ", type=" + type + ", lessonsDtos="
//				+ lessonsDtos + ", accountsDtos=" + accountsDtos + "]";
//	}

}
