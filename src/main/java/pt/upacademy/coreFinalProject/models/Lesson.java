package pt.upacademy.coreFinalProject.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Lesson.GET_ALL_LESSONS, query = "SELECT l FROM Lesson l"),
		@NamedQuery(name = Lesson.GET_ALL_LESSONS_IDS, query = "SELECT l.id FROM Lesson l"),
		@NamedQuery(name = Lesson.GET_LESSONS_COUNT, query = "SELECT COUNT(l.id) FROM Lesson l") })
public class Lesson extends EntityRoot {

	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_LESSONS = "getAllLessons";
	public static final String GET_ALL_LESSONS_IDS = "getAllLessonsIds";
	public static final String GET_LESSONS_COUNT = "getLessonsCount";

	private String title;
	private String description;
	private String[] studyMaterial;
//	private Collection<Note> notes;

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



}
