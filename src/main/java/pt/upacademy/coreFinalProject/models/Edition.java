package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Edition.GET_ALL_EDITIONS, query = "SELECT e FROM Edition e")
})
public class Edition extends EntityRoot  {
	
	public static final String GET_ALL_EDITIONS = "getAllEditions";
		
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String type;
	
	
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
	
	
	@Override
	public String toString() {
		return "Edition [name=" + name + ", type=" + type + "]";
	}
	
	

}
