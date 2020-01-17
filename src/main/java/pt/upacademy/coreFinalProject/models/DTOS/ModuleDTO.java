package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.List;

import pt.upacademy.coreFinalProject.models.Evaluation;

public class ModuleDTO extends EntityDTO {

	private List<Evaluation> evaluation;
	private List<String> themes;
	private String name;
	
	public ModuleDTO() {}

	public ModuleDTO(List<Evaluation> evaluation, List<String> themes, String name) {
		super();
		this.evaluation = evaluation;
		this.themes = themes;
		this.name = name;
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
