package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Account.GET_ALL_ACCOUNTS, query = "SELECT a FROM Account a")})
public class Account extends EntityRoot {

	public static final String GET_ALL_ACCOUNTS = "getAllAccounts";
	private static final long serialVersionUID = 1L;

	private long userId;
	private List<Long> pendingQuentionnairesIds;
	private List<Long> userAcademies;

	public List<Long> getPendingQuentionnaires() {
		return pendingQuentionnairesIds;
	}

	public void setPendingQuentionnaires(List<Long> pendingQuestionnaires) {
		this.pendingQuentionnairesIds = pendingQuestionnaires;
	}

	//jkewgbjkbewjkgb
	public List<Long> getUserAcademies() {
		return userAcademies;
	}

	public void setUserAcademies(List<Long> userAcademies) {
		this.userAcademies = userAcademies;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
