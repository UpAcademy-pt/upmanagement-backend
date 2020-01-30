package pt.upacademy.coreFinalProject.repositories.lessons;

import pt.upacademy.coreFinalProject.models.lessons.Materials;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;

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
