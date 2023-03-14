package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;


public class StudentLogin extends JFrame implements ActionListener{
	private JTextField iDField;
	private JLabel iDlJLabel;
	private JPasswordField passwordField;
	private JLabel passwordJLabel;
	private JPanel panel;
	private JButton submitButton;
	
	
	public StudentLogin() {
		initializeComponents();
		setLayoutComponenets();
		addToPanel();
		
	}
	public void initializeComponents() {
		iDlJLabel=new JLabel("ID:");
		iDField=new JTextField();
		
		passwordJLabel=new JLabel("Password:");
		passwordField=new JPasswordField();
		
		
		submitButton=new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
					new StudentDashboard();
					dispose();
			
		}
				});
		
		
		panel=new JPanel();
	}
	public void setLayoutComponenets() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 500, 400);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(panel);
		this.setVisible(true);
		panel.setLayout(null);
		panel.setVisible(true);
		
		
		iDlJLabel.setBounds(150,100,100,20);
		iDField.setBounds(220,100,100,20);
		passwordJLabel.setBounds(150,150,100,20);
		passwordField.setBounds(220,150,100,20);
		
		submitButton.setBounds(180,200,100,30);
	}
	public void addToPanel() {
		panel.add(iDlJLabel);
		panel.add(iDField);
		panel.add(passwordJLabel);
		panel.add(passwordField);
		panel.add(submitButton);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
	
}