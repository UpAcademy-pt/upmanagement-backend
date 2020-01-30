package pt.upacademy.coreFinalProject.models.academyManager.DTOS;

import pt.upacademy.coreFinalProject.models.core.DTOS.EntityDTO;

public class MissedClassDTO extends EntityDTO {

	private int accountId;
	private String data;
	private Boolean justified;
	
	

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Boolean getJustified() {
		return justified;
	}
	public void setJustified(Boolean justified) {
		this.justified = justified;
	}
	
	
	
	public MissedClassDTO() {
		super();
	}
	
	
	public MissedClassDTO(int userId, String data, Boolean justified) {
		super();
		this.accountId = userId;
		this.data = data;
		this.justified = justified;
	}
	@Override
	public String toString() {
		return "MissedClassDTO [userId=" + accountId + ", data=" + data + ", justified=" + justified + "]";
	}
	
	
	
}
