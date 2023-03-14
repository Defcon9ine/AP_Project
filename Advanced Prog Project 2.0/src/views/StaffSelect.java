package views;

import java.awt.EventQueue;

import javax.swing.JFrame;


import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffSelect {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSelect window = new StaffSelect();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StaffSelect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnStudentSupervisor = new JButton("Student Supervisor");
		btnStudentSupervisor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnStudentSupervisor.setBounds(41, 124, 186, 42);
		frame.getContentPane().add(btnStudentSupervisor);
		btnStudentSupervisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
				frame.dispose();
			}
		});
		
		JButton btnStudentAdvisor = new JButton("Student Advisor");
		btnStudentAdvisor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnStudentAdvisor.setBounds(301, 124, 186, 42);
		frame.getContentPane().add(btnStudentAdvisor);
		btnStudentAdvisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
				frame.dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new studentorstaff();
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(26, 257, 105, 34);
		frame.getContentPane().add(btnNewButton_1);
	}

}
