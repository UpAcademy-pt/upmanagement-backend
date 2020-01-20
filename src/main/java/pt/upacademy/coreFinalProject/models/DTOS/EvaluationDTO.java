package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;
import pt.upacademy.coreFinalProject.models.Grade;

public class EvaluationDTO extends EntityDTO {

	private long userId;
	private List<Grade> grades;
	private String comment;
	
	public EvaluationDTO() {}
	
	public EvaluationDTO(long userId, List<Grade> grades, String comment) {
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

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
