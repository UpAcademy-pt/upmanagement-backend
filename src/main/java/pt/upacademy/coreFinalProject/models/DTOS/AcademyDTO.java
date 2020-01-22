package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

import pt.upacademy.coreFinalProject.models.Status;

public class AcademyDTO extends EntityDTO {

    private String client;
    private String startDate;
    private String endDate;
    private String edName;
    private List<Long> modulesIds = new ArrayList<Long>();
    private List<Long> studentsIds = new ArrayList<Long>();
    private Status status;
    
    public void Academy(String client, String startDate, String endDate, String edName, List<Long> modulesIds, List<Long> studentsIds, Status status) {
		this.setClient(client);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setEdName(edName);
		this.setModulesIds(modulesIds);
		this.setStudentsIds(studentsIds);
		this.setStatus(status);
    }

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
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

	