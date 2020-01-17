package pt.upacademy.coreFinalProject.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Account extends EntityRoot implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long userId;
	private int age;
	//academies é para passar a lista de Academias
	private List<Long> academies = new ArrayList<Long>();
	private String academicDegree;
	private String academicBackgroung;
	private String photoLink;
	private int mobilePhone;
	private String linkedInAdress;
	//themes so vai ter valores para formadores
	private List<String> themes = new ArrayList<String>();
	//evaluations e missedDays so vai ter valores para formandos
	//evaluation é para passar a lista de evaluations
	private List<String> evaluations= new ArrayList<String>();
	private List<LocalDate> missedDays = new ArrayList<LocalDate>();
	
	public Account() {}

	public Account(Long userId, int age, String academicDegree, String academicBackgroung,
			String photoLink, int mobilePhone, String linkedInAdress) {
		this.userId = userId;
		this.age = age;
		this.academicDegree = academicDegree;
		this.academicBackgroung = academicBackgroung;
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

	public List<Long> getAcademies() {
		return academies;
	}

	public void setAcademies(List<Long> academies) {
		this.academies = academies;
	}

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public String getAcademicBackgroung() {
		return academicBackgroung;
	}

	public void setAcademicBackgroung(String academicBackgroung) {
		this.academicBackgroung = academicBackgroung;
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

	public List<String> getThemes() {
		return themes;
	}

	public void setThemes(List<String> themes) {
		this.themes = themes;
	}

	public List<String> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<String> evaluations) {
		this.evaluations = evaluations;
	}

	public List<LocalDate> getMissedDays() {
		return missedDays;
	}

	public void setMissedDays(List<LocalDate> missedDays) {
		this.missedDays = missedDays;
	}
	
	
}
