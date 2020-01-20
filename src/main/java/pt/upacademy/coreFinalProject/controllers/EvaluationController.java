package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Evaluation;
import pt.upacademy.coreFinalProject.models.DTOS.EvaluationDTO;
import pt.upacademy.coreFinalProject.models.converters.EvaluationConverter;
import pt.upacademy.coreFinalProject.repositories.EvaluationRepository;
import pt.upacademy.coreFinalProject.services.EvaluationService;

@Path("evaluations")
@RequestScoped
public class EvaluationController extends EntityControllerDTO<EvaluationService, EvaluationRepository, EvaluationConverter, Evaluation, EvaluationDTO> {

}
