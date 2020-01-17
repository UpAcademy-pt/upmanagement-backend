package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Lesson;
import pt.upacademy.coreFinalProject.models.DTOS.LessonDTO;
import pt.upacademy.coreFinalProject.repositories.LessonRepository;


@RequestScoped
public class LessonService extends EntityService <LessonRepository, Lesson, LessonDTO> {

}
