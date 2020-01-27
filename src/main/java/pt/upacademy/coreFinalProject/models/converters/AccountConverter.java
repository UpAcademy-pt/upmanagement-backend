package pt.upacademy.coreFinalProject.models.converters;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.DTOS.AccountDTO;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;
import pt.upacademy.coreFinalProject.services.EditionService;
import pt.upacademy.coreFinalProject.services.SubscriptionService;


@RequestScoped
public class AccountConverter extends EntityConverter<Account, AccountDTO> {

	@Inject
	private EditionService editionBus;


	@Inject 
	protected EditionConverter converter;
	
	@Inject 
	protected SubscriptionService SS;


	@Override
	public Account toEntity(AccountDTO dto) {

		Account account = new Account();

		if (dto.getId() > 0) {
			account.setId(dto.getId());
		}

		account.setUserId(dto.getUserId());
		

		return account;

	}

	

	
	@Override
	public AccountDTO toDTO(Account ent) {
		AccountDTO accountDTO = new AccountDTO(
				ent.getId(),
				ent.getUserId(), 
				//ent.getSubscriptions().stream().
				ent.setSubscriptions(SS.getSubscrionByAccountId(ent.getId()).stream().map(sub -> converter.toDTO(sub)).collect(Collectors.toSet())) // falta o converter do subsciption to DTO para funcionar
				
//				.map(sub -> sub.getEdition())
//				editionBus.get().stream().map(edition -> converter.toDTO(edition)).collect(Collectors.toList())
				);

		return accountDTO;
		
	}

}
