package pt.upacademy.coreFinalProject.models;


import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Note.GET_ALL_NOTES, query = "SELECT n FROM Note n"),
	@NamedQuery(name = Note.GET_ALL_NOTES_IDS, query = "SELECT n.id FROM Note n"),
	@NamedQuery(name = Note.GET_NOTES_COUNT, query = "SELECT COUNT(n.id) FROM Note n"),
	@NamedQuery(name = Note.GET_NOTES_BY_LESSONS_IDS, query = "SELECT n FROM Note n WHERE n.lessonId = :lessonId") // verificar
	 })
public class Note extends EntityRoot{
	
	public static final String GET_ALL_NOTES = "getAllNotes";
	public static final String GET_ALL_NOTES_IDS = "getAllNotesIds";
	public static final String GET_NOTES_COUNT = "getNotesCount";
	public static final String GET_NOTES_BY_LESSONS_IDS = "getNotesByLessonsIds";
	
	private static final long serialVersionUID = 1L;
	

	private long lessonId;
	private long editionId; 
	private long accountId;
	private String noteText;
	
	
	public static String getClassName() {
		return "Note";
	}
	
	public Note() {
	}
	
	public Note(long lessonId, long editionId, long accountId, String noteText) {
		super();
		this.lessonId = lessonId;
		this.editionId = editionId;
		this.accountId = accountId;
		this.noteText = noteText;
	}

	public long getLessonId() {
		return lessonId;
	}

	public void setLessonId(long lessonId) {
		this.lessonId = lessonId;
	}

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
	
	public String getNoteText() {
		return noteText;
	}

	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}

	@Override
	public String toString() {
		return "Note [lessonId=" + lessonId + ", editionId=" + editionId + ", accountId=" + accountId + "]";
	}
	
	
}
