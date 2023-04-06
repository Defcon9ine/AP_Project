package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import models.ResolveComplaint;

import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class advisorqueries extends JInternalFrame{
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
	ResolveComplaint resolveComplaint=new ResolveComplaint();
	

	public advisorqueries() {
		super("Assign Advisor",true,true,true,true);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setSize(978, 564);	
		this.getContentPane().setLayout(null);
		
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
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 0, 0);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(0, 0, 0, 0);
		
		JLabel label_3 = new JLabel("");
		label_2.setBounds(0, 0, 0, 0);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 0, 0);
		
		Processes history=new Processes();
		
		String advisorId=history.getEmployees().getStaffID();
		Processes.AdvisorView(advisorId);
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
	    getContentPane().add(label_1);
	    getContentPane().add(label_2);
	    getContentPane().add(label_3);
	    getContentPane().add(label);
	    
	    	    
	    
	    textField = new JTextField();
	    textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    textField.setBounds(0, 265, 137, 30);
	    getContentPane().add(textField);
	    textField.setColumns(10);
	    textField.setText("");
	    
	    JTextArea textArea = new JTextArea();
	    textArea.setBounds(139, 329, 670, 113);
	    getContentPane().add(textArea);
	    
	    	    
	    	    JButton btnNewButton = new JButton("Resolve");
	    	    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    	    btnNewButton.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				
	    				String studentId =textField.getText();
	    		        String complaintId=textField_1.getText();
	    		        String resolution=textArea.getText();
	    		        System.out.println(""+complaintId);
	    		        if (complaintId.equals("")) {
	    		        	JOptionPane.showMessageDialog(null,"You haven't selected student to respose to",
	    		        			"Resolved Status",JOptionPane.ERROR_MESSAGE);
	    		        }else if (resolution.equals("")) {
	    		        	JOptionPane.showMessageDialog(null,"You haven't enter a respose ",
	    		        			"Resolved Status",JOptionPane.ERROR_MESSAGE);
							
						}else {
							resolveComplaint.setAdvisorId(processes.getEmployees().getStaffID());
		    		        resolveComplaint.setStudentID(studentId);
		    		        resolveComplaint.setComplaintID(complaintId);
		    		        resolveComplaint.setResponses(resolution);
		    		        resolveComplaint.setComplaintStatus("RESOLVED");
						
							processes.ResolveComplain(resolveComplaint);
		    		        processes.GettingResolvedCompliant(resolveComplaint);
						}
	    		        
	    		       
	    		        	
	    			}
	    		});
	    	    btnNewButton.setBounds(819, 397, 137, 33);
	    	    getContentPane().add(btnNewButton);
	    	    
	    	    JLabel lblNewLabel_1 = new JLabel("Student ID");
	    	    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    lblNewLabel_1.setBounds(20, 237, 80, 33);
	    	    getContentPane().add(lblNewLabel_1);
	    	    
	    	    textField_1 = new JTextField();
	    	    textField_1.setText("");
	    	    textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    textField_1.setColumns(10);
	    	    textField_1.setBounds(177, 265, 137, 30);
	    	    getContentPane().add(textField_1);
	    	    
	    	    JLabel lblNewLabel_1_1 = new JLabel("Complaint ID");
	    	    lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    lblNewLabel_1_1.setBounds(177, 237, 100, 33);
	    	    getContentPane().add(lblNewLabel_1_1);
	    	    
	    	    textField_2 = new JTextField();
	    	    textField_2.setText("");
	    	    textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    textField_2.setColumns(10);
	    	    textField_2.setBounds(341, 265, 372, 30);
	    	    getContentPane().add(textField_2);
	    	    
	    	    JLabel lblNewLabel_1_1_1 = new JLabel("Complaint ");
	    	    lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    lblNewLabel_1_1_1.setBounds(341, 237, 100, 33);
	    	    getContentPane().add(lblNewLabel_1_1_1);
	    	    
	    	    
	    	    JScrollPane scrollPane = new JScrollPane();
	    	    scrollPane.setBounds(10, 10, 894, 216);
	    	    getContentPane().add(scrollPane);
	    	    
	    	    
	    		
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
	    	    
	    	    JScrollPane scrollPane_1 = new JScrollPane();
	    	    scrollPane.setRowHeaderView(scrollPane_1);
	    	    

	    	    
	    	    JLabel lblNewLabel_1_2 = new JLabel("Response:");
	    	    lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    	    lblNewLabel_1_2.setBounds(57, 323, 80, 33);
	    	    getContentPane().add(lblNewLabel_1_2);

		

		this.setVisible(true);
		this.setSize(978,495);
	}
}
