package pt.upacademy.coreFinalProject.models;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;




@Entity
@NamedQueries({ 
	@NamedQuery(name = Edition.GET_ALL_EDITIONS, query = "SELECT e FROM Edition e"),
	@NamedQuery (name = Edition.GET_ALL_EDITIONS_IDS, query = "SELECT e.id FROM Edition e"),
	@NamedQuery (name = Edition.GET_ALL_EDITIONS_COUNT, query = "SELECT COUNT(e.id) FROM Edition e")
})

public class Edition extends EntityRoot  {
	
	public static final String GET_ALL_EDITIONS = "getAllEditions";
	public static final String GET_ALL_EDITIONS_IDS = "getAllEditionsIds";
	public static final String GET_ALL_EDITIONS_COUNT = "getAllEditionsCount";

		
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private String type;
	@OneToMany(mappedBy = "edition")
	private Set<Subscription> subscriptions;
		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(Set<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	@Override
	public String toString() {
		return "Edition [name=" + name + ", type=" + type + ", subscriptions=" + subscriptions + "]";
	}

	
	
	


	
	
	
	
	

	
	
}
