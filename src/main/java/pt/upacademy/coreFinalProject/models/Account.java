package pt.upacademy.coreFinalProject.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Account.GET_ALL_ACCOUNTS, query = "SELECT a FROM Account a"),
		@NamedQuery(name = Account.GET_ALL_ACCOUNT_IDs, query = "SELECT a.id FROM Account a"),
		@NamedQuery(name = Account.GET_ACCOUNT_COUNT, query = "SELECT COUNT(a.id) FROM Account a"),
		@NamedQuery(name = Account.GET_ACCOUNT_BY_USERID, query = "SELECT a FROM Account a WHERE a.userId = :userId")})

public class Account extends EntityRoot {

	private static final long serialVersionUID = 1L;

	public static final String GET_ALL_ACCOUNTS = "getAllAccounts";
	public static final String GET_ALL_ACCOUNT_IDs = "getAllAccountsIds";
	public static final String GET_ACCOUNT_COUNT = "getAccountCount";
	public static final String GET_ACCOUNT_BY_USERID = "getAccountByUserId";

	private long userId;
	@ManyToMany(mappedBy = "accounts", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Collection<Edition> editions = new HashSet<>();

	public Collection<Edition> getEditions() {
		return editions;
	}

	public void setEditions(Collection<Edition> editions) {
		this.editions = editions;
	}

	public Account() {
	}

	public Account(long userId, List<Edition> editions) {
		this.userId = userId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Account [userId=" + userId + "]";
	}

}
