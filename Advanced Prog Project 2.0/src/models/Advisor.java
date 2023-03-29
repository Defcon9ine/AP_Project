package models;

import java.util.ArrayList;

public class Advisors {
	
	ArrayList<String> advisorId = new ArrayList<String>();
	ArrayList<String> fName = new ArrayList<String>();
	ArrayList<String> lName = new ArrayList<String>();
	ArrayList<String> email = new ArrayList<String>();
	ArrayList<String> category = new ArrayList<String>();
	ArrayList<String> contact = new ArrayList<String>();
	public Advisors(ArrayList<String> advisorId, ArrayList<String> fName, ArrayList<String> lName,
			ArrayList<String> email, ArrayList<String> category, ArrayList<String> contact) {
		super();
		this.advisorId = advisorId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.category = category;
		this.contact = contact;
	}
	
	public Advisors() {
		
	}

	public ArrayList<String> getAdvisorId() {
		return advisorId;
	}

	public void setAdvisorId(ArrayList<String> advisorId) {
		this.advisorId = advisorId;
	}

	public ArrayList<String> getfName() {
		return fName;
	}

	public void setfName(ArrayList<String> fName) {
		this.fName = fName;
	}

	public ArrayList<String> getlName() {
		return lName;
	}

	public void setlName(ArrayList<String> lName) {
		this.lName = lName;
	}

	public ArrayList<String> getEmail() {
		return email;
	}

	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}

	public ArrayList<String> getCategory() {
		return category;
	}

	public void setCategory(ArrayList<String> category) {
		this.category = category;
	}

	public ArrayList<String> getContact() {
		return contact;
	}

	public void setContact(ArrayList<String> contact) {
		this.contact = contact;
	}
	
	
}
