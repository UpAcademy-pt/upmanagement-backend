package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@NamedQueries({
	@NamedQuery(name = Account.GET_ALL_ACCOUNTS, query = "SELECT a FROM Account a"),
	@NamedQuery(name = Account.GET_ALL_ACCOUNT_IDs, query = "SELECT a.id FROM Account a"),
	@NamedQuery(name = Account.GET_ACCOUNT_COUNT, query = "SELECT COUNT(a.id) FROM Account a"), 
	@NamedQuery (name = Account.GET_ACCOUNT_BY_USERID, query = "SELECT a FROM Account a WHERE a.user.id = :userId")})
//SELECT s FROM Shelf s WHERE s.produto.ID = :productId

public class Account extends EntityRoot  {
	
	private static final long serialVersionUID = 1L;


	public static final String GET_ALL_ACCOUNTS = "getAllAccounts";
	public static final String GET_ALL_ACCOUNT_IDs = "getAllAccountsIds";
	public static final String GET_ACCOUNT_COUNT = "getAccountCount";
	public static final String GET_ACCOUNT_BY_USERID = "getAccountByUserId";
	
	@OneToOne
	private User user;
	
	@OneToMany
	private List <Edition>  editions;

	
	public Account(User user, List<Edition> editions) {
		this.user = user;
		this.editions = editions;
		}
	
	public Account() {
	}


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Edition> getEditions() {
		return editions;
	}
	public void setEditions(List<Edition> editions) {
		this.editions = editions;
	}
	
	@Override
	public String toString() {
		return "Account [user=" + user + ", editions=" + editions + "]";
	}
	

}
