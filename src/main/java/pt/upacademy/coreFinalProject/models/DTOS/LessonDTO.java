package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Set;

import pt.upacademy.coreFinalProject.models.Note;

public class LessonDTO extends EntityDTO {

	private long editionId;
	private String title;
	private String description;
	private Set<Note> notes;
	private Set<MaterialsDTO> materialsIdByLesson;

	public long getEditionId() {
		return editionId;
	}

	public void setEditionId(long editionId) {
		this.editionId = editionId;
	}

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

	public Set<Note> getNotes() {
		return notes;
	}

	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}

	public Set<MaterialsDTO> getMaterialsIdByLesson() {
		return materialsIdByLesson;
	}

	public void setMaterialsIdByLesson(Set<MaterialsDTO> materialsIdByLesson) {
		this.materialsIdByLesson = materialsIdByLesson;
	}

}
