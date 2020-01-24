package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Question;
import pt.upacademy.coreFinalProject.models.Template;

@RequestScoped
public class TemplateRepository extends EntityRepository<Template> {

	@Override
	protected Class<Template> getEntityClass() {
		return Template.class;
	}

	@Override
	protected String getAllEntities() {
		return "LOL"; //Template.GET_ALL_TEMPLATES;;
	}

}
