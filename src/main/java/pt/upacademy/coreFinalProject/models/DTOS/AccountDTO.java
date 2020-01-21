package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

public class AccountDTO extends EntityDTO {
	
	private long userId;
	private List <Long>  editionsIds = new ArrayList<Long>();
	
	
	public AccountDTO() {
		}
		
	public AccountDTO(long userId, List<Long> editionsIds) {
		this.userId = userId;
		this.editionsIds = editionsIds;
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
