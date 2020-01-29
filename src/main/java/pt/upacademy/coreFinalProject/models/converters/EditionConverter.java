package pt.upacademy.coreFinalProject.models.converters;

import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Edition;
import pt.upacademy.coreFinalProject.models.DTOS.EditionDTO;
import pt.upacademy.coreFinalProject.services.AccountService;

@RequestScoped
public class EditionConverter extends EntityConverter<Edition, EditionDTO> {

	@Inject
	private AccountService AS;

	@Override
	public Edition toEntity(EditionDTO dto) {
		Edition edition = new Edition();
		if (dto.getId() > 0) {
			edition.setId(dto.getId());
		}

		edition.setName(dto.getName());
		edition.setType(dto.getType());
		edition.setAccounts(dto.getAccountsIds().stream().map(entityId -> AS.get(entityId)).collect(Collectors.toList()));
		return edition;
	}

	@Override
	public EditionDTO toDTO(Edition ent) {
		EditionDTO editionDTO = new EditionDTO();
		editionDTO.setId(ent.getId());
		editionDTO.setName(ent.getName());
		editionDTO.setType(ent.getType());
		editionDTO.setAccountsIds(ent.getAccounts().stream().map(acc -> acc.getId()).collect(Collectors.toList()));
		return editionDTO;

	}

//	@Override
//	public EditionDTO toDTO(Edition ent) {
//		EditionDTO editionDTO = new EditionDTO (
//				ent.getName(),
//				ent.getType(),
//				ent.getAccounts().stream().map(Account :: getId).collect(Collectors.toList()),
//				ent.getLessons().stream().map(Lesson :: getId).collect(Collectors.toList()), 
//				ent.getNotes().stream().map(Note :: getId).collect(Collectors.toList()),
//				ent.getQuestions().stream().map(QuestionForum :: getId).collect(Collectors.toList()),
//				ent.getEvents().stream().map(Event :: getId).collect(Collectors.toList())
//				);
//		
//		return editionDTO;
//		
//	}

}
