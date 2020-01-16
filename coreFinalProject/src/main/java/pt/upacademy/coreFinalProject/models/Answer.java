package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;

@Entity
public class Answer extends Entity_{

	private static final long serialVersionUID = 1L;
	
	private enum AnswerType {
		multiple,
		open,
		singleOption
	}
	
	
	private String answer;
	private AnswerType rtype;
	private long questionId;
	
	
	
	
	
}
