package pt.upacademy.coreFinalProject.controllers.academyManager;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.core.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.academyManager.Evaluation;
import pt.upacademy.coreFinalProject.models.academyManager.DTOS.EvaluationDTO;
import pt.upacademy.coreFinalProject.models.academyManager.converters.EvaluationConverter;
import pt.upacademy.coreFinalProject.repositories.academyManager.EvaluationRepository;
import pt.upacademy.coreFinalProject.services.academyManager.EvaluationService;

@Path("academy-manager/evaluations")
@RequestScoped
public class EvaluationController extends EntityControllerDTO<EvaluationService, EvaluationRepository, EvaluationConverter, Evaluation, EvaluationDTO> {

}
