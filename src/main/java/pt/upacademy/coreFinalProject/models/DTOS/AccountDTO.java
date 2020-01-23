package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

public class AccountDTO extends EntityDTO {
	
	private long id;
	private long userId;
	
	
	public AccountDTO() {
		}
		
	public AccountDTO(long id, long userId) {
		super();
		this.id = id;
		this.userId = userId;
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

	@Override
	public String toString() {
		return "AccountDTO [id=" + id + ", userId=" + userId + "]";
	}

	

}
