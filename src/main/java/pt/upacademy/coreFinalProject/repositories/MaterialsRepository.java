package pt.upacademy.coreFinalProject.repositories;

import pt.upacademy.coreFinalProject.models.Materials;

public class MaterialsRepository extends EntityRepository <Materials> {

	@Override
	protected Class<Materials> getEntityClass() {
		return Materials.class;
	}

	@Override
	protected String getAllEntities() {
		return Materials.GET_ALL_MATERIALS;
	}

//	public Collection<Long> getMaterialsByLessonsIds(long id) {
//		return Materials.GET_MATERIALS_BY_LESSON_ID;
//	}

}
