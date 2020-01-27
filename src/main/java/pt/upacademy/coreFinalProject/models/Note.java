package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Note.GET_ALL_NOTES, query = "SELECT n FROM Note n"),
		@NamedQuery(name = Note.GET_ALL_NOTES_IDS, query = "SELECT n.id FROM Note n"),
		@NamedQuery(name = Note.GET_NOTES_COUNT, query = "SELECT COUNT(n.id) FROM Note n"),
		@NamedQuery(name = Note.GET_NOTES_BY_LESSONS_IDS, query = "SELECT n FROM Note n WHERE n.lessonId = :lessonId") })
public class Note extends EntityRoot {

	public static final String GET_ALL_NOTES = "getAllNotes";
	public static final String GET_ALL_NOTES_IDS = "getAllNotesIds";
	public static final String GET_NOTES_COUNT = "getNotesCount";
	public static final String GET_NOTES_BY_LESSONS_IDS = "getNotesByLessonsIds";

	private static final long serialVersionUID = 1L;

	private long editionId;
	private long accountId;
	private long lessonId;
	private String title;
	private String description;

	public long getEditionId() {
		return editionId;
	}

	public void setEditionId(long editionId) {
		this.editionId = editionId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getLessonId() {
		return lessonId;
	}

	public void setLessonId(long lessonId) {
		this.lessonId = lessonId;
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

	@Override
	public String toString() {
		return "Note [editionId=" + editionId + ", accountId=" + accountId + ", lessonId=" + lessonId + ", title="
				+ title + ", description=" + description + "]";
	}

}
