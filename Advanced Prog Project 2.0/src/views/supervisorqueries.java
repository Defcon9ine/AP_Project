package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import controller.Processes;
import models.Student;
import models.History;

import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class supervisorqueries extends JInternalFrame{
	private JTable table;
	ArrayList<String> idnum1 = new ArrayList<String>();
	ArrayList<String> complaint2 = new ArrayList<String>();
	ArrayList<String> complaintdate2 = new ArrayList<String>();
	ArrayList<String> complaintID2 = new ArrayList<String>();
	ArrayList<String> complaintstatus2 = new ArrayList<String>();
	
	ArrayList<String> advisorId1 = new ArrayList<String>();
	ArrayList<String> fName3 = new ArrayList<String>();
	ArrayList<String> lName3 = new ArrayList<String>();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	Processes processes=new Processes();
	

	public supervisorqueries() {
		super("Assign Advisor",true,true,true,true);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setSize(978, 564);	
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select an Advisor to assign:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(73, 62, 262, 36);
		getContentPane().add(lblNewLabel);
		
		Processes procescombo = new Processes();
		procescombo.getAllAdvisor();
		advisorId1=procescombo.getAdvisors().getAdvisorId();
		fName3=procescombo.getAdvisors().getfName();
		lName3=procescombo.getAdvisors().getlName();
		int adSize=procescombo.getAdvisors().getAdvisorId().size();
		ArrayList<String> allAdvisors = new ArrayList<String>();
		String[] aaAdvisor;
		for (int n = 1; n < adSize; n++) {
		       String info1 =advisorId1.get(n);
		       String info2 = fName3.get(n);
		       String info3 =lName3.get(n);
		      
		     
		       
		      allAdvisors.add(""+info2+" "+info3+""+" "+info1+"");
		      
		}
		aaAdvisor = allAdvisors.toArray(new String[0]);
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(aaAdvisor);
		JComboBox<String> comboBox= new JComboBox<>(model);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(333, 64, 279, 33);
		getContentPane().add(comboBox);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 0, 0);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(0, 0, 0, 0);
		
		JLabel label_3 = new JLabel("");
		label_2.setBounds(0, 0, 0, 0);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 0, 0);
		
		Processes history=new Processes();
		
		Processes.SupervisorView();
		int arraySize=Processes.getHistoryModel().getComplaint().size();
		idnum1=Processes.getHistoryModel().getiD();
		complaint2=Processes.getHistoryModel().getComplaint();
		complaintdate2=Processes.getHistoryModel().getComplaintdate();
		complaintID2=Processes.getHistoryModel().getComplaintID();
		complaintstatus2=Processes.getHistoryModel().getComplaintstatus();
		
		
		Object[][] rowData = {};
	    Object[] columnNames = { "ID#", "ComplaintID","Compaint", "Status","Date" };

	    DefaultTableModel listTableModel;
	    listTableModel = new DefaultTableModel(rowData, columnNames);
	    for (int n = 1; n < arraySize; n++) {
	       String data1 =idnum1.get(n);
	       String data3 = complaint2.get(n);
	       String data2 =complaintID2.get(n);
	       String data4 = complaintstatus2.get(n);
	       String data5 =complaintdate2.get(n);
	     
	       
	      listTableModel.addRow(new Object[] {data1,data2,data3,data4,data5});
	    }
	    getContentPane().setLayout(null);
	    getContentPane().add(lblNewLabel);
	    getContentPane().add(label_1);
	    getContentPane().add(label_2);
	    getContentPane().add(label_3);
	    getContentPane().add(label);
	    
	    JScrollPane scrollPane_1 = new JScrollPane();
	    scrollPane_1.setBounds(0, 108, 966, 207);
	    getContentPane().add(scrollPane_1);
	    
	    
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane_1.setViewportView(scrollPane);
	    
	    	    
	    
	    textField = new JTextField();
	    textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    textField.setBounds(23, 385, 137, 30);
	    getContentPane().add(textField);
	    textField.setColumns(10);
	    textField.setText("");
		
		
	    		
	    	    table = new JTable();
	    	    table.addMouseListener(new MouseAdapter() {
	    	    	@Override
	    	    	public void mouseClicked(MouseEvent e) {
	    	    		String ID=table.getValueAt(table.getSelectedRow(),0).toString();
	    	    		String ComplaintID=table.getValueAt(table.getSelectedRow(),1).toString();
	    	    		String Complaint=table.getValueAt(table.getSelectedRow(),2).toString();
	    	    		
	    	    		
	    	    		textField.setText(ID);
	    	    		textField_1.setText(ComplaintID);
	    	    		textField_2.setText(Complaint);
	    	    	}
	    	    });
	    	    
	    	    table.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    scrollPane.setViewportView(table);
	    	    table.setModel(listTableModel);
	    	    //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    	    table.setCellEditor(null);   
	    	    //table.setBounds(37, 143, 397, 183);
	    	    table.setSize(978,495);
	    	    
	    	    JButton btnNewButton = new JButton("Assign");
	    	    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    	    btnNewButton.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				
	    				String studentId =textField.getText();
	    		        String complaintId=textField_1.getText();
	    				String staffChoosen=comboBox.getSelectedItem().toString();
	    				
	    				String[] smallArray=staffChoosen.split(" ");
	    				String staffId=smallArray[2];
	    				
	    				processes.AssignAdvisor(studentId, complaintId, staffId);
	    				supervisorqueries supervisorqueries = new supervisorqueries();
						//supervisorqueries.revalidate();
	    				supervisorqueries.repaint();
	    			}
	    		});
	    	    btnNewButton.setBounds(819, 342, 137, 33);
	    	    getContentPane().add(btnNewButton);
	    	    
	    	    JLabel lblNewLabel_1 = new JLabel("Student ID");
	    	    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    lblNewLabel_1.setBounds(50, 342, 80, 33);
	    	    getContentPane().add(lblNewLabel_1);
	    	    
	    	    textField_1 = new JTextField();
	    	    textField_1.setText("");
	    	    textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    textField_1.setColumns(10);
	    	    textField_1.setBounds(218, 385, 137, 30);
	    	    getContentPane().add(textField_1);
	    	    
	    	    JLabel lblNewLabel_1_1 = new JLabel("Complaint ID");
	    	    lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    lblNewLabel_1_1.setBounds(235, 342, 100, 33);
	    	    getContentPane().add(lblNewLabel_1_1);
	    	    
	    	    textField_2 = new JTextField();
	    	    textField_2.setText("");
	    	    textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    textField_2.setColumns(10);
	    	    textField_2.setBounds(411, 385, 372, 30);
	    	    getContentPane().add(textField_2);
	    	    
	    	    JLabel lblNewLabel_1_1_1 = new JLabel("Complaint ");
	    	    lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    lblNewLabel_1_1_1.setBounds(529, 344, 100, 33);
	    	    getContentPane().add(lblNewLabel_1_1_1);

		

		this.setVisible(true);
		this.setSize(978,495);
	}
}
