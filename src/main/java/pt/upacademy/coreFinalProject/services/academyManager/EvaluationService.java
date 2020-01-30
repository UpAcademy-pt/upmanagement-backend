package pt.upacademy.coreFinalProject.services.academyManager;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Evaluation;
import pt.upacademy.coreFinalProject.repositories.academyManager.EvaluationRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class EvaluationService extends EntityService<EvaluationRepository, Evaluation> {

}
