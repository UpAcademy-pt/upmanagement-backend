package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

public class AccountDTO extends EntityDTO {
	
	private long userId;
	private int age;
	private List<Long> academyIds = new ArrayList<Long>();
	private String academicDegree;
	private String academicBackground;
	private String photoLink;
	private int mobilePhone;
	private String linkedInAdress;
	//themes so vai ter valores para formadores
	private List<Long> themeIds = new ArrayList<Long>();
	//evaluations so vai ter valores para formandos
	private List<Long> evaluationIds= new ArrayList<Long>();
	private String missedDays;
	private long nif;
	
	
	public AccountDTO() {}



	public AccountDTO(long userId, int age, String academicDegree, String academicBackground, String photoLink,
			int mobilePhone, String linkedInAdress, long nif) {
		this.userId = userId;
		this.age = age;
		this.academicDegree = academicDegree;
		this.academicBackground = academicBackground;
		this.photoLink = photoLink;
		this.mobilePhone = mobilePhone;
		this.linkedInAdress = linkedInAdress;
		this.nif = nif;
	}
	
	
	public AccountDTO(long userId, int age, List<Long> academyIds, String academicDegree, String academicBackground,
			String photoLink, int mobilePhone, String linkedInAdress, List<Long> themeIds, List<Long> evaluationIds,
			String missedDays, long nif) {
		super();
		this.userId = userId;
		this.age = age;
		this.academyIds = academyIds;
		this.academicDegree = academicDegree;
		this.academicBackground = academicBackground;
		this.photoLink = photoLink;
		this.mobilePhone = mobilePhone;
		this.linkedInAdress = linkedInAdress;
		this.themeIds = themeIds;
		this.evaluationIds = evaluationIds;
		this.missedDays = missedDays;
		this.nif = nif;
	}



	public long getUserId() {
		return userId;
	}



	public long getNif() {
		return nif;
	}



	public void setNif(long nif) {
		this.nif = nif;
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



	public List<Long> getAcademyIds() {
		return academyIds;
	}



	public void setAcademyIds(List<Long> academyIds) {
		this.academyIds = academyIds;
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



	public List<Long> getThemeIds() {
		return themeIds;
	}



	public void setThemeIds(List<Long> themeIds) {
		this.themeIds = themeIds;
	}



	public List<Long> getEvaluationIds() {
		return evaluationIds;
	}



	public void setEvaluationIds(List<Long> evaluationIds) {
		this.evaluationIds = evaluationIds;
	}



	public String getMissedDays() {
		return missedDays;
	}



	public void setMissedDays(String missedDays) {
		this.missedDays = missedDays;
	}
	
	
	
	

}
