package pt.upacademy.coreFinalProject.controllers.academyManager;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.EntityController;
import pt.upacademy.coreFinalProject.models.Theme;
import pt.upacademy.coreFinalProject.repositories.ThemeRepository;
import pt.upacademy.coreFinalProject.services.ThemeService;

@RequestScoped
@Path("academy-manager/themes")
public class ThemeController extends EntityController<ThemeService,ThemeRepository,Theme> {

}
