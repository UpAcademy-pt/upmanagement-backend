package pt.upacademy.coreFinalProject.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name = Academy.GET_ALL_ACADEMIES, query = "SELECT a FROM Academy a")
})

public class Academy extends EntityRoot {
   
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_ACADEMIES = "getAllAcademies";
	
    private String client;
    private LocalDate startDate;
    private LocalDate endDate;
    private String edName;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Module> modules;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Account> students;
    private Status status;
    
    public Academy() {}
    
    public Academy(String client, LocalDate startDate, LocalDate endDate, String edName, 
    	Set<Module> modules, Set<Account> students, Status status) {

		this.setClient(client);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setEdName(edName);
		this.setModules(modules);
		this.setStudents(students);
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


	public Set<Module> getModules() {
		return modules;
	}


	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}


	public Set<Account> getStudents() {
		return students;
	}


	public void setStudents(Set<Account> students) {
		this.students = students;
	}

}

	