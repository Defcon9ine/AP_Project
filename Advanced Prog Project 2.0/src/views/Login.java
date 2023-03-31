package views;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.Processes;


import java.awt.Font;
import java.awt.event.*;
import java.util.HashMap;

public class Login implements ActionListener{

	private JFrame frame;
	private JTextField IDtextField;
	private JPasswordField passwordField;
	protected Processes processes= new Processes();
	

	public Login() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	 
	public void initialize() {

		
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		
		//textfields
		IDtextField = new JTextField();
		IDtextField.setBounds(170, 82, 244, 32);
		frame.getContentPane().add(IDtextField);
		IDtextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 156, 244, 32);
		frame.getContentPane().add(passwordField);
		
		
		//JLabels
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(134, 82, 26, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPasword = new JLabel("Password");
		lblPasword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPasword.setBounds(76, 156, 84, 32);
		frame.getContentPane().add(lblPasword);
		
		JLabel lblNewLabel_1 = new JLabel("I dont have an account");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(11, 277, 168, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		//JButtons
		JButton signUpbtn = new JButton("Sign Up");
		signUpbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signUpbtn.setBounds(175, 277, 108, 32);
		frame.getContentPane().add(signUpbtn);
		
		signUpbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new SignUp();
				frame.dispose();
				
			}
		});
		
		JButton loginbtn = new JButton("Login");
		loginbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginbtn.setBounds(420, 198, 102, 32);
		frame.getContentPane().add(loginbtn);
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String ID= IDtextField.getText();
			String password= String.valueOf(passwordField.getPassword());
			
			Processes processes=new Processes();
			processes.loginToAccount(ID, password);
			
			if(ID.equals(processes.getStudent().getID()) && password.equals(processes.getStudent().getPassword())) {
				
				new StudentDashboard();
				frame.dispose();
				
			}else if(ID.equals(processes.getStudent().getID())==false ||password.equals(processes.getStudent().getPassword())==false) {
				IDtextField.setText(null);
				passwordField.setText(null);
				JOptionPane.showMessageDialog(null,"Incorrect ID or password","Login Error",JOptionPane.ERROR_MESSAGE);
				
			}
	
				
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(11, 226, 102, 32);
		frame.getContentPane().add(btnBack);
		frame.setVisible(true);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
