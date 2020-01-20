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
	
	private String subject;
	
	private int mark;
	
	

	public Grade() {}

	public Grade(String subject, int mark) {
		this.subject = subject;
		this.mark = mark;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
}
