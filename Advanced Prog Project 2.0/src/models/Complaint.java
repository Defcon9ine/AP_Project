package models;

import java.util.List;

public class Complaint {
private String complaintID;

	private String complaintType;
	private String complaintStatus;
	private String complaintDescription;
	private String studentID;
	private String staffID;
	private String responses;
	
	public Complaint(String complaintID, String complaintType, String complaintStatus, String complaintDescription,
			String studentID, String staffID, String responses) {
	
		this.complaintID = complaintID;
		this.complaintType = complaintType;
		this.complaintStatus = complaintStatus;
		this.complaintDescription = complaintDescription;
		this.studentID = studentID;
		this.staffID = staffID;
		this.responses = responses;
	}
	
	public Complaint() {
		this.complaintID = "";
		this.complaintType = "";
		this.complaintStatus = "";
		this.complaintDescription = "";
		this.studentID = "";
		this.staffID = "";
		this.responses = "";
	}

	public String getComplaintID() {
		return complaintID;
	}

	public void setComplaintID(String complaintID) {
		this.complaintID = complaintID;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public String getComplaintDescription() {
		return complaintDescription;
	}

	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public String getResponses() {
		return responses;
	}

	public void setResponses(String responses) {
		this.responses = responses;
	}
	
	
	

}
