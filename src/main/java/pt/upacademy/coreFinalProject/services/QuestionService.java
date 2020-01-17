package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.QuestionForum;
import pt.upacademy.coreFinalProject.models.DTOS.QuestionForumDTO;
import pt.upacademy.coreFinalProject.repositories.QuestionRepository;



@RequestScoped
public class QuestionService extends EntityService <QuestionRepository, QuestionForum, QuestionForumDTO>{

}
