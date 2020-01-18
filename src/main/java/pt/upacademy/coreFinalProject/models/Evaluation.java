package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
@NamedQueries({
	@NamedQuery(name = Evaluation.GET_ALL_EVALUATIONS, query = "SELECT e FROM Evaluation e")
})		

public class Evaluation extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_EVALUATIONS = "getAllEvaluations";

	private long userId;
	@OneToMany
	@OrderBy("sdgsdg")
	private List<Grade> grades;
	private String comment;
	
	public Evaluation() {}
	
	public Evaluation(long userId, List<Grade> grades, String comment) {
		this.userId = userId;
		this.grades = grades;
		this.comment = comment;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
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
