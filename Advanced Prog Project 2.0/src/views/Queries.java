package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class Queries {

	private JFrame frame;
	private String selected;
	protected Complaint complaint=new Complaint();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queries window = new Queries();
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
	public Queries() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(250, 100, 900, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		JCheckBox chckbox0 = new JCheckBox("Tution deadline");
		chckbox0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox0.setBounds(84, 150, 164, 21);
		frame.getContentPane().add(chckbox0);
		
		JCheckBox chckbox1 = new JCheckBox("What does each letter grade mean");
		chckbox1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox1.setBounds(84, 192, 259, 21);
		frame.getContentPane().add(chckbox1);
		
		JCheckBox chckbox2 = new JCheckBox("How many credits do I need to graduate");
		chckbox2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox2.setBounds(84, 234, 323, 21);
		frame.getContentPane().add(chckbox2);
		
		JCheckBox chckbox3 = new JCheckBox("Where do i view my timetable");
		chckbox3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox3.setBounds(84, 276, 277, 21);
		frame.getContentPane().add(chckbox3);
		
		JCheckBox chckbox4 = new JCheckBox("Where is my class link?");
		chckbox4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox4.setBounds(84, 322, 237, 21);
		frame.getContentPane().add(chckbox4);
		
		JCheckBox chckbox5 = new JCheckBox("Missing grade");
		chckbox5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox5.setBounds(523, 150, 164, 21);
		frame.getContentPane().add(chckbox5);
		
		JCheckBox chckbox6 = new JCheckBox("Tution deadline");
		chckbox6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox6.setBounds(523, 192, 164, 21);
		frame.getContentPane().add(chckbox6);
		
		JCheckBox chckbox7 = new JCheckBox("Tution deadline");
		chckbox7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox7.setBounds(523, 234, 164, 21);
		frame.getContentPane().add(chckbox7);
		
		JCheckBox chckbox8 = new JCheckBox("Tution deadline");
		chckbox8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox8.setBounds(523, 276, 164, 21);
		frame.getContentPane().add(chckbox8);
		
		JCheckBox chckbox9 = new JCheckBox("Tution deadline");
		chckbox9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbox9.setBounds(523, 322, 164, 21);
		frame.getContentPane().add(chckbox9);
		
		JLabel lblNewLabel = new JLabel("Queries");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(106, 60, 198, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblComplaints = new JLabel("Complaints");
		lblComplaints.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComplaints.setBounds(525, 60, 198, 42);
		frame.getContentPane().add(lblComplaints);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("My problem or query isnt listed here");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();
				textArea.setBounds(37, 32, 686, 223);
				textArea.setVisible(true);
				frame.getContentPane().add(textArea);
			}
		});
		rdbtnNewRadioButton.setBounds(37, 434, 237, 29);
		frame.getContentPane().add(rdbtnNewRadioButton);

		
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
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
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
		          }else if ((rdbtnNewRadioButton.isSelected())) {
		               selected= String.valueOf(rdbtnNewRadioButton.getText());
		          }
		          Processes process=new Processes();
		          Complaint complaint=new Complaint();
		          complaint.setComplaintDescription(String.valueOf(selected));
		          complaint.setComplaintStatus("Unresolved");
		          complaint.setStudentID(process.getStudent().getID());
		          process.logComplaint(complaint);
		          

			}
		});
		btnNewButton.setBounds(427, 422, 128, 37);
		frame.getContentPane().add(btnNewButton);
		


	}
}
