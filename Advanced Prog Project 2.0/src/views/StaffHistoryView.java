package views;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.Processes;
import models.Employees;


public class StaffHistory extends JInternalFrame{
	private JFrame frame;
	Employees employees = new Employees();
	private JTable table;
	ArrayList<String> staffId = new ArrayList<String>();
	ArrayList<String> studentid = new ArrayList<String>();
	ArrayList<String> complaint = new ArrayList<String>();
	ArrayList<String> reponse = new ArrayList<String>();
	ArrayList<String> complaintdate = new ArrayList<String>();
	ArrayList<String> reponseDate = new ArrayList<String>();
	ArrayList<String> complaintID = new ArrayList<String>();
	ArrayList<String> complaintstatus = new ArrayList<String>();
	
	String advisorId;
	public StaffHistory() {
		
		///super("History",true,true,true,true);
		getContentPane().setLayout(null);
		initialize();
		this.setSize(930,709);
		
		JLabel lblNewLabel = new JLabel("History");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(426, 11, 147, 63);
		this.getContentPane().add(lblNewLabel, BorderLayout.EAST);
		

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 71, 913, 383);
		getContentPane().add(scrollPane);
		Processes historyprocesser=new Processes();
		
		advisorId =historyprocesser.getEmployees().getStaffID();
		historyprocesser.Advisorhistory(advisorId);
		int arraySize=historyprocesser.getStaffHistory().getComplaintID().size();
		
		studentid=historyprocesser.getStaffHistory().getStudentid();
		complaintID=historyprocesser.getStaffHistory().getComplaintID();
		complaint=historyprocesser.getStaffHistory().getComplaint();
		complaintstatus=historyprocesser.getStaffHistory().getComplaintstatus();
		
		reponse=historyprocesser.getStaffHistory().getReponse();
		complaintdate=historyprocesser.getStaffHistory().getComplaintdate();
		reponseDate=historyprocesser.getStaffHistory().getReponseDate();
		
		
		Object[][] rowData = {};
	    Object[] columnNames = { "Student ID#","Complaint ID#", "Complaint","Resolution", "Status","Complaint Date", "Response date" };

	    DefaultTableModel listTableModel;
	    listTableModel = new DefaultTableModel(rowData, columnNames);
	    for (int n = 1; n < arraySize; n++) {
	       String data1 = studentid.get(n);
	       String data2 =complaintID.get(n);
	       String data3 = complaint.get(n);
	       String data4 =reponse.get(n);
	     
	       String data5 =complaintstatus.get(n);
	       String data6 = complaintdate.get(n);
	       String data7 =reponseDate.get(n);
	       
	      listTableModel.addRow(new Object[] {data1,data2,data3,data4,data5,data6,data7});
	    }

	    
		
	    table = new JTable();
	    
	    table.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    scrollPane.setViewportView(table);
	    table.setModel(listTableModel);
	  //  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    table.setCellEditor(null);
	    
	    //table.setBounds(37, 143, 397, 183);
		
	   
		
		//this.add(table);
		this.setVisible(true);
		this.setSize(978,495);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		new Processes();
		
		Processes.Advisorhistory(advisorId);

	}

}
