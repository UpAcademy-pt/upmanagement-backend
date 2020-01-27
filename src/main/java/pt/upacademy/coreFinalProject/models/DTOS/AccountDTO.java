package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

public class AccountDTO extends EntityDTO {
	
	private long id;
	private long userId;
	private List <EditionDTO>  editionsDtos = new ArrayList<EditionDTO>();
	
	
	public AccountDTO() {
		}
		
	public AccountDTO(long id, long userId, List<EditionDTO> editionsDtos) {
		this.id = id;
		this.userId = userId;
		this.editionsDtos = editionsDtos;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public List<EditionDTO> getEditionsDtos() {
		return editionsDtos;
	}

	public void setEditionsDtos(List<EditionDTO> editionsDtos) {
		this.editionsDtos = editionsDtos;
	}

	@Override
	public String toString() {
		return "AccountDTO [userId=" + userId + ", editionsDtos=" + editionsDtos + "]";
	}
	
}
