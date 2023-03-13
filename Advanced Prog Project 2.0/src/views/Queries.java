package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class Queries {

	private JFrame frame;

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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tution deadline");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(84, 150, 164, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxWhatDoesEach = new JCheckBox("What does each letter grade mean");
		chckbxWhatDoesEach.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxWhatDoesEach.setBounds(84, 192, 259, 21);
		frame.getContentPane().add(chckbxWhatDoesEach);
		
		JCheckBox chckbxHowManyCredits = new JCheckBox("How many credits do I need to graduate");
		chckbxHowManyCredits.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxHowManyCredits.setBounds(84, 234, 323, 21);
		frame.getContentPane().add(chckbxHowManyCredits);
		
		JCheckBox chckbxWhereDoI = new JCheckBox("Where do i view my timetable");
		chckbxWhereDoI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxWhereDoI.setBounds(84, 276, 277, 21);
		frame.getContentPane().add(chckbxWhereDoI);
		
		JCheckBox chckbxWhereIsMy = new JCheckBox("Where is my class link?");
		chckbxWhereIsMy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxWhereIsMy.setBounds(84, 322, 237, 21);
		frame.getContentPane().add(chckbxWhereIsMy);
		
		JCheckBox chckbxMissingGrade = new JCheckBox("Missing grade");
		chckbxMissingGrade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxMissingGrade.setBounds(523, 150, 164, 21);
		frame.getContentPane().add(chckbxMissingGrade);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Tution deadline");
		chckbxNewCheckBox_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_6.setBounds(523, 192, 164, 21);
		frame.getContentPane().add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Tution deadline");
		chckbxNewCheckBox_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_7.setBounds(523, 234, 164, 21);
		frame.getContentPane().add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Tution deadline");
		chckbxNewCheckBox_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_8.setBounds(523, 276, 164, 21);
		frame.getContentPane().add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Tution deadline");
		chckbxNewCheckBox_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_9.setBounds(523, 322, 164, 21);
		frame.getContentPane().add(chckbxNewCheckBox_9);
		
		JLabel lblNewLabel = new JLabel("Queries");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(106, 60, 198, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblComplaints = new JLabel("Complaints");
		lblComplaints.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComplaints.setBounds(525, 60, 198, 42);
		frame.getContentPane().add(lblComplaints);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("My problem or query isnt liste here");
		rdbtnNewRadioButton.setBounds(37, 434, 211, 29);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uString=chckbxWhatDoesEach.getText();
				System.out.println(uString);
				
				String yString=chckbxNewCheckBox.getText();
				System.out.println(yString);
				
				String xString=chckbxWhereIsMy.getText();
				System.out.println(xString);
			}
		});
		btnNewButton.setBounds(427, 422, 128, 37);
		frame.getContentPane().add(btnNewButton);

	}
	
}
