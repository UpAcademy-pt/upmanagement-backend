package pt.upacademy.coreFinalProject.models.DTOS;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountDTO extends EntityDTO {
	
	private long userId;
	private int age;
	private List<Long> academies = new ArrayList<Long>();
	private String academicDegree;
	private String academicBackground;
	private String photoLink;
	private int mobilePhone;
	private String linkedInAdress;
	//themes so vai ter valores para formadores
	private List<String> themes = new ArrayList<String>();
	//evaluations so vai ter valores para formandos
	private List<String> evaluations= new ArrayList<String>();
	private List<String> missedDays;
	
	
	
	public AccountDTO() {}



	public AccountDTO(long userId, int age, String academicDegree, String academicBackground, String photoLink,
			int mobilePhone, String linkedInAdress) {
		this.userId = userId;
		this.age = age;
		this.academicDegree = academicDegree;
		this.academicBackground = academicBackground;
		this.photoLink = photoLink;
		this.mobilePhone = mobilePhone;
		this.linkedInAdress = linkedInAdress;
	}
	
	



	public AccountDTO(long userId, int age, List<Long> academies, String academicDegree, String academicBackground,
			String photoLink, int mobilePhone, String linkedInAdress, List<String> themes, List<String> evaluations,
			List<String> missedDays) {
		super();
		this.userId = userId;
		this.age = age;
		this.academies = academies;
		this.academicDegree = academicDegree;
		this.academicBackground = academicBackground;
		this.photoLink = photoLink;
		this.mobilePhone = mobilePhone;
		this.linkedInAdress = linkedInAdress;
		this.themes = themes;
		this.evaluations = evaluations;
		this.missedDays = missedDays;
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



	public List<String> getMissedDays() {
		return missedDays;
	}



	public void setMissedDays(List<String> missedDays) {
		this.missedDays = missedDays;
	}
	
	
	
	

}
