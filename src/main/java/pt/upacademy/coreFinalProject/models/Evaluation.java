package pt.upacademy.coreFinalProject.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Evaluation extends EntityRoot implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private long userId;
	private Map<String, Integer> grades = new HashMap<String, Integer> ();
	private String comment;
	
	public Evaluation() {}
	
	public Evaluation(long userId, Map<String, Integer> grades, String comment) {
		this.userId = userId;
		this.grades = grades;
		this.comment = comment;
	}

	public Map<String, Integer> getGrades() {
		return grades;
	}

	public void setGrades(Map<String, Integer> grades) {
		this.grades = grades;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
