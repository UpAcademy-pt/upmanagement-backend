package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;


public class LessonDTO extends EntityDTO {
	
	private static final long serialVersionUID = 1L;
	
	private List <Long> listEditions = new ArrayList <Long> ();
	private List <String> listUrls = new ArrayList <String> ();
	private List <Long> listNotes = new ArrayList <Long> ();
	private List <String> listCode = new ArrayList <String> ();
	
	
	public LessonDTO() {
		
	}

	public LessonDTO(List<Long> listEditions, List<String> listUrls, List<Long> listNotes, List<String> listCode) {
		this.listEditions = listEditions;
		this.listUrls = listUrls;
		this.listNotes = listNotes;
		this.listCode = listCode;
	}
	
	public List<Long> getListEditions() {
		return listEditions;
	}
	public void setListEditions(List<Long> listEditions) {
		this.listEditions = listEditions;
	}
	public List<String> getListUrls() {
		return listUrls;
	}
	public void setListUrls(List<String> listUrls) {
		this.listUrls = listUrls;
	}
	public List<Long> getListNotes() {
		return listNotes;
	}
	public void setListNotes(List<Long> listNotes) {
		this.listNotes = listNotes;
	}
	public List<String> getListCode() {
		return listCode;
	}
	public void setListCode(List<String> listCode) {
		this.listCode = listCode;
	}

	@Override
	public String toString() {
		return "ClassDTO [listEditions=" + listEditions + ", listUrls=" + listUrls + ", listNotes=" + listNotes
				+ ", listCode=" + listCode + "]";
	} 

	
	
}
