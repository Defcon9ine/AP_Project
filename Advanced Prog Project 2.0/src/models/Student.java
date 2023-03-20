package models;

import java.lang.invoke.StringConcatFactory;

public class Student {
private String firstName;
private String lastName;
private String ID;
private String email;
private String phone;
private String password;
private String repassword;
private String complaint;
private String complaintdate;
private String complaintID;
private String complaintstatus;



public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getID() {
	return ID;
}

public void setID(String iD) {
	ID = iD;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}



public void setrePassword(String password) {
	this.password = password;
}
public String getrePassword() {
	return password;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getComplaint() {
	return complaint;
}

public void setComplaint(String complaint) {
	this.complaint = complaint;
}

public String getComplaintdate() {
	return complaintdate;
}

public void setComplaintdate(String complaintdate) {
	this.complaintdate = complaintdate;
}

public String getComplaintID() {
	return complaintID;
}

public void setComplaintID(String complaintID) {
	this.complaintID = complaintID;
}




public String getComplaintstatus() {
	return complaintstatus;
}

public void setComplaintstatus(String complaintstatus) {
	this.complaintstatus = complaintstatus;
}

public Student() {
	
}

public Student(String firstName, String lastName, String iD, String email, String phone, String password,
		String issueType, String issueDescription) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	ID = iD;
	this.email = email;
	this.phone = phone;
	this.password = password;

}




}
