package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.Date;

public class EventDTO extends EntityDTO {
	
	private long eventId;
	private long userId;
	private Date beginDate;
	private Date finishDate;
	private int duration;
	
	
	
	public EventDTO() {
	}

	public EventDTO(long eventId, long userId, Date beginDate, Date finishDate, int duration) {
	
		this.eventId = eventId;
		this.userId = userId;
		this.beginDate = beginDate;
		this.finishDate = finishDate;
		this.duration = duration;
	}
	
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
		return "EventDTO [eventId=" + eventId + ", userId=" + userId + ", beginDate=" + beginDate + ", finishDate="
				+ finishDate + ", duration=" + duration + "]";
	}
	
	
	

}
