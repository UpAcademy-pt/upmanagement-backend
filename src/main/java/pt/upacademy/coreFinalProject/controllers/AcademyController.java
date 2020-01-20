package pt.upacademy.coreFinalProject.controllers;


import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Academy;
import pt.upacademy.coreFinalProject.models.DTOS.AcademyDTO;
import pt.upacademy.coreFinalProject.models.converters.AcademyConverter;
import pt.upacademy.coreFinalProject.repositories.AcademyRepository;
import pt.upacademy.coreFinalProject.services.AcademyService;

@Path ("/academies")
public class AcademyController extends EntityController<AcademyService, AcademyRepository, AcademyConverter, AcademyDTO, Academy >{

}
