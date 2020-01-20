package pt.upacademy.coreFinalProject.models.DTOS;

import java.time.LocalDate;
import java.util.List;

public class AcademyDTO extends EntityDTO {

    private String client;
    private LocalDate startDate;
    private LocalDate endDate;
    private String edName;
    private List<Long> modulesIds;
    private List<Long> studentsIds;
    
    public void Academy(String client, LocalDate startDate, LocalDate endDate, String edName, List<Long> modulesIds, List<Long> studentsIds) {
		this.setClient(client);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setEdName(edName);
		this.setModulesIds(modulesIds);
		this.setStudentsIds(studentsIds);
    }

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getEdName() {
		return edName;
	}

	public void setEdName(String edName) {
		this.edName = edName;
	}

	public List<Long> getModulesIds() {
		return modulesIds;
	}

	public void setModulesIds(List<Long> modulesIds) {
		this.modulesIds = modulesIds;
	}

	public List<Long> getStudentsIds() {
		return studentsIds;
	}

	public void setStudentsIds(List<Long> studentsIds) {
		this.studentsIds = studentsIds;
	}
    
}

	