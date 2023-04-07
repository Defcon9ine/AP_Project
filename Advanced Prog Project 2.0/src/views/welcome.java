package views;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import controller.Processes;
import models.Employees;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;


public class welcome extends JInternalFrame {
Processes processes= new Processes();
String name;

	
	public welcome() {
		setBounds(0, 0, 1114, 709);
		setVisible(true);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		String name=processes.getEmployees().getFirstName()+" "+processes.getEmployees().getLastName();
		JLabel lblNewLabel = new JLabel("Welcome Home "+name);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		getContentPane().add(lblNewLabel);

	}
}
