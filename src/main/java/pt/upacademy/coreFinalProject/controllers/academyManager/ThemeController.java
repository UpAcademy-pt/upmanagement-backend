package pt.upacademy.coreFinalProject.controllers.academyManager;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import pt.upacademy.coreFinalProject.controllers.EntityController;
import pt.upacademy.coreFinalProject.models.academyManager.Theme;
import pt.upacademy.coreFinalProject.repositories.academyManager.ThemeRepository;
import pt.upacademy.coreFinalProject.services.academyManager.ThemeService;

@RequestScoped
@Path("academy-manager/themes")
public class ThemeController extends EntityController<ThemeService,ThemeRepository,Theme> {

}
