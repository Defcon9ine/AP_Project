package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import models.Student;

public class signincontroller {
	private static Connection connection;
	private static Statement stmt;
	private static ResultSet result;
	
	public signincontroller() {
		connection=DBConn.getDatabaseConnection();
	
	}
	public static void createaccount(Student student) { 
		String insertSQL="INSERT INTO projectdb.students(idNumber,FirstName,LastName,EmailAddress,password)"
				        +"VALUES('"+student.getID()+"','"+student.getFirstName()+"','"+student.getLastName()+"','"+student.getEmail()+"','"+student.getPassword()+"');";
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertSQL);
			if(inserted==1) {
				JOptionPane.showMessageDialog(null,"Congratulations your record has been added succesfully","Insertion Status",JOptionPane.INFORMATION_MESSAGE);
				return;
			}else {
				JOptionPane.showMessageDialog(null,"THe Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
			}	
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
