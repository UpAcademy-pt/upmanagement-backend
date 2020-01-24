package pt.upacademy.coreFinalProject.controllers.academyManager;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.Evaluation;
import pt.upacademy.coreFinalProject.models.DTOS.EvaluationDTO;
import pt.upacademy.coreFinalProject.models.converters.EvaluationConverter;
import pt.upacademy.coreFinalProject.repositories.EvaluationRepository;
import pt.upacademy.coreFinalProject.services.EvaluationService;

@Path("academy-manager/evaluations")
@RequestScoped
public class EvaluationController extends EntityControllerDTO<EvaluationService, EvaluationRepository, EvaluationConverter, Evaluation, EvaluationDTO> {

}
