package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({ @NamedQuery(name = Account.GET_ALL_ACCOUNTS, query = "SELECT a FROM Account a")})
@NamedQuery(name = Account.ADD_PENDING_QUESTIONNAIRE, query="UPDATE Account a SET a.pendingQuentionnairesIds = i WHERE a.id = :accountId")

public class Account extends EntityRoot {
	

	public static final String GET_ALL_ACCOUNTS = "getAllAccounts";
	public static final String ADD_PENDING_QUESTIONNAIRE = "addpendingquestionnaire";
	private static final long serialVersionUID = 1L;

	private long userId;
	private long[] pendingQuentionnairesIds;
	private long[] userAcademies;

	public Account() {}

	public Account(long id, long userId, long[] pendingQuentionnairesIds, long[] userAcademies) {
		setId(id);
		this.userId = userId;
		this.pendingQuentionnairesIds = pendingQuentionnairesIds;
		this.userAcademies = userAcademies;
	}

	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public long[] getPendingQuentionnairesIds() {
		return pendingQuentionnairesIds;
	}
	
	public void setPendingQuentionnairesIds(long[] pendingQuentionnairesIds) {
		this.pendingQuentionnairesIds = pendingQuentionnairesIds;
	}
	
	public long[] getUserAcademies() {
		return userAcademies;
	}
	
	public void setUserAcademies(long[] userAcademies) {
		this.userAcademies = userAcademies;
	}
	
	
	
	

	

}
