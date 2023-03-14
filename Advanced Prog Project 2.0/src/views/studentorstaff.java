package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class studentorstaff {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentorstaff window = new studentorstaff();
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
	public studentorstaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 562, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnStudent = new JButton("Student ");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
				frame.dispose();
			}
		});
		btnStudent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnStudent.setBounds(65, 104, 186, 42);
		frame.getContentPane().add(btnStudent);
		
		JButton btnStaff = new JButton("Staff");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StaffSelect();
				frame.dispose();
			}
		});
		btnStaff.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnStaff.setBounds(312, 104, 186, 42);
		frame.getContentPane().add(btnStaff);
	}

}
