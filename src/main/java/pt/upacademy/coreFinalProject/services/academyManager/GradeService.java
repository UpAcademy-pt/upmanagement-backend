package pt.upacademy.coreFinalProject.services.academyManager;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Grade;
import pt.upacademy.coreFinalProject.repositories.academyManager.GradeRepository;

@RequestScoped
public class GradeService extends EntityService<GradeRepository, Grade> {

}
