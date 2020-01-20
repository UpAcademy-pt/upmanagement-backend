package pt.upacademy.coreFinalProject.models;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Academy extends EntityRoot {
   
	private static final long serialVersionUID = 1L;
    private String client;
    private LocalDate startDate;
    private LocalDate endDate;
    private String edName;
    @OneToMany
    private List<Module> modules;
    @OneToMany
    private List<User> students;
    
    public Academy() {}
    
    public Academy(String client, LocalDate startDate, LocalDate endDate, String edName, 
		List<Module> modules, List<User> students) {

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


	public List<Module> getModules() {
		return modules;
	}


	public void setModules(List<Module> modules) {
		this.modules = modules;
	}


	public List<User> getStudents() {
		return students;
	}


	public void setStudents(List<User> students) {
		this.students = students;
	}

}

	