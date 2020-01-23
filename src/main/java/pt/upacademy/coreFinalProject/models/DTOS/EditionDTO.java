package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.Note;
import pt.upacademy.coreFinalProject.models.QuestionForum;

public class EditionDTO extends EntityDTO {
	
	private long editionId;
	private String name;
	private String type;
	private List <LessonDTO>  lessonsDtos = new ArrayList<LessonDTO>();
	private List <AccountDTO> accountsDtos = new ArrayList <AccountDTO> ();
	
	
	public EditionDTO() {
		super();
	}


	public EditionDTO(long editionId, String name, String type, List<LessonDTO> lessonsDtos,
			List<AccountDTO> accountsDtos) {
		super();
		this.editionId = editionId;
		this.name = name;
		this.type = type;
		this.lessonsDtos = lessonsDtos;
		this.accountsDtos = accountsDtos;
	}


	public long getEditionId() {
		return editionId;
	}


	public void setEditionId(long editionId) {
		this.editionId = editionId;
	}


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


	public List<LessonDTO> getLessonsDtos() {
		return lessonsDtos;
	}


	public void setLessonsDtos(List<LessonDTO> lessonsDtos) {
		this.lessonsDtos = lessonsDtos;
	}


	public List<AccountDTO> getAccountsDtos() {
		return accountsDtos;
	}


	public void setAccountsDtos(List<AccountDTO> accountsDtos) {
		this.accountsDtos = accountsDtos;
	}


	@Override
	public String toString() {
		return "EditionDTO [editionId=" + editionId + ", name=" + name + ", type=" + type + ", lessonsDtos="
				+ lessonsDtos + ", accountsDtos=" + accountsDtos + "]";
	}
	
	


	

	
	
	
	
	
	
	


	
	
	
	
}
