package pt.upacademy.coreFinalProject.models.questionnaire.DTOs;

import pt.upacademy.coreFinalProject.models.core.DTOS.EntityDTO;
import pt.upacademy.coreFinalProject.models.questionnaire.Qtype;


public class QuestionnairePreviewDTO extends EntityDTO{
	private String name;
	private Qtype qType;
	private String[] editPrivacy;
	private String[] viewPrivacy;

	public QuestionnairePreviewDTO() {}

	public QuestionnairePreviewDTO(long id, String name, Qtype qType, String[] editPrivacy, String[] viewPrivacy,
			long createDate, long lastModifiedDate) {
		setId(id);
		setCreateDate(createDate);
		setLastModifiedDate(lastModifiedDate);
		this.name = name;
		this.qType = qType;
		this.editPrivacy = editPrivacy;
		this.viewPrivacy = viewPrivacy;
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
	
}
