package pt.upacademy.coreFinalProject.models.academyManager;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import pt.upacademy.coreFinalProject.models.core.EntityRoot;

@Entity
@NamedQueries({
	@NamedQuery(name = Theme.GET_ALL_THEMES, query = "SELECT t FROM Theme t")
})
public class Theme extends EntityRoot {

	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_THEMES = "getAllThemes";
	
	private String name;
	
	

	public Theme() {
	}

	public Theme(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
