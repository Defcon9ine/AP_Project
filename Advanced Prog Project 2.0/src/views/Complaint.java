package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Complaint extends JFrame {

	private JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Complaint window = new Complaint();
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
	public Complaint() {
		initializeComponents();
		addComponentsToWindow();
		setWindowsProperties();
	}

	/**
	 * Initialize the contents of the frame.
	 */



public void initializeComponents() {
	textArea = new JTextArea();
}
public void addComponentsToWindow() {
	this.add(textArea);
}
public void setWindowsProperties() {
	this.setSize(300,300);
	this.setVisible(true);
}


}
