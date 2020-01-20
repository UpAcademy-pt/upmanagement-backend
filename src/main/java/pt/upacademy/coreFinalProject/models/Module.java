package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name = Module.GET_ALL_MODULES, query = "SELECT m FROM Module m")
})

public class Module extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_MODULES = "getAllModules";

	@OneToMany
	private List<Evaluation> evaluation;
	@OneToMany
	private List<Theme> themes;
	private String name;
	@OneToMany
	private List<Account> teachers;
	private String evaluationSubjects;

	public Module() {}
	
	public Module(List<Evaluation> evaluation, List<Theme> themes, String name, List<Account> teachers, String evaluationSubjects) {
		this.evaluation = evaluation;
		this.themes = themes;
		this.name = name;
		this.teachers = teachers;
		this.evaluationSubjects = evaluationSubjects;
	}

	public List<Account> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Account> teachers) {
		this.teachers = teachers;
	}

	public List<Evaluation> getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(List<Evaluation> evaluation) {
		this.evaluation = evaluation;
	}

	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEvaluationSubjects() {
		return evaluationSubjects;
	}

	public void setEvaluationSubjects(String evaluationSubjects) {
		this.evaluationSubjects = evaluationSubjects;
	}
}
