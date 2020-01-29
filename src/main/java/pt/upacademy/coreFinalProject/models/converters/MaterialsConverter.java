package pt.upacademy.coreFinalProject.models.converters;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Materials;
import pt.upacademy.coreFinalProject.models.DTOS.MaterialsDTO;
import pt.upacademy.coreFinalProject.services.LessonService;

public class MaterialsConverter extends EntityConverter<Materials, MaterialsDTO> {

	@Inject
	protected LessonService LS;

	@Override
	public Materials toEntity(MaterialsDTO dto) {
		Materials materials = new Materials();
		materials.setId(dto.getId());
		materials.setTitle(dto.getTitle());
		materials.setType(dto.getType());
		materials.setUrl(dto.getUrl());

		return materials;
	}

	@Override
	public MaterialsDTO toDTO(Materials entity) {
		MaterialsDTO materialDto = new MaterialsDTO();
		materialDto.setId(entity.getId());
		materialDto.setTitle(entity.getTitle());
		materialDto.setType(entity.getType());
		materialDto.setUrl(entity.getUrl());
		return materialDto;
	}

}
