package pt.upacademy.coreFinalProject.models;

import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name = Account.GET_ALL_ACCOUNTS, query = "SELECT a FROM Account a"),
	@NamedQuery(name = Account.GET_ACCOUNTS_BY_USER_IDS, query = "SELECT a FROM Account a WHERE a.userId in :usersIds"),
	@NamedQuery(name = Account.GET_ACCOUNT_BY_USER_ID, query = "SELECT a FROM Account a WHERE a.userId = :userId")
})
public class Account extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_ACCOUNTS = "getAllAccounts";
	public static final String GET_ACCOUNTS_BY_USER_IDS = "getAccountsByUserIds";
	public static final String GET_ACCOUNT_BY_USER_ID = "getAccountByUserId";
	
	private long userId;
	private int age;
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Academy> academies;
	private String academicDegree;
	private String academicBackground;
	private String photoLink;
	private int mobilePhone;
	private String linkedInAdress;
	//themes so vai ter valores para formadores
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Theme> themes;
	//evaluations(vai ser retirado) e missedDays so vai ter valores para formandos
//	@OneToMany(fetch = FetchType.EAGER)			 *GONÇALO
//  private Set<Evaluation> evaluations;         *GONÇALO*
	private String missedDays;
	private long nif;
	
	public Account() {}

	public Account(Long userId, int age, String academicDegree, String academicBackground,
			String photoLink, int mobilePhone, String linkedInAdress, long nif) {
		this.userId = userId;
		this.age = age;
		this.academicDegree = academicDegree;
		this.academicBackground = academicBackground;
		this.photoLink = photoLink;
		this.mobilePhone = mobilePhone;
		this.linkedInAdress = linkedInAdress;
		this.nif = nif;
	}

	public long getNif() {
		return nif;
	}

	public void setNif(long nif) {
		this.nif = nif;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Academy> getAcademies() {
		return academies;
	}

	public void setAcademies(Set<Academy> academies) {
		this.academies = academies;
	}

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public String getAcademicBackground() {
		return academicBackground;
	}

	public void setAcademicBackground(String academicBackground) {
		this.academicBackground = academicBackground;
	}

	public String getPhotoLink() {
		return photoLink;
	}

	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}

	public int getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(int mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getLinkedInAdress() {
		return linkedInAdress;
	}

	public void setLinkedInAdress(String linkedInAdress) {
		this.linkedInAdress = linkedInAdress;
	}

	public Set<Theme> getThemes() {
		return themes;
	}

	public void setThemes(Set<Theme> themes) {
		this.themes = themes;
	}
	
//	public Set<Evaluation> getEvaluations() {
//		return evaluations;									*GONÇALO*
//	}

//	public void setEvaluations(Set<Evaluation> evaluations) {
//		this.evaluations = evaluations;						*GONÇALO*
//	}

	public String getMissedDays() {
		return missedDays;
	}

	public void setMissedDays(String missedDays) {
		this.missedDays = missedDays;
	}
	
	
}
