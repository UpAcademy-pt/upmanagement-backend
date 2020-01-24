package pt.upacademy.coreFinalProject.controllers.academyManager;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.Academy;
import pt.upacademy.coreFinalProject.models.DTOS.AcademyDTO;
import pt.upacademy.coreFinalProject.models.converters.AcademyConverter;
import pt.upacademy.coreFinalProject.repositories.AcademyRepository;
import pt.upacademy.coreFinalProject.services.AcademyService;

@Path ("academy-manager/academies")
@RequestScoped
public class AcademyController extends EntityControllerDTO<AcademyService,AcademyRepository,AcademyConverter,Academy,AcademyDTO>{

}
