package models;

public class Employees {

private String staffID;
private String firstName;
private String lastName;
private String email;
private String phone;


public Employees() {
	
}


public Employees(String staffID, String firstName, String lastName, String email, String phone) {
	super();
	this.staffID = staffID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phone = phone;
}


public String getStaffID() {
	return staffID;
}


public void setStaffID(String staffID) {
	this.staffID = staffID;
}


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


@Override
public String toString() {
	return "Employees [staffID=" + staffID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", phone=" + phone + "]";
}



}
