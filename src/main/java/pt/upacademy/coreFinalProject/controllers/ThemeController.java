package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Theme;
import pt.upacademy.coreFinalProject.repositories.ThemeRepository;
import pt.upacademy.coreFinalProject.services.ThemeService;

@RequestScoped
public class ThemeController extends EntityController<ThemeService,ThemeRepository,Theme> {

}
