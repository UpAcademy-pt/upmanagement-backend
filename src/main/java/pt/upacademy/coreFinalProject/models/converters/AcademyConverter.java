package pt.upacademy.coreFinalProject.models.converters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

import javax.inject.Inject;

import pt.upacademy.coreFinalProject.models.Academy;
import pt.upacademy.coreFinalProject.models.DTOS.AcademyDTO;

public class AcademyConverter extends EntityConverter<Academy, AcademyDTO> {
	
	
	@Override
	public Academy toEntity(AcademyDTO dto) {
		Academy academy = new Academy();
		academy.setClient(dto.getClient());
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(dto.getStartDate(),dateTimeFormatter);
		academy.setStartDate(localDate);
		LocalDate localDate1 = LocalDate.parse(dto.getEndDate(),dateTimeFormatter);
		academy.setEndDate(localDate1);
		academy.setEdName(dto.getEdName());
		academy.setModules(dto.getModulesIds());
		academy.setStudents(dto.getStudentsIds());
		return academy;
		
		
	}

	@Override
	public AcademyDTO toDTO(Academy entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
