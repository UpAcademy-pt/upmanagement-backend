package pt.upacademy.coreFinalProject.models.academyManager.DTOS;

import java.util.List;

import pt.upacademy.coreFinalProject.models.core.DTOS.EntityDTO;

public class ModuleDTO extends EntityDTO {

	private List<Long> evaluationIds;
	private List<Long> themesIds;
	private String name;
	
	public ModuleDTO() {}

	public ModuleDTO(List<Long> evaluationIds, List<Long> themesIds, String name) {
		this.evaluationIds = evaluationIds;
		this.themesIds = themesIds;
		this.name = name;
	}

	public List<Long> getEvaluationIds() {
		return evaluationIds;
	}

	public void setEvaluationIds(List<Long> evaluationIds) {
		this.evaluationIds = evaluationIds;
	}

	public List<Long> getThemesIds() {
		return themesIds;
	}

	public void setThemesIds(List<Long> themesIds) {
		this.themesIds = themesIds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
