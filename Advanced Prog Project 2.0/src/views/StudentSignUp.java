package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class StudentSignUp extends JFrame implements ActionListener{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JTextField firstnametexField;	
private JTextField lastnametField;
private JTextField IDtJTextField;	
private JTextField phonetexField;	
private JTextField emailtexField;

private JPasswordField passwordtexField;
private JPasswordField reenterpasswordField;

private JLabel firstnameJLabel;
private JLabel lastnameJLabel;
private JLabel IDJLabel;
private JLabel phoneJLabel;
private JLabel emailJLabel;
private JLabel passwordJLabel;
private JLabel reenterpasswordJLabel;


private JPanel panel;

private JButton Submit;
private JButton Goback;
	
	
	
	
	
	public StudentSignUp()
	{
		initializeComponents();
		setLayoutComponents();
		addToPanel();

	}

	public void initializeComponents() {
		//panels
		 panel=new JPanel();
		
		//text fields
		firstnametexField=new JTextField();
		lastnametField=new JTextField();
		IDtJTextField=new JTextField();
		phonetexField=new JTextField();
		emailtexField=new JTextField();
		
		//password fields
		passwordtexField=new JPasswordField();
		reenterpasswordField=new JPasswordField();
		
		//labels
		firstnameJLabel=new JLabel("First Name");
		lastnameJLabel=new JLabel("Last Name");
		IDJLabel=new JLabel("ID:");
		phoneJLabel=new JLabel("Phone #:");
		emailJLabel=new JLabel("email");
		passwordJLabel=new JLabel("Password");
		reenterpasswordJLabel=new JLabel("Re-enter Password");
		
	    Submit=new JButton("Submit");

	    
	    
	    
	    
	    
	    Goback=new JButton("Go Back");
	    Goback.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    			new StudentLoginorSignUp();
    			dispose();
		
	}
    	 });
	
		
		
		
	}
	
	public void setLayoutComponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 573, 583);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(panel);
		this.setVisible(true);
		panel.setLayout(null);
		panel.setVisible(true);
		
		//layout for first name label and text field
		firstnameJLabel.setBounds(71, 165, 82, 13);
		firstnametexField.setBounds(194, 169, 139, 19);
		firstnametexField.setColumns(10);
		
		//layout for last name label and text field
		lastnameJLabel.setBounds(71, 205, 72, 13);
		lastnametField.setBounds(192, 238, 141, 19);
		lastnametField.setColumns(10);
		
		
		//layout for contact number label and text field
		phoneJLabel.setBounds(71, 241, 111, 13);
		phonetexField.setBounds(192, 202, 141, 19);
		phonetexField.setColumns(10);
		
		
		//Layout for password JLabel and password field
		passwordJLabel.setBounds(71, 283, 60, 13);
		passwordtexField.setBounds(192, 280, 139, 19);
		
		//Layout for re-enter password JLabel and password field
		reenterpasswordJLabel.setBounds(71, 316, 126, 13);
		reenterpasswordField.setBounds(194, 313, 139, 19);
		
		Submit.setBounds(100,350,180,20);
		Goback.setBounds(300,350,180,20);
		
		
		
	}
	public void addToPanel(){
		
		//Add labels to the second JPanel
		panel.add(firstnameJLabel);
		panel.add(lastnameJLabel);
	    panel.add(phoneJLabel);
	    panel.add(passwordJLabel);
	    panel.add(reenterpasswordJLabel);
	    panel.add(IDJLabel);

		

		
		//Add text fields to the second JPanel
	    panel.add(firstnametexField);
		panel.add(lastnametField);
		panel.add(phonetexField);
		panel.add(IDtJTextField);
				
		
		//Add password Text fields to the second JPanel
		panel.add(passwordtexField);
		panel.add(reenterpasswordField);
		
	    panel.add(Submit);
	    panel.add(Goback);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



	
}
