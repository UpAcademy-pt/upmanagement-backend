package pt.upacademy.coreFinalProject.services;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Declarations;
import pt.upacademy.coreFinalProject.repositories.DeclarationsRepository;

@RequestScoped
public class DeclarationsService extends EntityService<DeclarationsRepository,Declarations>{

	public void sendDeclaration(Declarations declaration) {
		repository.addEntity(declaration);
	}
	
	public Collection<Declarations> getAllDeclarationsByReceiverId(int accountId) {
		return repository. getAllDeclarationsByReceiverId(accountId);
	}

}
