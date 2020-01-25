package pt.upacademy.coreFinalProject.models.DTOS;

public class QuestionnairePreviewDTO extends EntityDTO{
	private String name;

	public QuestionnairePreviewDTO() {}

	public QuestionnairePreviewDTO(long id, String name) {
		setId(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
