package pt.upacademy.coreFinalProject.models.converters;

import pt.upacademy.coreFinalProject.models.DTOS.ModuleDTO;
import pt.upacademy.coreFinalProject.models.Module;

public class ModuleConverter extends EntityConverter<Module, ModuleDTO> {

	@Override
	public Module toEntity(ModuleDTO dto) {
		Module moduleEntity = new Module();
		moduleEntity.setId(dto.getId());
		moduleEntity.setEvaluation(dto.getEvaluation());
		moduleEntity.setThemes(dto.getThemes());
		moduleEntity.setName(dto.getName());
		return moduleEntity;
	}

	@Override
	public ModuleDTO toDTO(Module entity) {
		ModuleDTO moduleDto = new ModuleDTO();
		moduleDto.setId(entity.getId());
		moduleDto.setEvaluation(entity.getEvaluation());
		moduleDto.setThemes(entity.getThemes());
		moduleDto.setName(entity.getName());
		return moduleDto;
	}

}
