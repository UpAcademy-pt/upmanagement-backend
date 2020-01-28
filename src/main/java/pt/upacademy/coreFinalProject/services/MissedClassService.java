package pt.upacademy.coreFinalProject.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.MissedClass;
import pt.upacademy.coreFinalProject.repositories.MissedClassRepository;

@RequestScoped
public class MissedClassService extends EntityService<MissedClassRepository,MissedClass>{

	
	public void addMissedClass(MissedClass mclass) {
		repository.addEntity(mclass);
	}

	public List<MissedClass> getAllMissedById(int accountId) {
		return repository.getAllMissedById(accountId);
	}
	
}
