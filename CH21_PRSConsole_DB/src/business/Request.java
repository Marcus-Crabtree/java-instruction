package business;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Request {
	private int id;
	private int UserID;
	private String description;
	private String justification;
	private String deliveryMode;
	private String status;
	private String reasonForRejection;
	private LocalDate dateNedded;
	private double total;
	private LocalDateTime submittedDate;
	
	public Request() {
		super();
	}

	public Request(int id, int UserID, String description, String justification, String deliveryMode, String status,
			String reasonForRejection, LocalDate dateNedded, double total, LocalDateTime submittedDate) {
		super();
		this.id = id;
		this.UserID = UserID;
		this.description = description;
		this.justification = justification;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.reasonForRejection = reasonForRejection;
		this.dateNedded = dateNedded;
		this.total = total;
		this.submittedDate = submittedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int UserID) {
		this.UserID = UserID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	public LocalDate getDateNedded() {
		return dateNedded;
	}

	public void setDateNedded(LocalDate dateNedded) {
		this.dateNedded = dateNedded;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDateTime getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(LocalDateTime submittedDate) {
		this.submittedDate = submittedDate;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", UserID=" + UserID + ", description=" + description + ", justification="
				+ justification + ", deliveryMode=" + deliveryMode + ", status=" + status + ", reasonForRejection="
				+ reasonForRejection + ", dateNedded=" + dateNedded + ", total=" + total + ", submittedDate="
				+ submittedDate + "]";
	}
	
	
	
	

}
