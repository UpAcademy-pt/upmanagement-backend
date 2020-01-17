package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.HashMap;
import java.util.Map;

public class EvaluationDTO extends EntityDTO {

	private long userId;
	private Map<String, Integer> grades = new HashMap<String, Integer> ();
	private String comment;
	
	public EvaluationDTO() {}
	
	public EvaluationDTO(long userId, Map<String, Integer> grades, String comment) {
		super();
		this.userId = userId;
		this.grades = grades;
		this.comment = comment;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Map<String, Integer> getGrades() {
		return grades;
	}

	public void setGrades(Map<String, Integer> grades) {
		this.grades = grades;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
