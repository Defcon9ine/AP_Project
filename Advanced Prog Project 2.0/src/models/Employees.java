package models;

public class Employees {

private String staffID;
private String firstName;
private String lastName;
private String email;
private String phone;
private String password;
private String repassword;


public Employees() {
	
}


public Employees(String staffID, String firstName, String lastName, String email, String phone,String password,String repassword) {
	super();
	this.staffID = staffID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phone = phone;
	this.password=password;
	this.repassword=password;
}



public String getPassword() {
	return password;
}


public void setPassword(String passwordString) {
	this.password = password;
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

public String getRepassword() {
	return repassword;
}


public void setRepassword(String repassword) {
	this.repassword = repassword;
}


@Override
public String toString() {
	return "Employees [staffID=" + staffID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", phone=" + phone + "]";
}





}
