package pt.upacademy.coreFinalProject.models.lessons.converters;

import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.core.converters.EntityConverter;
import pt.upacademy.coreFinalProject.models.lessons.Materials;
import pt.upacademy.coreFinalProject.models.lessons.DTOS.MaterialsDTO;
import pt.upacademy.coreFinalProject.services.lessons.LessonService;

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
		materials.setLessons(LS.getLessonByMaterialId(dto.getId()));
		return materials;
	}

	@Override
	public MaterialsDTO toDTO(Materials entity) {
		MaterialsDTO materialDto = new MaterialsDTO();
		materialDto.setId(entity.getId());
		materialDto.setTitle(entity.getTitle());
		materialDto.setType(entity.getType());
		materialDto.setUrl(entity.getUrl());
		materialDto.setLessonsIds(entity.getLessons().stream().map(ent -> ent.getId()).collect(Collectors.toList()));
		return materialDto;
	}

}
