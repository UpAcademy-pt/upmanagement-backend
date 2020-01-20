package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;
import pt.upacademy.coreFinalProject.models.Academy;
import pt.upacademy.coreFinalProject.repositories.AcademyRepository;

@RequestScoped
public class AcademyService extends EntityService<AcademyRepository,Academy> {
	
}
