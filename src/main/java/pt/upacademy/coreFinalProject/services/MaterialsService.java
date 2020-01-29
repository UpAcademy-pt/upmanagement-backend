package pt.upacademy.coreFinalProject.services;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.Materials;
import pt.upacademy.coreFinalProject.repositories.MaterialsRepository;

public class MaterialsService extends EntityService <MaterialsRepository, Materials> {

	@Inject
	protected MaterialsRepository MR;
	
	@Inject
	protected LessonService LS;
	

	public void delete(long id) {
		Collection<Lesson> lessons = LS.getLessonByMaterialId(id);
		for (Lesson lesson : lessons) {
			Collection<Materials> mats = lesson.getMaterials();
//			for (Materials mat : mats) {
//				if (mat.getId() == id) {
//					mats.remove(mat);
//					
//				}
//			}
			mats = mats.stream().filter(mat -> mat.getId() != id).collect(Collectors.toList());
			lesson.setMaterials(mats);
			LS.update(lesson);
		}
		repository.deleteEntity(id);
	}
	
//	public Collection<Long> getMaterialsByLessonId(long id) {
//		return repository.getMaterialsByLessonsIds(id);
//	}
	
//	public Materials getById(long id) {
//		return MR.getEntity(id);
//		
//	}

}
