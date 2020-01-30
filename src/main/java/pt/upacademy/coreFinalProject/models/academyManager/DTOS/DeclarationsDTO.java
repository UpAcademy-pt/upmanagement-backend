package pt.upacademy.coreFinalProject.models.academyManager.DTOS;

public class DeclarationsDTO extends EntityDTO{

	private int accountIdSender;
	private int accountIdReceiver;
	private String dateSent;
	private String dateReceived;
	private String fileUrlSent;
	private String fileUrlReturned;
	private Boolean verified;
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
	public String getDateSent() {
		return dateSent;
	}
	public void setDateSent(String dateSent) {
		this.dateSent = dateSent;
	}
	public String getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(String dateReveived) {
		this.dateReceived = dateReveived;
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
	public Boolean getVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	
	public DeclarationsDTO() {
		super();
	}
	public DeclarationsDTO(int accountIdSender, int accountIdReceiver, String dateSent, String dateReveived,
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
	@Override
	public String toString() {
		return "DeclarationsDTO [accountIdSender=" + accountIdSender + ", accountIdReceiver=" + accountIdReceiver
				+ ", dateSent=" + dateSent + ", dateReveived=" + dateReceived + ", fileUrlSent=" + fileUrlSent
				+ ", fileUrlReturned=" + fileUrlReturned + ", verified=" + verified + "]";
	}
		
	
}
