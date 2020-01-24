package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Arrays;
import java.util.Collection;

public class LessonDTO extends EntityDTO {

	private String title;
	private String description;
	private String[] studyMaterial;
	private Collection<Long> notesIds;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getStudyMaterial() {
		return studyMaterial;
	}

	public void setStudyMaterial(String[] studyMaterial) {
		this.studyMaterial = studyMaterial;
	}

	public Collection<Long> getNotesIds() {
		return notesIds;
	}

	public void setNotesIds(Collection<Long> notesIds) {
		this.notesIds = notesIds;
	}

}
