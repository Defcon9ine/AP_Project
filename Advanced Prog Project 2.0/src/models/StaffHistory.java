package models;

import java.util.ArrayList;

public class StaffHistory {
	
	ArrayList<String> staffId = new ArrayList<String>();
	ArrayList<String> studentid = new ArrayList<String>();
	ArrayList<String> complaint = new ArrayList<String>();
	ArrayList<String> reponse = new ArrayList<String>();
	ArrayList<String> complaintdate = new ArrayList<String>();
	ArrayList<String> reponseDate = new ArrayList<String>();
	ArrayList<String> complaintID = new ArrayList<String>();
	ArrayList<String> complaintstatus = new ArrayList<String>();
	
	public StaffHistory() {
		
	}
	public StaffHistory(ArrayList<String> staffId, ArrayList<String> studentid, ArrayList<String> complaint,
			ArrayList<String> reponse, ArrayList<String> complaintdate, ArrayList<String> reponseDate,
			ArrayList<String> complaintID, ArrayList<String> complaintstatus) {
		
		this.staffId = staffId;
		this.studentid = studentid;
		this.complaint = complaint;
		this.reponse = reponse;
		this.complaintdate = complaintdate;
		this.reponseDate = reponseDate;
		this.complaintID = complaintID;
		this.complaintstatus = complaintstatus;
	}
	public ArrayList<String> getStaffId() {
		return staffId;
	}
	public void setStaffId(ArrayList<String> staffId) {
		this.staffId = staffId;
	}
	public ArrayList<String> getStudentid() {
		return studentid;
	}
	public void setStudentid(ArrayList<String> studentid) {
		this.studentid = studentid;
	}
	public ArrayList<String> getComplaint() {
		return complaint;
	}
	public void setComplaint(ArrayList<String> complaint) {
		this.complaint = complaint;
	}
	public ArrayList<String> getReponse() {
		return reponse;
	}
	public void setReponse(ArrayList<String> reponse) {
		this.reponse = reponse;
	}
	public ArrayList<String> getComplaintdate() {
		return complaintdate;
	}
	public void setComplaintdate(ArrayList<String> complaintdate) {
		this.complaintdate = complaintdate;
	}
	public ArrayList<String> getReponseDate() {
		return reponseDate;
	}
	public void setReponseDate(ArrayList<String> reponseDate) {
		this.reponseDate = reponseDate;
	}
	public ArrayList<String> getComplaintID() {
		return complaintID;
	}
	public void setComplaintID(ArrayList<String> complaintID) {
		this.complaintID = complaintID;
	}
	public ArrayList<String> getComplaintstatus() {
		return complaintstatus;
	}
	public void setComplaintstatus(ArrayList<String> complaintstatus) {
		this.complaintstatus = complaintstatus;
	}
	
	
}
