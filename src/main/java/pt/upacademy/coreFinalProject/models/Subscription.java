package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@Entity
@NamedQueries({ 
	@NamedQuery(name = Subscription.GET_ALL_SUBSCRIPTIONS, query = "SELECT s FROM Subscription s"),
	@NamedQuery(name = Subscription.GET_SUBSCRIPTION_BY_ACCOUNTID, query = "SELECT s FROM Subscription s WHERE s.account.id = :accountId"),
	@NamedQuery(name = Subscription.GET_SUBSCRIPTION_BY_EDITIONID, query = "SELECT s FROM Subscription s WHERE s.edition.id = :editionId")	
})

public class Subscription extends EntityRoot  {

	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_SUBSCRIPTIONS = "getAllSubscriptions";
	public static final String GET_SUBSCRIPTION_BY_ACCOUNTID = "getSubscrionByAccountId";
	public static final String GET_SUBSCRIPTION_BY_EDITIONID = "getSubscrionByEditionId";

	@ManyToOne
	@JoinColumn (name= "account_id")
	private Account account;
	
	@ManyToOne
	@JoinColumn (name= "edition_id")
	private Edition edition;

	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Edition getEdition() {
		return edition;
	}

	public void setEdition(Edition edition) {
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "Subscription [account=" + account + ", edition=" + edition + "]";
	}
	
	
	
}
