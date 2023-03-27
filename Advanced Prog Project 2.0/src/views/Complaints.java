package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JTextArea;

import com.mysql.cj.x.protobuf.MysqlxExpr.Identifier;

import controller.Processes;
import models.Complaint;

import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Complaints extends JInternalFrame{

	
	private String selected;
	protected Complaint complaint=new Complaint();

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Complaints() {
		super("Queries & Complaints",true,true,true,true);
		initialize();
		this.toFront();
		this.setSize(930,709);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		
		this.setSize(954, 747);
		
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Queries");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(103, 55, 138, 32);
		this.getContentPane().add(lblNewLabel);
		
		JLabel lblComplaints = new JLabel("Complaints");
		lblComplaints.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComplaints.setBounds(522, 55, 138, 32);
		this.getContentPane().add(lblComplaints);
		
		JCheckBox chckbox0 = new JCheckBox("When is the Tuition Deadline?");
		chckbox0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox0.setBounds(83, 93, 269, 21);
		this.getContentPane().add(chckbox0);
		
		JCheckBox chckbox1 = new JCheckBox("What does each letter grade mean?");
		chckbox1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox1.setBounds(83, 126, 269, 21);
		this.getContentPane().add(chckbox1);
		
		JCheckBox chckbox2 = new JCheckBox("How many credits do I need to graduate? ");
		chckbox2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox2.setBounds(83, 160, 328, 21);
		this.getContentPane().add(chckbox2);
		
		JCheckBox chckbox3 = new JCheckBox("Where do i view my timetable? ");
		chckbox3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox3.setBounds(83, 194, 328, 21);
		this.getContentPane().add(chckbox3);
		
		JCheckBox chckbox4= new JCheckBox("Where is my link? ");
		chckbox4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox4.setBounds(83, 227, 328, 21);
		this.getContentPane().add(chckbox4);
		
		JCheckBox chckbox5= new JCheckBox("Class Link is not working");
		chckbox5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox5.setBounds(496, 93, 328, 21);
		this.getContentPane().add(chckbox5);
		
		JCheckBox chckbox6 = new JCheckBox("Cannot access the utech portal");
		chckbox6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox6.setBounds(496, 128, 328, 21);
		this.getContentPane().add(chckbox6);
		
		JCheckBox chckbox7 = new JCheckBox("Missing grades");
		chckbox7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox7.setBounds(496, 162, 328, 21);
		this.getContentPane().add(chckbox7);
		
		JCheckBox chckbox8 = new JCheckBox("Tuition has not been posted");
		chckbox8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox8.setBounds(496, 196, 328, 21);
		this.getContentPane().add(chckbox8);
		
		JCheckBox chckbox9 = new JCheckBox("Forgot my password");
		chckbox9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox9.setBounds(496, 229, 328, 21);
		this.getContentPane().add(chckbox9);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((chckbox0.isSelected())) {
		               selected= String.valueOf(chckbox0.getText());
		          }else if ((chckbox1.isSelected())) {
		               selected= String.valueOf(chckbox1.getText());
		          }else if ((chckbox2.isSelected())) {
		               selected= String.valueOf(chckbox2.getText());
		          }else if ((chckbox3.isSelected())) {
		               selected= String.valueOf(chckbox3.getText());
		          }else if ((chckbox4.isSelected())) {
		               selected= String.valueOf(chckbox4.getText());
		          }else if ((chckbox5.isSelected())) {
		               selected= String.valueOf(chckbox5.getText());
		          }else if ((chckbox6.isSelected())) {
		               selected= String.valueOf(chckbox6.getText());
		          }else if ((chckbox7.isSelected())) {
		               selected= String.valueOf(chckbox7.getText());
		          }else if ((chckbox8.isSelected())) {
		               selected= String.valueOf(chckbox8.getText());
		          }else if ((chckbox9.isSelected())) {
		               selected= String.valueOf(chckbox9.getText());
		          }
				  Processes process=new Processes();
		          Complaint complaint=new Complaint();
		          complaint.setComplaintDescription(String.valueOf(selected));
		          complaint.setComplaintStatus("Unresolved");
		          complaint.setStudentID(process.getStudent().getID());
		          process.logComplaint(complaint);
			}
		});
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		submitButton.setBounds(304, 431, 165, 38);
		this.getContentPane().add(submitButton);
		this.setVisible(true);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("My problem isnt listed here");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();
				textArea.setBounds(250, 400, 10, 2);
				
				textArea.setVisible(true);
				getContentPane().add(textArea);
				}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(270, 284, 248, 21);
		getContentPane().add(rdbtnNewRadioButton);
		
		          
		
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(chckbox0);
		buttonGroup.add(chckbox1);
		buttonGroup.add(chckbox2);
		buttonGroup.add(chckbox3);
		buttonGroup.add(chckbox4);
		buttonGroup.add(chckbox5);
		buttonGroup.add(chckbox6);
		buttonGroup.add(chckbox7);
		buttonGroup.add(chckbox8);
		buttonGroup.add(chckbox9);
		buttonGroup.add(rdbtnNewRadioButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(103, 311, 581, 82);
		getContentPane().add(textArea);
		
	
	
	}
}
