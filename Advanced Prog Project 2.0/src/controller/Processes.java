package controller;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import models.Complaint;
import models.Employees;
import models.Student;
import models.History;
import views.Login;
import views.StudentDashboard;

public class Processes {
	private static Connection connection;
	private static Statement stmt;
	private static ResultSet result;
	static Student student=new Student();
	Complaint complaint = new Complaint();	
	static Employees employees=new Employees();
	static History historyModel = new History();
	
	
	public static Employees getEmployees() {
		return employees;
	}
	public static void setEmployees(Employees employees) {
		Processes.employees = employees;
	}
	public static History getHistoryModel() {
		return historyModel;
	}
	public static void setHistoryModel(History historyModel) {
		Processes.historyModel = historyModel;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Processes() {
		connection=DBConn.getDatabaseConnection();
	
	}
	public static void createaccount(Student student) { 
		String insertSQL="INSERT INTO projectdb.students(IdNumber,FirstName,LastName,EmailAddress,password)"
				        +"VALUES('"+student.getID()+"','"+student.getFirstName()+"','"+student.getLastName()+"','"
				+student.getEmail()+"','"+student.getPassword()+"');";
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertSQL);
			if(inserted==1) {
				String insertContact="INSERT INTO projectdb.studentcontact(IdNumber,TelephoneNumber)"
				        +"VALUES('"+student.getID()+"','"+student.getPhone()+"');";
				try {
					stmt=connection.createStatement();
					int inserted1=stmt.executeUpdate(insertContact);
					if(inserted1==1) {
						JOptionPane.showMessageDialog(null,"Congratulations your record has been added succesfully",
								"Insertion Status",JOptionPane.INFORMATION_MESSAGE);
						return;
					}else {
						JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
					}	
				}catch(SQLException e) {
					JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
							"Error status",JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
			}	
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
					"Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	public static void admincreateaccount(Employees employee) { 
		String insertSQL="INSERT INTO projectdb.staff(IdNumber,FirstName,LastName,EmailAddress,password)"
				        +"VALUES('"+employee.getStaffID()+"','"+employee.getFirstName()+"','"+employee.getLastName()+"','"
				+employee.getEmail()+"','"+employee.getPassword	()+"');";
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertSQL);
			if(inserted==1) {
				
				String insertContact="INSERT INTO projectdb.staffcontact(IdNumber,TelephoneNumber)"
				        +"VALUES('"+employee.getStaffID()+"','"+employee.getPhone()+"');";
				try {
					stmt=connection.createStatement();
					int inserted1=stmt.executeUpdate(insertContact);
					if(inserted1==1) {
						JOptionPane.showMessageDialog(null,"Congratulations your record has been added succesfully",
								"Insertion Status",JOptionPane.INFORMATION_MESSAGE);
						return;
					}else {
						JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
					}	
				}catch(SQLException e) {
					JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
							"Error status",JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
			}	
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
					"Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	
	public static Student loginToAccount(String ID,String password) {
		String readSQL="SELECT *"
				      +" FROM projectdb.students"
				      +" WHERE idNumber ='"+ID+"';";
		try {
			stmt=connection.createStatement();	
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String Id=result.getString("idNumber");
				String passwordString=result.getString("password");
				student.setID(Id);
				student.setPassword(passwordString);
			} 

			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		return null;
		
	}
	
	public static Employees adminloginToAccount(String staffID,String password) {
		String readSQL="SELECT *"
				      +" FROM projectdb.staff"
				      +" WHERE idNumber ='"+staffID+"';";
		try {
			stmt=connection.createStatement();	
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String Id=result.getString("idNumber");
				String passwordString=result.getString("password");
				student.setID(Id);
				student.setPassword(passwordString);
			} 

			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		return null;
		
	}
	
	public static void logComplaint(Complaint complaint) {
		String insertSQL="INSERT INTO projectdb.complain_has_student(StudentId,complain,status)"
		        +"VALUES('"+complaint.getStudentID()+"','"+complaint.getComplaintDescription()+"','"
				+complaint.getComplaintStatus()+"');";
		
		
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertSQL);
			if(inserted==1) {
				JOptionPane.showMessageDialog(null,"Congratulations your record has been added succesfully",
						"Insertion Status",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
			}	
		}catch(SQLException e) {
			System.err.println("SQL Exception"+e.getMessage());
			JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
					"Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	public static void history(Student student) {
			ArrayList<String> idnum1 = new ArrayList<String>();
			ArrayList<String> complaint2 = new ArrayList<String>();
			ArrayList<String> complaintdate2 = new ArrayList<String>();
			ArrayList<String> complaintID2 = new ArrayList<String>();
			ArrayList<String> complaintstatus2 = new ArrayList<String>();

			String readSQL="SELECT *"
					      +" FROM projectdb.complain_has_student"
					      +" WHERE StudentId='"+student.getID()+"';";
			try {
				stmt=connection.createStatement();
				result=stmt.executeQuery(readSQL);
				while(result.next()) {
					String complaint=result.getString("complain");
					String time=result.getString("complainDate");
					String status=result.getString("status");
					String complaintID=result.getString("ComplainId");

					complaint2.add(complaint);
					complaintdate2.add(time);
					complaintID2.add(complaintID);
					complaintstatus2.add(status);

					}

				historyModel.setComplaint(complaint2);
				historyModel.setComplaintID(complaintID2);
				historyModel.setComplaintdate(complaintdate2);
				historyModel.setComplaintstatus(complaintstatus2);

			}catch(SQLException e) {
				System.err.println("SQL Exception"+e.getMessage());
				JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
			}
		}
	public static void adminhistory(Student student) {
		ArrayList<String> idnum1 = new ArrayList<String>();
		ArrayList<String> complaint2 = new ArrayList<String>();
		ArrayList<String> complaintdate2 = new ArrayList<String>();
		ArrayList<String> complaintID2 = new ArrayList<String>();
		ArrayList<String> complaintstatus2 = new ArrayList<String>();

		String readSQL="SELECT *"
				      +" FROM projectdb.complain_has_student"
				      +" WHERE 1";
		try {
			stmt=connection.createStatement();
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String complaint=result.getString("complain");
				String ID=result.getString("StudentId");
				String time=result.getString("complainDate");
				String status=result.getString("status");
				String complaintID=result.getString("ComplainId");

				idnum1.add(ID);
				complaint2.add(complaint);
				complaintdate2.add(time);
				complaintID2.add(complaintID);
				complaintstatus2.add(status);

				}
            historyModel.setiD(idnum1);
			historyModel.setComplaint(complaint2);
			historyModel.setComplaintID(complaintID2);
			historyModel.setComplaintdate(complaintdate2);
			historyModel.setComplaintstatus(complaintstatus2);

		}catch(SQLException e) {
			System.err.println("SQL Exception"+e.getMessage());
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
	}

}
