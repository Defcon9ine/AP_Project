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
private String issueType;
private String issueDescription;



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

public String getIssueType() {
	return issueType;
}

public void setIssueType(String issueType) {
	this.issueType = issueType;
}

public String getIssueDescription() {
	return issueDescription;
}

public void setIssueDescription(String issueDescription) {
	this.issueDescription = issueDescription;
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
	this.issueType = issueType;
	this.issueDescription = issueDescription;
}

@Override
public String toString() {
	return "Student [firstName=" + firstName + ", lastName=" + lastName + ", ID=" + ID + ", email=" + email + ", phone="
			+ phone + ", password=" + password + ", issueType=" + issueType + ", issueDescription=" + issueDescription
			+ "]";
}


}
