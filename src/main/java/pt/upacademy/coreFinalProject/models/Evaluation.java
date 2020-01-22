package pt.upacademy.coreFinalProject.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
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

	@ManyToOne
	private Account account;
	@OneToMany(fetch = FetchType.EAGER)
	//@OrderBy("sdgsdg")
	private Set<Grade> grades;
	private String comment;
	
	public Evaluation() {}
	
	public Evaluation(Account account, Set<Grade> grades, String comment) {
		this.account = account;
		this.grades = grades;
		this.comment = comment;
	}

	public Set<Grade> getGrades() {
		return grades;
	}

	public void setGrades(Set<Grade> grades) {
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
