package pt.upacademy.coreFinalProject.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = Account.GET_ALL_ACCOUNTS, query = "SELECT a FROM Account a"),
		@NamedQuery(name = Account.GET_ALL_ACCOUNT_IDs, query = "SELECT a.id FROM Account a"),
		@NamedQuery(name = Account.GET_ACCOUNT_COUNT, query = "SELECT COUNT(a.id) FROM Account a"),
		@NamedQuery(name = Account.GET_ACCOUNT_BY_USERID, query = "SELECT a FROM Account a WHERE a.userId = :userId") })

public class Account extends EntityRoot {

	private static final long serialVersionUID = 1L;

	public static final String GET_ALL_ACCOUNTS = "getAllAccounts";
	public static final String GET_ALL_ACCOUNT_IDs = "getAllAccountsIds";
	public static final String GET_ACCOUNT_COUNT = "getAccountCount";
	public static final String GET_ACCOUNT_BY_USERID = "getAccountByUserId";

	private long userId;
	@OneToMany(mappedBy = "account")
	private Set<Subscription> subscriptions;

	public Account() {
	}

	public Account(long userId, Set<Subscription> subscriptions) {
		super();
		this.userId = userId;
		this.subscriptions = subscriptions;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Set<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(Set<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	@Override
	public String toString() {
		return "Account [userId=" + userId + "subscriptions=" + subscriptions + "]";
	}

}
