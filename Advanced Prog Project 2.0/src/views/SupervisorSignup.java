package views;



import javax.swing.JFrame;
import javax.swing.JTextField;

import org.w3c.dom.ls.LSOutput;

import controller.Processes;
import models.Employees;
import models.Student;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SupervisorSignup implements ActionListener{

	private JFrame frame;
	private JTextField firstnametextfield;
	private JTextField lastnametextfield;
	private JTextField contacttextfield;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField IDtextfield;
	private JTextField emailtextfield;
	Processes ps= new Processes();
	Employees employee=new Employees();
	


	public SupervisorSignup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 659, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		//textfields
		firstnametextfield = new JTextField();
		firstnametextfield.setText("");
		firstnametextfield.setBounds(282, 25, 237, 33);
		frame.getContentPane().add(firstnametextfield);
		firstnametextfield.setColumns(10);
		
		lastnametextfield = new JTextField();
		lastnametextfield.setText("");
		lastnametextfield.setColumns(10);
		lastnametextfield.setBounds(282, 81, 237, 33);
		frame.getContentPane().add(lastnametextfield);
		
		contacttextfield = new JTextField();
		contacttextfield.setText("");
		contacttextfield.setColumns(10);
		contacttextfield.setBounds(282, 140, 237, 33);
		frame.getContentPane().add(contacttextfield);
		
		
		IDtextfield = new JTextField();
		IDtextfield.setText("");
		IDtextfield.setColumns(10);
		IDtextfield.setBounds(282, 209, 237, 33);
		frame.getContentPane().add(IDtextfield);
		
		emailtextfield = new JTextField();
		emailtextfield.setText("");
		emailtextfield.setColumns(10);
		emailtextfield.setBounds(282, 271, 237, 33);
		frame.getContentPane().add(emailtextfield);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(282, 337, 237, 33);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(282, 401, 237, 33);
		frame.getContentPane().add(passwordField_1);
		
		
		
		//Jlabels
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(84, 25, 145, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setBounds(84, 81, 145, 33);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContactNumber.setBounds(84, 140, 145, 33);
		frame.getContentPane().add(lblContactNumber);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(84, 337, 145, 33);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password");
		lblReenterPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblReenterPassword.setBounds(84, 401, 171, 33);
		frame.getContentPane().add(lblReenterPassword);
		
		JLabel lblIdNumber = new JLabel("ID Number");
		lblIdNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdNumber.setBounds(84, 206, 145, 33);
		frame.getContentPane().add(lblIdNumber);
		
		JLabel lblEmailAdress = new JLabel("Email Adress");
		lblEmailAdress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmailAdress.setBounds(84, 271, 145, 33);
		frame.getContentPane().add(lblEmailAdress);

		
		//JButtons
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubmit.setBounds(361, 479, 135, 41);
		frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				

				
				 
				String fname=firstnametextfield.getText();
				String lname=lastnametextfield.getText();
				String number=contacttextfield.getText();
				String idstring=IDtextfield.getText();
				String email=emailtextfield.getText();
				String password=String.valueOf(passwordField.getPassword());
				String repassword=String.valueOf(passwordField_1.getPassword());
				

				employee.setStaffID(idstring);
				employee.setFirstName(fname);
				employee.setLastName(lname);
				employee.setEmail(email);
				employee.setPhone(number);
				employee.setPassword(password);
				employee.setRepassword(repassword);


				if(password.equals(repassword) &&password.equals("")==false) {
					ps.admincreateaccount(employee);
					new SupervisorLogin();
					frame.dispose();
				    		
				//}else if (idstring.equals(e)==false || password.equals("")) {
					//JOptionPane.showMessageDialog(null,"No ID or password entered","Sign Up error",JOptionPane.ERROR_MESSAGE);
					
				}else{
					JOptionPane.showMessageDialog(null,"Your passwords do not match","Sign Up error",JOptionPane.ERROR_MESSAGE);
				}


		
	}
			});
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(96, 479, 135, 41);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				new Login();
				frame.dispose();
				
		
	}
			});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
