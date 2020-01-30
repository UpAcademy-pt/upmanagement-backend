package pt.upacademy.coreFinalProject.models.academyManager.DTOS;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import pt.upacademy.coreFinalProject.models.academyManager.Module;
import pt.upacademy.coreFinalProject.models.academyManager.Status;

public class AcademyDTO extends EntityDTO {

    private String client;
    private String startDate;
    private String endDate;
    private String edName;
    private Set<Module> modules;
    private List<Long> studentsIds = new ArrayList<Long>();
    private Status status;
    private String warning;			 //GONÇALO
    private String usefulInfo;		 //GONÇALO
    private String academyType;		 //GONÇALO
    
    public void Academy(String client, String startDate, String endDate, String edName, Set<Module> modules, List<Long> studentsIds, Status status, String warning, 
    		String usefulInfo) {
		this.setClient(client);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setEdName(edName);
		this.setModules(modules);
		this.setStudentsIds(studentsIds);
		this.setStatus(status);
		this.setWarning(warning);			//GONÇALO
		this.setUsefulInfo(usefulInfo);		//GONÇALO
		this.setAcademyType(usefulInfo);    //GONÇALO
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

	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

	public List<Long> getStudentsIds() {
		return studentsIds;
	}

	public void setStudentsIds(List<Long> studentsIds) {
		this.studentsIds = studentsIds;
	}
    
	public String getWarning() {
		return warning;
	}  	//GONÇALO

	public void setWarning(String warning) {
		this.warning = warning;
	}   //GONÇALO

	public String getUsefulInfo() {
		return usefulInfo;
	}	//GONÇALO

	public void setUsefulInfo(String usefulInfo) {
		this.usefulInfo = usefulInfo;
	}	//GONÇALO

	public String getAcademyType() {
		return academyType;
	}	//GONÇALO

	public void setAcademyType(String academyType) {
		this.academyType = academyType;
	}	//GONÇALO
}

	