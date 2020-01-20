package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Account extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	private long userId;
	private int age;
	@OneToMany
	private List<Academy> academies;
	private String academicDegree;
	private String academicBackground;
	private String photoLink;
	private int mobilePhone;
	private String linkedInAdress;
	//themes so vai ter valores para formadores
	@OneToMany
	private List<Theme> themes;
	//evaluations e missedDays so vai ter valores para formandos
	@OneToMany
	private List<Evaluation> evaluations;
	private String missedDays;
	
	public Account() {}

	public Account(Long userId, int age, String academicDegree, String academicBackground,
			String photoLink, int mobilePhone, String linkedInAdress) {
		this.userId = userId;
		this.age = age;
		this.academicDegree = academicDegree;
		this.academicBackground = academicBackground;
		this.photoLink = photoLink;
		this.mobilePhone = mobilePhone;
		this.linkedInAdress = linkedInAdress;
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

	public List<Academy> getAcademies() {
		return academies;
	}

	public void setAcademies(List<Academy> academies) {
		this.academies = academies;
	}

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public String getAcademicBackgroung() {
		return academicBackground;
	}

	public void setAcademicBackgroung(String academicBackgroung) {
		this.academicBackground = academicBackgroung;
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

	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}
	
	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public String getMissedDays() {
		return missedDays;
	}

	public void setMissedDays(String missedDays) {
		this.missedDays = missedDays;
	}
	
	
}
