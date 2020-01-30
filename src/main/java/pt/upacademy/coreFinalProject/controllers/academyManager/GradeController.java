package pt.upacademy.coreFinalProject.controllers.academyManager;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.core.EntityController;
import pt.upacademy.coreFinalProject.models.academyManager.Grade;
import pt.upacademy.coreFinalProject.repositories.academyManager.GradeRepository;
import pt.upacademy.coreFinalProject.services.academyManager.GradeService;

@Path("academy-manager/grades")
@RequestScoped
public class GradeController extends EntityController <GradeService, GradeRepository, Grade>{

}
