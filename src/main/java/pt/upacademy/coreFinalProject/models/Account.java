package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({ @NamedQuery(name = Account.GET_ALL_ACCOUNTS, query = "SELECT a FROM Account a"),
				@NamedQuery(name = Account.GET_ACCOUNT_BY_USERID, query = "SELECT a FROM Account a WHERE a.userId = :id"),
				@NamedQuery(name = Account.GET_ACCOUNT_ID_LIST_BY_USERID_LIST, query = "SELECT a.id FROM Account a WHERE a.userId IN (:ids)")})


public class Account extends EntityRoot {
	

	public static final String GET_ALL_ACCOUNTS = "getAllAccounts";
	public static final String GET_ACCOUNT_BY_USERID = "getAccountByUserId";
	public static final String GET_ACCOUNT_ID_LIST_BY_USERID_LIST = "getAccountListByUserList";
	private static final long serialVersionUID = 1L;

	private long userId;
	private long[] userAcademies;

	public Account() {}

	public Account(long id, long userId, long[] userAcademies) {
		setId(id);
		this.userId = userId;
		this.userAcademies = userAcademies;
	}

	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public long[] getUserAcademies() {
		return userAcademies;
	}
	
	public void setUserAcademies(long[] userAcademies) {
		this.userAcademies = userAcademies;
	}
	
}
