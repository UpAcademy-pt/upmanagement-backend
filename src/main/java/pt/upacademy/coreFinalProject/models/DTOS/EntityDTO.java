package pt.upacademy.coreFinalProject.models.DTOS;

import java.time.LocalDate;

public class EntityDTO {
	
	private long id;
	private LocalDate createDate;
	private LocalDate lastModifiedDate;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDate lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
}
