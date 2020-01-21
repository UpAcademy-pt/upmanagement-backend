package pt.upacademy.coreFinalProject.models;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
/*
@NamedQueries({
	@NamedQuery(name = Academy.GET_ALL_ACADEMIES, query = "SELECT a FROM ACADEMIES a")
})
*/
public class Academy extends EntityRoot {
   
	private static final long serialVersionUID = 1L;
    private String client;
    private LocalDate startDate;
    private LocalDate endDate;
    private String edName;
    @OneToMany
    private List<Module> modules;
    @ManyToMany
    private List<Account> students;
    
    public Academy() {}
    
    public Academy(String client, LocalDate startDate, LocalDate endDate, String edName, 
		List<Module> modules, List<Account> students) {

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


	public List<Account> getStudents() {
		return students;
	}


	public void setStudents(List<Account> students) {
		this.students = students;
	}

}

	