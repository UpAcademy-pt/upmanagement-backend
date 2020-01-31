package pt.upacademy.coreFinalProject.models.lessons;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import pt.upacademy.coreFinalProject.models.core.EntityRoot;

@Entity
@NamedQueries({ @NamedQuery(name = AccountLessons.GET_ALL_LESSONS_ACCOUNTS, query = "SELECT a FROM AccountLessons a"),
		@NamedQuery(name = AccountLessons.GET_ALL_LESSONS_ACCOUNTS_IDs, query = "SELECT a.id FROM AccountLessons a"),
		@NamedQuery(name = AccountLessons.GET_LESSONS_ACCOUNT_COUNT, query = "SELECT COUNT(a.id) FROM AccountLessons a"),
		@NamedQuery(name = AccountLessons.GET_LESSONS_ACCOUNT_BY_USERID, query = "SELECT a FROM AccountLessons a WHERE a.userId = :userId")})

public class AccountLessons extends EntityRoot {

	private static final long serialVersionUID = 1L;

	public static final String GET_ALL_LESSONS_ACCOUNTS = "getAllLessonsAccounts";
	public static final String GET_ALL_LESSONS_ACCOUNTS_IDs = "getAllLessonsAccountsIds";
	public static final String GET_LESSONS_ACCOUNT_COUNT = "getLessonsAccountCount";
	public static final String GET_LESSONS_ACCOUNT_BY_USERID = "getLessonsAccountByUserId";

	private long userId;
	@ManyToMany(mappedBy = "accounts", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Collection<Edition> editions = new HashSet<>();

	public Collection<Edition> getEditions() {
		return editions;
	}

	public void setEditions(Collection<Edition> editions) {
		this.editions = editions;
	}

	public AccountLessons() {
	}

	public AccountLessons(long userId, List<Edition> editions) {
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
