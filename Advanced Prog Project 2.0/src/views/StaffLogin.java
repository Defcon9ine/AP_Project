package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class StaffLogin {

	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLogin window = new StaffLogin();
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
	public StaffLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(177, 67, 244, 32);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(141, 67, 26, 32);
		frame.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(177, 123, 244, 32);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPasword = new JLabel("Password");
		lblPasword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPasword.setBounds(83, 123, 84, 32);
		frame.getContentPane().add(lblPasword);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginbtn.setBounds(422, 187, 102, 32);
		frame.getContentPane().add(loginbtn);
		
		JLabel lblNewLabel_1 = new JLabel("New Staff member");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 269, 168, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton signUpbtn = new JButton("Sign Up");
		signUpbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signUpbtn.setBounds(141, 276, 108, 32);
		frame.getContentPane().add(signUpbtn);
	}
}
