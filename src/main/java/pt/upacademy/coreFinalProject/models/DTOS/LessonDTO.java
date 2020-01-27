package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Set;

public class LessonDTO extends EntityDTO {

	private long id;
	private String title;
	private String description;
	private Set<Long> noteIdByLesson;
	private Set<Long> materialsIdByLesson;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Set<Long> getNoteIdByLesson() {
		return noteIdByLesson;
	}

	public void setNoteIdByLesson(Set<Long> noteIdByLesson) {
		this.noteIdByLesson = noteIdByLesson;
	}

	public Set<Long> getMaterialsIdByLesson() {
		return materialsIdByLesson;
	}

	public void setMaterialsIdByLesson(Set<Long> materialsIdByLesson) {
		this.materialsIdByLesson = materialsIdByLesson;
	}

}
