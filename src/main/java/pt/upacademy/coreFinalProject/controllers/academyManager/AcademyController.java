package pt.upacademy.coreFinalProject.controllers.academyManager;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.core.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.academyManager.Academy;
import pt.upacademy.coreFinalProject.models.academyManager.DTOS.AcademyDTO;
import pt.upacademy.coreFinalProject.models.academyManager.converters.AcademyConverter;
import pt.upacademy.coreFinalProject.repositories.academyManager.AcademyRepository;
import pt.upacademy.coreFinalProject.services.academyManager.AcademyService;

@Path ("academy-manager/academies")
@RequestScoped
public class AcademyController extends EntityControllerDTO<AcademyService,AcademyRepository,AcademyConverter,Academy,AcademyDTO>{

}
