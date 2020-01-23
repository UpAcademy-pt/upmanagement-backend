package pt.upacademy.coreFinalProject.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Lesson.GET_ALL_LESSONS, query = "SELECT l FROM Lesson l"),
		@NamedQuery(name = Lesson.GET_ALL_LESSONS_IDS, query = "SELECT l.id FROM Lesson l"),
		@NamedQuery(name = Lesson.GET_LESSONS_COUNT, query = "SELECT COUNT(l.id) FROM Lesson l") })
public class Lesson extends EntityRoot {

	public static final String GET_ALL_LESSONS = "getAllLessons";
	public static final String GET_ALL_LESSONS_IDS = "getAllLessonsIds";
	public static final String GET_LESSONS_COUNT = "getLessonsCount";
	private static final long serialVersionUID = 1L;

//	private List<Edition> listEditions = new ArrayList<Edition>();
//	private List<String> listUrls = new ArrayList<String>();
//	private List<Note> listNotes = new ArrayList<Note>();
//	private List<String> listCode = new ArrayList<String>();
	private long editionId;
	
	

	public long getEditionIds() {
		return editionId;
	}

	public void setEditionId(long editionId) {
		this.editionId = editionId;
	}



	public Lesson() {

	}

//	public Lesson(List<Edition> listEditions, List<String> listUrls, List<Note> listNotes, List<String> listCode) {
//		this.listEditions = listEditions;
//		this.listUrls = listUrls;
//		this.listNotes = listNotes;
//		this.listCode = listCode;
//	}

//	public List<Edition> getListEditions() {
//		return listEditions;
//	}
//
//	public void setListEditions(List<Edition> listEditions) {
//		this.listEditions = listEditions;
//	}
//
//	public List<String> getListUrls() {
//		return listUrls;
//	}

//	public void setListUrls(List<String> listUrls) {
//		this.listUrls = listUrls;
//	}
//
//	public List<Note> getListNotes() {
//		return listNotes;
//	}
//
//	public void setListNotes(List<Note> listNotes) {
//		this.listNotes = listNotes;
//	}

//	public List<String> getListCode() {
//		return listCode;
//	}
//
//	public void setListCode(List<String> listCode) {
//		this.listCode = listCode;
//	}

//	@Override
//	public String toString() {
//		return "Class [listEditions=" + listEditions + ", listUrls=" + listUrls + ", listNotes=" + listNotes
//				+ ", listCode=" + listCode + "]";
//	}

}
