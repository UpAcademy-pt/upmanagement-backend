package pt.upacademy.coreFinalProject.services;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Materials;
import pt.upacademy.coreFinalProject.repositories.MaterialsRepository;

public class MaterialsService extends EntityService <MaterialsRepository, Materials> {

	@Inject
	protected MaterialsRepository MR;

//	public Collection<Long> getMaterialsByLessonId(long id) {
//		return repository.getMaterialsByLessonsIds(id);
//	}
	
//	public Materials getById(long id) {
//		return MR.getEntity(id);
//		
//	}

}
