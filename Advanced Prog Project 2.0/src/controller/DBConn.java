package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBConn {
private static Connection connection=null;

public static Connection getDatabaseConnection() {
	if(connection==null) {
		String url="jdbc:mysql://localhost:3306/footwearsdb";
		try {
			connection=DriverManager.getConnection(url,"root","");
			JOptionPane.showMessageDialog(null, "A connection has been established","JBDC Connection Status",JOptionPane.INFORMATION_MESSAGE);
		}
		catch(SQLException e) {
			System.err.println("There has been an sql exception"+e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("There was another error"+e.getMessage());
		}
	}
	return connection;
}
}

