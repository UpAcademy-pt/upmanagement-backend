package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;


import pt.upacademy.coreFinalProject.models.AnswerForum;
import pt.upacademy.coreFinalProject.models.DTOS.AnswerForumDTO;
import pt.upacademy.coreFinalProject.repositories.AnswerRepository;




@RequestScoped
public class AnswerService extends EntityService <AnswerRepository, AnswerForum> {

}
