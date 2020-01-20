package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Grade;
import pt.upacademy.coreFinalProject.repositories.GradeRepository;

@RequestScoped
public class GradeService extends EntityService<GradeRepository, Grade> {

}
