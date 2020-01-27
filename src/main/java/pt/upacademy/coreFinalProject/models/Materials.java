package pt.upacademy.coreFinalProject.models;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

@Entity
public class Materials extends EntityRoot {

	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy = "materials", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Collection<Lesson> lessons = new HashSet<>();

	public Collection<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(Collection<Lesson> lessons) {
		this.lessons = lessons;
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

	private String title;
	private String type;
	private String url;
}
