package controller;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


import models.Student;
import views.Login;
import views.StudentDashboard;

public class Processes {
	private static Connection connection;
	private static Statement stmt;
	private static ResultSet result;
	Student student=new Student();
	
	
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
	
	public Student loginToAccount(String ID,String password) {
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

}
