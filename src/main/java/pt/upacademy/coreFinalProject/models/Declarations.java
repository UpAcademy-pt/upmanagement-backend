package pt.upacademy.coreFinalProject.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = Declarations.GET_ALL_DECLARATIONS_BY_ACCOUNTID, query = "SELECT d FROM Declarations d WHERE d.accountIdReceiver = :accountIdReceiver")
})
public class Declarations extends EntityRoot {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_DECLARATIONS_BY_ACCOUNTID = "getAllDeclarationsByAccountId";

	private int accountIdSender;
	private int accountIdReceiver;
	private LocalDate dateSent;
	private LocalDate dateReceived;
	private String fileUrlSent;
	private String fileUrlReturned;
	private Boolean verified;
	
	public Boolean getVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public int getAccountIdSender() {
		return accountIdSender;
	}
	public void setAccountIdSender(int accountIdSender) {
		this.accountIdSender = accountIdSender;
	}
	public int getAccountIdReceiver() {
		return accountIdReceiver;
	}
	public void setAccountIdReceiver(int accountIdReceiver) {
		this.accountIdReceiver = accountIdReceiver;
	}

	public String getFileUrlSent() {
		return fileUrlSent;
	}
	public void setFileUrlSent(String fileUrlSent) {
		this.fileUrlSent = fileUrlSent;
	}
	public String getFileUrlReturned() {
		return fileUrlReturned;
	}
	public void setFileUrlReturned(String fileUrlReturned) {
		this.fileUrlReturned = fileUrlReturned;
	}
	public LocalDate getDateSent() {
		return dateSent;
	}
	public void setDateSent(LocalDate dateSent) {
		this.dateSent = dateSent;
	}
	public LocalDate getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(LocalDate dateReveived) {
		this.dateReceived = dateReveived;
	}
	
	
	public Declarations() {
		super();
	}
	public Declarations(int accountIdSender, int accountIdReceiver, LocalDate dateSent, LocalDate dateReveived,
			String fileUrlSent, String fileUrlReturned, Boolean verified) {
		super();
		this.accountIdSender = accountIdSender;
		this.accountIdReceiver = accountIdReceiver;
		this.dateSent = dateSent;
		this.dateReceived = dateReveived;
		this.fileUrlSent = fileUrlSent;
		this.fileUrlReturned = fileUrlReturned;
		this.verified = verified;
	}

}
