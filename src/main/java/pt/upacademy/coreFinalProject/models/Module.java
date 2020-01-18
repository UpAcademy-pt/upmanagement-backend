package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = Module.GET_ALL_MODULES, query = "SELECT m FROM Module m")
})

public class Module extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_MODULES = "getAllModules";

	private List<Evaluation> evaluation;
	private List<String> themes;
	private String name;
	private List<User> teachers;

	public Module() {}
	
	public Module(List<Evaluation> evaluation, List<String> themes, String name, List<User> teachers) {
		this.evaluation = evaluation;
		this.themes = themes;
		this.name = name;
		this.teachers = teachers;
	}

	public List<User> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<User> teachers) {
		this.teachers = teachers;
	}

	public List<Evaluation> getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(List<Evaluation> evaluation) {
		this.evaluation = evaluation;
	}

	public List<String> getThemes() {
		return themes;
	}

	public void setThemes(List<String> themes) {
		this.themes = themes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
