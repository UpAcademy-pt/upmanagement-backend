package pt.upacademy.coreFinalProject.models.DTOS;

import java.util.ArrayList;
import java.util.List;

public class EditionDTO extends EntityDTO {

	private String name;
	private String type;
	private long accountId;
	private List <Long>  lessonsIds = new ArrayList<Long>();
	private List <Long> notesIds = new ArrayList<Long>();
	private List <Long> questionsIds = new ArrayList<Long>();
	private List <Long>  answersIds = new ArrayList<Long>();
	private List <Long>  eventsIds = new ArrayList<Long>();
	
	
	
	public EditionDTO() {
	}
	public EditionDTO(String name, String type, long accountId, List<Long> lessonsIds, List<Long> notesIds,
			List<Long> questionsIds, List<Long> answersIds, List<Long> eventsIds) {
		this.name = name;
		this.type = type;
		this.accountId = accountId;
		this.lessonsIds = lessonsIds;
		this.notesIds = notesIds;
		this.questionsIds = questionsIds;
		this.answersIds = answersIds;
		this.eventsIds = eventsIds;
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
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public List<Long> getLessonsIds() {
		return lessonsIds;
	}
	public void setLessonsIds(List<Long> lessonsIds) {
		this.lessonsIds = lessonsIds;
	}
	public List<Long> getNotesIds() {
		return notesIds;
	}
	public void setNotesIds(List<Long> notesIds) {
		this.notesIds = notesIds;
	}
	public List<Long> getQuestionsIds() {
		return questionsIds;
	}
	public void setQuestionsIds(List<Long> questionsIds) {
		this.questionsIds = questionsIds;
	}
	public List<Long> getAnswersIds() {
		return answersIds;
	}
	public void setAnswersIds(List<Long> answersIds) {
		this.answersIds = answersIds;
	}
	public List<Long> getEventsIds() {
		return eventsIds;
	}
	public void setEventsIds(List<Long> eventsIds) {
		this.eventsIds = eventsIds;
	}
	
	
	@Override
	public String toString() {
		return "EditionDTO [name=" + name + ", type=" + type + ", accountId"+ accountId + ", lessonsIds=" + lessonsIds + ", notesIds=" + notesIds 
				+ ", questionsIds=" + questionsIds +", answersIds=" + answersIds + ", eventsIds=" + eventsIds + "]";
	}
	
	
}
