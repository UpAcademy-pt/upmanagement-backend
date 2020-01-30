package pt.upacademy.coreFinalProject.services.academyManager;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Academy;
import pt.upacademy.coreFinalProject.repositories.academyManager.AcademyRepository;

@RequestScoped
public class AcademyService extends EntityService<AcademyRepository,Academy> {
	
}
