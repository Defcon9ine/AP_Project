package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.security.Signature;

public class StudentLoginorSignUp extends JFrame implements ActionListener {
private JButton loginButton;
private JButton signupButton;
private JPanel panel;
private JPanel panel2;
private JLabel label;


public StudentLoginorSignUp() {
	initializecomponents();
	setLayoutComponenets();
	addToPanel();
}

public void initializecomponents(){
	
	//buttons
	 loginButton=new JButton("Log In");
	 signupButton=new JButton("Sign Up");
	 
	 
	 //panels
	 panel=new JPanel();

	
	 
	 signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new StudentSignUp();	
				dispose();
			}
			 
			 
	 });
	 
	 
	 loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new StudentLogin();	
				dispose();
			}
			 
			 
	 });
	
	
}
public void setLayoutComponenets() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setBounds(100, 100, 500, 400);
	panel.setBorder(new EmptyBorder(5, 5, 5, 5));
	this.setContentPane(panel);
	this.setVisible(true);
	panel.setLayout(null);
	panel.setVisible(true);
	
	loginButton.setBounds(50,160,180,20);
	signupButton.setBounds(250,160,180,20);
	
	
}
public void addToPanel() {
	panel.add(loginButton);
	panel.add(signupButton);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
