package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.Collection;

public class LessonDTO extends EntityDTO {

	private long editionId;
	private String title;
	private String description;
	private Collection<Long> materialsIds = new ArrayList<Long>();

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

	public Collection<Long> getMaterialsIds() {
		return materialsIds;
	}

	public void setMaterialsIds(Collection<Long> materialsIds) {
		this.materialsIds = materialsIds;
	}

}
