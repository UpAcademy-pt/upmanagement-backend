package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;

@Entity
public class Answer extends Entity_{

	private enum AnswerType {
		multiple,
		open,
		singleOption
	}
	
	
	private String answer;
	private AnswerType rtype;
	private long questionId;
	
	
	
	
	
}
