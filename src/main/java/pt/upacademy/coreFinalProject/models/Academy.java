package pt.upacademy.coreFinalProject.models;

import java.time.LocalDate;
import java.util.List;

public class Academy extends EntityRoot {
   
	private static final long serialVersionUID = 1L;
    private String client;
    private LocalDate startDate;
    private LocalDate endDate;
    private String edName;
    private List<String> modules;
    private List<Long> students;
    
    public Academy(String client, LocalDate startDate, LocalDate endDate, String edName, 
		List<String> modules, List<Long> students) {

	this.setClient(client);
	this.setStartDate(startDate);
	this.setEndDate(endDate);
	this.setEdName(edName);
	this.setModules(modules);
	this.setStudents(students);
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

	public List<String> getModules() {
		return modules;
	}

	public void setModules(List<String> modules) {
		this.modules = modules;
	}

	public List<Long> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Long> students) {
		this.students = students;
	}
}

	