package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

public class AccountDTO extends EntityDTO {
	
	private long id;
	private long userId;
	private List <Long>  editionsIds = new ArrayList<Long>();
	
	
	public AccountDTO() {
		}
		
	public AccountDTO(long id, long userId, List<Long> editionsIds) {
		super();
		this.id = id;
		this.userId = userId;
		this.editionsIds = editionsIds;
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

	public List<Long> getEditionsIds() {
		return editionsIds;
	}

	public void setEditionsIds(List<Long> editionsIds) {
		this.editionsIds = editionsIds;
	}

	@Override
	public String toString() {
		return "AccountDTO [userId=" + userId + ", editionsIds=" + editionsIds + "]";
	}
	
}
