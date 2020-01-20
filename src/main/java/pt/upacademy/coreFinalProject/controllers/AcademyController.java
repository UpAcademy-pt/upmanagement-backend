package pt.upacademy.coreFinalProject.controllers;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.models.Academy;
import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.DTOS.AcademyDTO;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.converters.AcademyConverter;
import pt.upacademy.coreFinalProject.models.converters.AccountConverter;
import pt.upacademy.coreFinalProject.repositories.AcademyRepository;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;
import pt.upacademy.coreFinalProject.services.AcademyService;
import pt.upacademy.coreFinalProject.services.AccountService;

@Path ("/academies")
@RequestScoped
public class AcademyController extends EntityControllerDTO<AcademyService,AcademyRepository,AcademyConverter,Academy,AcademyDTO>{

}
