package pt.upacademy.coreFinalProject.services.academyManager;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Declarations;
import pt.upacademy.coreFinalProject.repositories.academyManager.DeclarationsRepository;

@RequestScoped
public class DeclarationsService extends EntityService<DeclarationsRepository,Declarations>{

	public void sendDeclaration(Declarations declaration) {
		repository.addEntity(declaration);
	}
	
	public Collection<Declarations> getAllDeclarationsByReceiverId(int accountId) {
		return repository. getAllDeclarationsByReceiverId(accountId);
	}

}
