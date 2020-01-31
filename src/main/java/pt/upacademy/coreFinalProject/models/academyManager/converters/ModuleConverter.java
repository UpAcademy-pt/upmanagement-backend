package pt.upacademy.coreFinalProject.models.academyManager.converters;

import pt.upacademy.coreFinalProject.models.academyManager.Module;
import pt.upacademy.coreFinalProject.models.academyManager.DTOS.ModuleDTO;
import pt.upacademy.coreFinalProject.models.core.converters.EntityConverter;
import pt.upacademy.coreFinalProject.services.academyManager.EvaluationService;
import pt.upacademy.coreFinalProject.services.academyManager.ThemeService;

import java.util.stream.Collectors;

import javax.inject.Inject;

public class ModuleConverter extends EntityConverter<Module, ModuleDTO> {
	
	@Inject
	protected ThemeService themeService;
	@Inject
	protected EvaluationService evalService;

	@Override
	public Module toEntity(ModuleDTO dto) {
		Module moduleEntity = new Module();
		if(dto.getId() != 0) {
			moduleEntity.setId(dto.getId());
		}
		moduleEntity.setEvaluation(dto.getEvaluationIds().stream().map(evaluationId -> evalService.get(evaluationId)).collect(Collectors.toSet()));
		moduleEntity.setThemes(dto.getThemes());
		moduleEntity.setName(dto.getName());
		return moduleEntity;
	}

	@Override
	public ModuleDTO toDTO(Module entity) {
		ModuleDTO moduleDto = new ModuleDTO();
		if(entity.getId() != 0) {
			moduleDto.setId(entity.getId());
		}
		moduleDto.setEvaluationIds(entity.getEvaluation().stream().map(evaluation -> evaluation.getId()).collect(Collectors.toList()));
		moduleDto.setThemesIds(entity.getThemes());
		moduleDto.setName(entity.getName());
		return moduleDto;
	}

}
