package pt.upacademy.coreFinalProject.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;

@Entity
@NamedQueries ({
	
})
public class Event extends EntityRoot {

	private static final long serialVersionUID = 1L;
	public static final String GET_ALL_EVENTS = "getAllEvents";
	
	private User user;
	private Date beginDate;
	private Date finishDate;
	private int duration;
	
	
	public Event() {

	}
	
	
	public Event(User user, Date beginDate, Date finishDate, int duration) {
		this.user = user;
		this.beginDate = beginDate;
		this.finishDate = finishDate;
		this.duration = duration;
	}


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Event [user=" + user + ", beginDate=" + beginDate + ", finishDate=" + finishDate + ", duration="
				+ duration + "]";
	}
	
	
	
	
	
	
	

}
