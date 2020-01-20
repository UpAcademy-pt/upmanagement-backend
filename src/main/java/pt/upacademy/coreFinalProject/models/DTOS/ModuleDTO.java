package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;

import pt.upacademy.coreFinalProject.models.Evaluation;
import pt.upacademy.coreFinalProject.models.User;

public class ModuleDTO extends EntityDTO {

	private List<Evaluation> evaluation;
	private List<Long> themes;
	private String name;
	private List<User> teachers;
	
	public ModuleDTO() {}

	public ModuleDTO(List<Evaluation> evaluation, List<Long> themes, String name, List<User> teachers) {
		super();
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

	public List<Long> getThemes() {
		return themes;
	}

	public void setThemes(List<Long> themes) {
		this.themes = themes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}
