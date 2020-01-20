package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = Grade.GET_ALL_GRADES, query = "SELECT g FROM Grade g")
})

public class Grade extends EntityRoot {

	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_GRADES = "getAllGrades";
	
	private Integer teste;
	
	public Integer getTeste() {
		return teste;
	}
	
	public void setTeste(Integer teste) {
		this.teste = teste;
	}
}
