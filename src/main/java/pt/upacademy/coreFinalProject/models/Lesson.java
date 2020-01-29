package pt.upacademy.coreFinalProject.models;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Lesson.GET_ALL_LESSONS, query = "SELECT l FROM Lesson l"),
		@NamedQuery(name = Lesson.GET_LESSONS_BY_EDITION_ID, query = "SELECT l FROM Lesson l WHERE l.editionId = :editionId"),
//		@NamedQuery(name = Lesson.GET_LESSONS_COUNT, query = "SELECT COUNT(l.id) FROM Lesson l"),
})


public class Lesson extends EntityRoot {

	private static final long serialVersionUID = 1L;

	public static final String GET_ALL_LESSONS = "getAllLessons";
	public static final String GET_LESSONS_BY_EDITION_ID = "getLessonsByEditionId";
//	public static final String GET_LESSONS_COUNT = "getLessonsCount";

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinTable(name = "Lesson_Materials", joinColumns = { @JoinColumn(name = "lesson_id", referencedColumnName = "id") }, inverseJoinColumns = {
			@JoinColumn(name = "materials_id", referencedColumnName = "id") })
	private Collection<Materials> materials = new HashSet<>();
	private String title;
	private String description;
	private long editionId;

	public Collection<Materials> getMaterials() {
		return materials;
	}

	public void setMaterials(Collection<Materials> materials) {
		this.materials = materials;
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

	public long getEditionId() {
		return editionId;
	}

	public void setEditionId(long editionId) {
		this.editionId = editionId;
	}

	@Override
	public String toString() {
		return "Lesson [title=" + title + ", description=" + description + ", editionId=" + editionId + "]";
	}

}
