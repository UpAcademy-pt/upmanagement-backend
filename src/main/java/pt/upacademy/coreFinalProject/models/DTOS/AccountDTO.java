package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pt.upacademy.coreFinalProject.models.Theme;

public class AccountDTO extends EntityDTO {
	
	@Override
	public String toString() {
		return "AccountDTO [userId=" + userId + ", age=" + age + ", academyIds=" + academyIds + ", academicDegree="
				+ academicDegree + ", academicBackground=" + academicBackground + ", photoLink=" + photoLink
				+ ", mobilePhone=" + mobilePhone + ", linkedInAdress=" + linkedInAdress + ", themes=" + themes
				+ ", nif=" + nif + "]";
	}

	private long userId;
	private String age;
	private List<Long> academyIds = new ArrayList<Long>();
	private String academicDegree;
	private String academicBackground;
	private String photoLink;
	private int mobilePhone;
	private String linkedInAdress;
	//themes so vai ter valores para formadores
	private Set<Theme> themes = new HashSet<Theme>();
	//evaluations so vai ter valores para formandos
//	private List<Long> evaluationIds= new ArrayList<Long>();     *GONÇALO*
//	private String missedDays;
	private long nif;
	
	
	public AccountDTO() {}



	public AccountDTO(long userId, String age, String academicDegree, String academicBackground, String photoLink,
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
	
	
	public AccountDTO(long userId, String age, List<Long> academyIds, String academicDegree, String academicBackground,
			String photoLink, int mobilePhone, String linkedInAdress, Set<Theme> themes, 
			long nif) {
		super();
		this.userId = userId;
		this.age = age;
		this.academyIds = academyIds;
		this.academicDegree = academicDegree;
		this.academicBackground = academicBackground;
		this.photoLink = photoLink;
		this.mobilePhone = mobilePhone;
		this.linkedInAdress = linkedInAdress;
		this.themes = themes;
//		this.evaluationIds = evaluationIds;       *GONÇALO*
//		this.missedDays = missedDays;
		this.nif = nif;
	}   /* retirei o "List<Long> evaluationIds," e comentei o this */


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

	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
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

	
	public String getAcademicBackground() {
		return academicBackground;
	}

	public void setAcademicBackground(String academicBackgroung) {
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

	
	public Set<Theme> getThemes() {
		return themes;
	}

	public void setThemes(Set<Theme> themes) {
		this.themes = themes;
	}

	
//	public List<Long> getEvaluationIds() {
//		return evaluationIds;
//	}											*GONÇALO*
//
//	public void setEvaluationIds(List<Long> evaluationIds) {
//		this.evaluationIds = evaluationIds;
//	}

	
//	public String getMissedDays() {
//		return missedDays;
//	}
//
//	public void setMissedDays(String missedDays) {
//		this.missedDays = missedDays;
//	}
	
}
