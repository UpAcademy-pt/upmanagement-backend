package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Collection;

public class LessonDTO extends EntityDTO {

	private long id;
	private String title;
	private String description;
	private Collection<Long> noteIdByLesson;
	private Collection<Long> materialsIdByLesson;

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

	public Collection<Long> getNoteIdByLesson() {
		return noteIdByLesson;
	}

	public void setNoteIdByLesson(Collection<Long> noteIdByLesson) {
		this.noteIdByLesson = noteIdByLesson;
	}

	public Collection<Long> getMaterialsIdByLesson() {
		return materialsIdByLesson;
	}

	public void setMaterialsIdByLesson(Collection<Long> materialsIdByLesson) {
		this.materialsIdByLesson = materialsIdByLesson;
	}

}
