package pt.upacademy.coreFinalProject.models.DTOS;

import java.time.LocalDate;

import pt.upacademy.coreFinalProject.models.Qtype;


public class QuestionnairePreviewDTO extends EntityDTO{
	private String name;
	private Qtype qType;
	private String[] editPrivacy;
	private String[] viewPrivacy;
	private LocalDate createDate;
	private LocalDate lastModifiedDate;

	public QuestionnairePreviewDTO() {}

	public QuestionnairePreviewDTO(long id, String name, Qtype qType, String[] editPrivacy, String[] viewPrivacy,
			LocalDate createDate, LocalDate lastModifiedDate) {
		setId(id);
		this.name = name;
		this.qType = qType;
		this.editPrivacy = editPrivacy;
		this.viewPrivacy = viewPrivacy;
		this.createDate = createDate;
		this.lastModifiedDate = createDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Qtype getqType() {
		return qType;
	}

	public void setqType(Qtype qType) {
		this.qType = qType;
	}

	public String[] getEditPrivacy() {
		return editPrivacy;
	}

	public void setEditPrivacy(String[] editPrivacy) {
		this.editPrivacy = editPrivacy;
	}

	public String[] getViewPrivacy() {
		return viewPrivacy;
	}

	public void setViewPrivacy(String[] viewPrivacy) {
		this.viewPrivacy = viewPrivacy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDate lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
}
