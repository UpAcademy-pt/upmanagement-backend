package pt.upacademy.coreFinalProject.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
	@NamedQuery(name = MissedClass.GET_ALL_MISSEDCLASSES_BY_ID, query = "SELECT m FROM MissedClass m WHERE m.accountId = :accountId")
})
public class MissedClass extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	
	public static final String GET_ALL_MISSEDCLASSES_BY_ID = "getAllMissedClassesById";
	
	private int accountId;
	private LocalDate data;
	private Boolean justified;
	

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Boolean getJustified() {
		return justified;
	}
	public void setJustified(Boolean justified) {
		this.justified = justified;
	}
	
	
	
	public MissedClass() {
		super();
	}
	public MissedClass(int userId, LocalDate data, Boolean justified) {
		super();
		this.accountId = userId;
		this.data = data;
		this.justified = justified;
	}
	
	
}
