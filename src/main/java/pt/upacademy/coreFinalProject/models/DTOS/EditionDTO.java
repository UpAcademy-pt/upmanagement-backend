package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;
import pt.upacademy.coreFinalProject.models.Lesson;

public class EditionDTO extends EntityDTO {
	
	private long editionId;
	private String name;
	private String type;
	private List <Lesson>  lessons = new ArrayList<Lesson>();
	private List <AccountDTO> accountsDtos = new ArrayList <AccountDTO> ();
	
	
	public EditionDTO() {
		super();
	}


	public EditionDTO(long editionId, String name, String type, List<Lesson> lessons, List<AccountDTO> accountsDtos) {
		super();
		this.editionId = editionId;
		this.name = name;
		this.type = type;
		this.lessons = lessons;
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

	public List<AccountDTO> getAccountsDtos() {
		return accountsDtos;
	}

	public void setAccountsDtos(List<AccountDTO> accountsDtos) {
		this.accountsDtos = accountsDtos;
	}


	public List<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}

	



	

	
	
	
	
	
	
	


	
	
	
	
}
