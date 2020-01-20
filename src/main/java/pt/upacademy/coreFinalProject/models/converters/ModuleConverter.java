package pt.upacademy.coreFinalProject.models.converters;

import pt.upacademy.coreFinalProject.models.DTOS.ModuleDTO;
import pt.upacademy.coreFinalProject.services.ThemeService;

import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Module;

public class ModuleConverter extends EntityConverter<Module, ModuleDTO> {
	
	@Inject
	protected ThemeService themeService;

	@Override
	public Module toEntity(ModuleDTO dto) {
		Module moduleEntity = new Module();
		moduleEntity.setId(dto.getId());
		moduleEntity.setEvaluation(dto.getEvaluation());
		moduleEntity.setThemes(dto.getThemes().stream().map(themeId -> themeService.get(themeId)).collect(Collectors.toList()));
		moduleEntity.setName(dto.getName());
		return moduleEntity;
	}

	@Override
	public ModuleDTO toDTO(Module entity) {
		ModuleDTO moduleDto = new ModuleDTO();
		moduleDto.setId(entity.getId());
		moduleDto.setEvaluation(entity.getEvaluation());
		moduleDto.setThemes(entity.getThemes().stream().map(theme -> theme.getId()).collect(Collectors.toList()));
		moduleDto.setName(entity.getName());
		return moduleDto;
	}

}
