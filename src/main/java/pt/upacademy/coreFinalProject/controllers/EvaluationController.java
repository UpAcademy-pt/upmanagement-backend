package pt.upacademy.coreFinalProject.controllers;

import pt.upacademy.coreFinalProject.models.Evaluation;
import pt.upacademy.coreFinalProject.models.DTOS.EvaluationDTO;
import pt.upacademy.coreFinalProject.models.converters.EvaluationConverter;
import pt.upacademy.coreFinalProject.repositories.EvaluationRepository;
import pt.upacademy.coreFinalProject.services.EvaluationService;

public class EvaluationController extends EntityController<EvaluationService, EvaluationRepository, EvaluationConverter, Evaluation, EvaluationDTO> {

}
