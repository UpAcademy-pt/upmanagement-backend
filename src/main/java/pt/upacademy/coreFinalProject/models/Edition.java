package pt.upacademy.coreFinalProject.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;




@Entity
@NamedQueries({ 
	@NamedQuery(name = Edition.GET_ALL_EDITIONS, query = "SELECT e FROM Edition e"),
	@NamedQuery (name = Edition.GET_ALL_EDITIONS_IDS, query = "SELECT e.id FROM Edition e"),
	@NamedQuery (name = Edition.GET_ALL_EDITIONS_COUNT, query = "SELECT COUNT(e.id) FROM Edition e")
})

public class Edition extends EntityRoot  {
	
	public static final String GET_ALL_EDITIONS = "getAllEditions";
	public static final String GET_ALL_EDITIONS_IDS = "getAllEditionsIds";
	public static final String GET_ALL_EDITIONS_COUNT = "getAllEditionsCount";

		
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private String type;
	private List <Long> listAccount;
 	private Date createDate;
	private Date updateDate;
	
	
	
	public Edition() {
		super();
	}


	
	public Edition(String name, String type, List<Long> listAccount, Date createDate,
			Date updateDate) {
		super();
		this.name = name;
		this.type = type;
		this.listAccount = listAccount;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Long> getListAccount() {
		return listAccount;
	}
	public void setListAccount(List<Long> listAccount) {
		this.listAccount = listAccount;
	}
	
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}




	@Override
	public String toString() {
		return "Edition [name=" + name + ", type=" + type + ", listAccount=" + listAccount  + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
	
	

	
	
}
