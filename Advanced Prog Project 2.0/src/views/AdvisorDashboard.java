package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import controller.Processes;


public class AdvisorDashboard {

	private JFrame frame;
	

	public AdvisorDashboard() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setResizable(false);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(219, 10, 1114, 709);
		frame.getContentPane().add(desktopPane);

		
		frame.setBounds(0, 0, 1357, 766);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setForeground(new Color(0, 128, 255));
		panel.setBounds(0, 0, 215, 769);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.setFont(new Font("Lucida Fax", Font.PLAIN, 19));
		btnNewButton.setBounds(0, 64, 205, 80);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new SupervisorLogin();
				frame.dispose();
				frame.dispose();
				
			}
		});
		btnNewButton_1.setBounds(0, 614, 205, 80);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Resolve Complaint ");
		btnNewButton_2.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				desktopPane.add(new advisorqueries());
				
			}
		});
		btnNewButton_2.setBounds(0, 190, 205, 80);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Live Chat");
		btnNewButton_3.setFont(new Font("Lucida Fax", Font.PLAIN, 19));
		btnNewButton_3.setBounds(0, 333, 205, 80);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("History");
		btnNewButton_4.setFont(new Font("Lucida Fax", Font.PLAIN, 19));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				desktopPane.add(new StaffHistory());
			}
			
		});
		
	
		
		btnNewButton_4.setBounds(0, 476, 205, 80);
		panel.add(btnNewButton_4);
		

	}

}
