package pt.upacademy.coreFinalProject.services.academyManager;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Academy;
import pt.upacademy.coreFinalProject.repositories.academyManager.AcademyRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class AcademyService extends EntityService<AcademyRepository,Academy> {
	
}
