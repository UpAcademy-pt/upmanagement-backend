package pt.upacademy.coreFinalProject.repositories.questionnaire;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.questionnaire.Template;
import pt.upacademy.coreFinalProject.repositories.core.EntityRepository;

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
