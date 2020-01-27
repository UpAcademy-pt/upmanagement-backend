package pt.upacademy.coreFinalProject.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntityRoot implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date createData;
	private Date modifiedData;

	public long getId() {
		return id;
	}

	public void setId(long iD) {
		id = iD;
	}

	public Date getCreateData() {
		return createData;
	}

	public void setCreateData(Date createData) {
		this.createData = createData;
	}

	public Date getModifiedData() {
		return modifiedData;
	}

	public void setModifiedData(Date modifiedData) {
		this.modifiedData = modifiedData;
	}
	
	
}
