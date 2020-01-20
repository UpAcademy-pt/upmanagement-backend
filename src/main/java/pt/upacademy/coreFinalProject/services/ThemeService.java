package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Theme;
import pt.upacademy.coreFinalProject.repositories.ThemeRepository;

@RequestScoped
public class ThemeService extends EntityService<ThemeRepository,Theme>{

}
