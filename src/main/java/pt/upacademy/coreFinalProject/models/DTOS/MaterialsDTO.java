package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

public class MaterialsDTO extends EntityDTO {

	private long id;
	private String title;
	private String type;
	private String url;
	private List<Long> lessonsIds = new ArrayList<Long>();

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Long> getLessonsIds() {
		return lessonsIds;
	}

	public void setLessonsIds(List<Long> lessonsIds) {
		this.lessonsIds = lessonsIds;
	}

}
