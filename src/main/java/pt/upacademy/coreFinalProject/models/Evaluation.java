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

	private Account account;
	@OneToMany
	@OrderBy("sdgsdg")
	private List<Grade> grades;
	private String comment;
	
	public Evaluation() {}
	
	public Evaluation(Account account, List<Grade> grades, String comment) {
		this.account = account;
		this.grades = grades;
		this.comment = comment;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
