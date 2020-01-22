package pt.upacademy.coreFinalProject.models.converters;

import pt.upacademy.coreFinalProject.models.DTOS.ModuleDTO;
import pt.upacademy.coreFinalProject.services.EvaluationService;
import pt.upacademy.coreFinalProject.services.ThemeService;

import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Module;

public class ModuleConverter extends EntityConverter<Module, ModuleDTO> {
	
	@Inject
	protected ThemeService themeService;
	@Inject
	protected EvaluationService evalService;

	@Override
	public Module toEntity(ModuleDTO dto) {
		Module moduleEntity = new Module();
		moduleEntity.setId(dto.getId());
		moduleEntity.setEvaluation(dto.getEvaluationIds().stream().map(evaluationId -> evalService.get(evaluationId)).collect(Collectors.toSet()));
		moduleEntity.setThemes(dto.getThemesIds().stream().map(themeId -> themeService.get(themeId)).collect(Collectors.toSet()));
		moduleEntity.setName(dto.getName());
		return moduleEntity;
	}

	@Override
	public ModuleDTO toDTO(Module entity) {
		ModuleDTO moduleDto = new ModuleDTO();
		moduleDto.setId(entity.getId());
		moduleDto.setEvaluationIds(entity.getEvaluation().stream().map(evaluation -> evaluation.getId()).collect(Collectors.toList()));
		moduleDto.setThemesIds(entity.getThemes().stream().map(theme -> theme.getId()).collect(Collectors.toList()));
		moduleDto.setName(entity.getName());
		return moduleDto;
	}

}
