package controller;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import models.Advisors;
import models.Complaint;
import models.Employees;
import models.Student;
import models.History;
import models.ResolveComplaint;
import models.StaffHistory;


public class Processes {
	private static Connection connection;
	private static Statement stmt;
	private static ResultSet result;
	static Student student=new Student();
	Complaint complaint = new Complaint();	
	static Employees employees=new Employees();
	static History historyModel = new History();
	static Advisors advisors =  new Advisors();
	static ResolveComplaint resolveComplaint = new ResolveComplaint();
	static StaffHistory staffHistory = new StaffHistory();
	
	
	
	public static StaffHistory getStaffHistory() {
		return staffHistory;
	}
	public static void setStaffHistory(StaffHistory staffHistory) {
		Processes.staffHistory = staffHistory;
	}
	public static ResolveComplaint getResolveComplaint() {
		return resolveComplaint;
	}
	public static void setResolveComplaint(ResolveComplaint resolveComplaint) {
		Processes.resolveComplaint = resolveComplaint;
	}
	public static Advisors getAdvisors() {
		return advisors;
	}
	public static void setAdvisors(Advisors advisors) {
		Processes.advisors = advisors;
	}
	public static Employees getEmployees() {
		return employees;
	}
	public static void setEmployees(Employees employees) {
		Processes.employees = employees;
	}
	public static History getHistoryModel() {
		return historyModel;
	}
	public static void setHistoryModel(History historyModel) {
		Processes.historyModel = historyModel;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Processes() {
		connection=DBConn.getDatabaseConnection();
	
	}
	public static void createaccount(Student student) { 
		String insertSQL="INSERT INTO projectdb.students(IdNumber,FirstName,LastName,EmailAddress,password)"
				        +"VALUES('"+student.getID()+"','"+student.getFirstName()+"','"+student.getLastName()+"','"
				+student.getEmail()+"','"+student.getPassword()+"');";
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertSQL);
			if(inserted==1) {
				String insertContact="INSERT INTO projectdb.studentcontact(IdNumber,TelephoneNumber)"
				        +"VALUES('"+student.getID()+"','"+student.getPhone()+"');";
				try {
					stmt=connection.createStatement();
					int inserted1=stmt.executeUpdate(insertContact);
					if(inserted1==1) {
						JOptionPane.showMessageDialog(null,"Congratulations your record has been added succesfully",
								"Insertion Status",JOptionPane.INFORMATION_MESSAGE);
						return;
					}else {
						JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
					}	
				}catch(SQLException e) {
					JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
							"Error status",JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
			}	
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
					"Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	//staff
	public static void admincreateaccount(Employees employee) { 
		String Advisor="Advisor";
		String insertSQL="INSERT INTO projectdb.staff(IdNumber,FirstName,LastName,EmailAddress,category,password)"
				        +"VALUES('"+employee.getStaffID()+"','"+employee.getFirstName()+"','"+employee.getLastName()+"','"
				+employee.getEmail()+"','"+Advisor+"','"+employee.getPassword	()+"');";
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertSQL);
			if(inserted==1) {
				
				String insertContact="INSERT INTO projectdb.staffcontact(IdNumber,TelephoneNumber)"
				        +"VALUES('"+employee.getStaffID()+"','"+employee.getPhone()+"');";
				try {
					stmt=connection.createStatement();
					int inserted1=stmt.executeUpdate(insertContact);
					if(inserted1==1) {
						JOptionPane.showMessageDialog(null,"Congratulations your record has been added succesfully",
								"Insertion Status",JOptionPane.INFORMATION_MESSAGE);
						return;
					}else {
						JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
					}	
				}catch(SQLException e) {
					JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
							"Error status",JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
			}	
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
					"Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	//student
	public static Employees welcomeStudent(String ID) {
		String readSQL="SELECT *"
				      +" FROM projectdb.students"
				      +" WHERE idNumber ='"+ID+"';";
		try {
			stmt=connection.createStatement();	
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String first=result.getString("FirstName");
				String last=result.getString("LastName");
				student.setFirstName(first);
				student.setLastName(last);
			} 

			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		return null;
		
	}
	//student
	public static Student loginToAccount(String ID,String password) {
		String readSQL="SELECT *"
				      +" FROM projectdb.students"
				      +" WHERE idNumber ='"+ID+"';";
		try {
			stmt=connection.createStatement();	
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String Id=result.getString("idNumber");
				String passwordString=result.getString("password");
				student.setID(Id);
				student.setPassword(passwordString);
			} 

			welcomeStudent(student.getID());
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		return null;
		
	}
	//staff
	public static Employees welcome(String ID) {
		String readSQL="SELECT *"
				      +" FROM projectdb.staff"
				      +" WHERE idNumber ='"+ID+"';";
		try {
			stmt=connection.createStatement();	
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String first=result.getString("FirstName");
				String last=result.getString("LastName");
				employees.setFirstName(first);
				employees.setLastName(last);
			} 

			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		return null;
		
	}
	//staff
	public static Employees adminloginToAccount(String staffID,String password) {
		String readSQL="SELECT *"
				      +" FROM projectdb.staff"
				      +" WHERE IdNumber ='"+staffID+"';";
		try {
			stmt=connection.createStatement();	
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String Id=result.getString("IdNumber");
				String passwordString=result.getString("password");
				String category=result.getString("category");
				employees.setStaffID(Id);
				employees.setPassword(passwordString);
				employees.setCategory(category);
			} 
			welcome(employees.getStaffID());
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		return null;
		
	}
	
	public static void logComplaint(Complaint complaint) {
		String FALSE= "FALSE";
		String insertSQL="INSERT INTO projectdb.complain_has_student(StudentId,complain,status,assigned)"
		        +"VALUES('"+complaint.getStudentID()+"','"+complaint.getComplaintDescription()+"','"
				+complaint.getComplaintStatus()+"','"+FALSE+"');";
		
		
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertSQL);
			if(inserted==1) {
				JOptionPane.showMessageDialog(null,"Congratulations your record has been added succesfully",
						"Insertion Status",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"The Record was not inserted","Insertion Status",JOptionPane.ERROR_MESSAGE);
			}	
		}catch(SQLException e) {
			System.err.println("SQL Exception"+e.getMessage());
			JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
					"Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	public static void history(Student student) {
			ArrayList<String> idnum1 = new ArrayList<String>();
			ArrayList<String> complaint2 = new ArrayList<String>();
			ArrayList<String> complaintdate2 = new ArrayList<String>();
			ArrayList<String> complaintID2 = new ArrayList<String>();
			ArrayList<String> complaintstatus2 = new ArrayList<String>();

			String readSQL="SELECT *"
					      +" FROM projectdb.complain_has_student"
					      +" WHERE StudentId='"+student.getID()+"';";
			try {
				stmt=connection.createStatement();
				result=stmt.executeQuery(readSQL);
				while(result.next()) {
					String complaint=result.getString("complain");
					String time=result.getString("complainDate");
					String status=result.getString("status");
					String complaintID=result.getString("ComplainId");

					complaint2.add(complaint);
					complaintdate2.add(time);
					complaintID2.add(complaintID);
					complaintstatus2.add(status);

					}

				historyModel.setComplaint(complaint2);
				historyModel.setComplaintID(complaintID2);
				historyModel.setComplaintdate(complaintdate2);
				historyModel.setComplaintstatus(complaintstatus2);

			}catch(SQLException e) {
				System.err.println("SQL Exception"+e.getMessage());
				JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
			}
		}
	//supervisor
	public static void SupervisorView() {
		ArrayList<String> idnum1 = new ArrayList<String>();
		ArrayList<String> complaint2 = new ArrayList<String>();
		ArrayList<String> complaintdate2 = new ArrayList<String>();
		ArrayList<String> complaintID2 = new ArrayList<String>();
		ArrayList<String> complaintstatus2 = new ArrayList<String>();
		String noIdString= "FALSE";
		String readSQL="SELECT *"
				      +" FROM projectdb.complain_has_student"
				      +" WHERE assigned ='"+noIdString+"';";
		try {
			stmt=connection.createStatement();
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String complaint=result.getString("complain");
				String ID=result.getString("StudentId");
				String time=result.getString("complainDate");
				String status=result.getString("status");
				String complaintID=result.getString("ComplainId");

				idnum1.add(ID);
				complaint2.add(complaint);
				complaintdate2.add(time);
				complaintID2.add(complaintID);
				complaintstatus2.add(status);

				}
            historyModel.setiD(idnum1);
			historyModel.setComplaint(complaint2);
			historyModel.setComplaintID(complaintID2);
			historyModel.setComplaintdate(complaintdate2);
			historyModel.setComplaintstatus(complaintstatus2);

		}catch(SQLException e) {
			System.err.println("SQL Exception"+e.getMessage());
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
	}
	//supervisor
	public static void getAllAdvisor() {
		ArrayList<String> advisorId1 = new ArrayList<String>();
		ArrayList<String> fName3 = new ArrayList<String>();
		ArrayList<String> lName3 = new ArrayList<String>();
		ArrayList<String> email3 = new ArrayList<String>();
		ArrayList<String> category3 = new ArrayList<String>();
		ArrayList<String> contact3 = new ArrayList<String>();
		String Advisor="Advisor";
		String readSQL="SELECT *"
				      +" FROM projectdb.staff"
				      +" WHERE category='"+Advisor+"';";
		String tempfn1="";
		String templn1="";
		String tempem1="";
		String tempid1="";
		String tempcat1="";
		try {
			stmt=connection.createStatement();
			result=stmt.executeQuery(readSQL);
			
			while(result.next()) {
				String id=result.getString("IdNumber");
				String fn=result.getString("FirstName");
				String ln=result.getString("LastName");
				String em=result.getString("EmailAddress");
				String cat=result.getString("category");
				
				advisorId1.add(id);
				fName3.add(fn);
				lName3.add(ln);
				email3.add(em);
				category3.add(cat);

				}
            advisors.setAdvisorId(advisorId1);
			advisors.setfName(fName3);
			advisors.setlName(lName3);
			advisors.setEmail(email3);
			advisors.setCategory(category3);

		}catch(SQLException e) {
			
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
	}
	//Supervisor
	public void AssignAdvisor(String stuId, String comId, String staffId){
		String TRUE ="TRUE";
		String insertStaff = "UPDATE projectdb.complain_has_student"+" SET `StaffId` ='"
				+staffId+"',"+"`assigned` = '"+TRUE+"'"+" WHERE `StudentId`='"+stuId+"' AND `ComplainId`="+comId+";";
		
		
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertStaff);
			if(inserted==1) {
				JOptionPane.showMessageDialog(null,"Advisor has been assign to student","Assign Status",JOptionPane.INFORMATION_MESSAGE);
				
				
				return;
			}else {
				JOptionPane.showMessageDialog(null," Error Assigning Advisor ","Assign Status",JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}

	}
	
	//Advisor
	public static void AdvisorView(String advisorId) {
		ArrayList<String> idnum1 = new ArrayList<String>();
		ArrayList<String> complaint2 = new ArrayList<String>();
		ArrayList<String> complaintdate2 = new ArrayList<String>();
		ArrayList<String> complaintID2 = new ArrayList<String>();
		ArrayList<String> complaintstatus2 = new ArrayList<String>();

		String readSQL="SELECT *"
				      +" FROM projectdb.complain_has_student"
				      +" WHERE `StaffId`='"+advisorId+"';";
		try {
			stmt=connection.createStatement();
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String complaint=result.getString("complain");
				String ID=result.getString("StudentId");
				String time=result.getString("complainDate");
				String status=result.getString("status");
				String complaintID=result.getString("ComplainId");

				idnum1.add(ID);
				complaint2.add(complaint);
				complaintdate2.add(time);
				complaintID2.add(complaintID);
				complaintstatus2.add(status);

				}
            historyModel.setiD(idnum1);
			historyModel.setComplaint(complaint2);
			historyModel.setComplaintID(complaintID2);
			historyModel.setComplaintdate(complaintdate2);
			historyModel.setComplaintstatus(complaintstatus2);

		}catch(SQLException e) {
			System.err.println("SQL Exception"+e.getMessage());
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//Advisor
	public static void ResolveComplain(ResolveComplaint resolveComplaint){
		String insertStaff = "UPDATE projectdb.complain_has_student"+" SET `response` ='"
				+resolveComplaint.getResponses()+"',"+" `status` = '"+resolveComplaint.getComplaintStatus()+"' WHERE `StudentId`='"
				+resolveComplaint.getStudentID()+"' AND `StaffId`="+resolveComplaint.getAdvisorId()
				+" AND `ComplainId`="+resolveComplaint.getComplaintID()+";";
		
		
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertStaff);
			if(inserted==1) {
				JOptionPane.showMessageDialog(null,"Response Sucessful","Response Status",JOptionPane.INFORMATION_MESSAGE);
				
				
				return;
			}else {
				
				JOptionPane.showMessageDialog(null," Error Responsing ","Response Status",JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			System.err.println("SQL Exception"+e.getMessage());
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}

	}
	//Advisor
	public static void GettingResolvedCompliant(ResolveComplaint resolveComplaint) {
		String readSQL="SELECT *"
				      +" FROM projectdb.complain_has_student"
				      +" WHERE `StudentId`='"+resolveComplaint.getStudentID()
						+"' AND `StaffId`="+resolveComplaint.getAdvisorId()
						+" AND `ComplainId`="+resolveComplaint.getComplaintID()+";";
		try {
			stmt=connection.createStatement();	
			result=stmt.executeQuery(readSQL);
			while(result.next()) {
				String complaint=result.getString("complain");
				String stuId=result.getString("StudentId");
				String time=result.getString("complainDate");
				String status=result.getString("status");
				String complaintID=result.getString("ComplainId");
				String staffId=result.getString("StaffId");
				String response= result.getString("response");
				
				resolveComplaint.setAdvisorId(staffId);
				resolveComplaint.setStudentID(stuId);
				resolveComplaint.setComplaintID(complaintID);
				resolveComplaint.setCompaliant(complaint);
				resolveComplaint.setResponses(response);
				resolveComplaint.setComplaintStatus(status);
				resolveComplaint.setComplaintDate(time);
				
				
			} 
			 AddResolvedComplaintToHistory(resolveComplaint);
			
		}catch(SQLException e) {
			System.err.println("SQL Exception"+e.getMessage());
			JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	
	//Advisor
	public static void AddResolvedComplaintToHistory(ResolveComplaint resolveComplaint) { 
		String insertSQL="INSERT INTO projectdb.complainhistory(StudentId,AdvisorId,ComplainId,Complain,Response,ComplainDate,status)"
				        +"VALUES('"+resolveComplaint.getStudentID()+"','"+resolveComplaint.getAdvisorId()+"','"
				+resolveComplaint.getComplaintID()+"','"+resolveComplaint.getCompaliant()+"','"
				+resolveComplaint.getResponses()+"','"+resolveComplaint.getComplaintDate()+"','"
				+resolveComplaint.getComplaintStatus()+"');";
		
		
		try {
			stmt=connection.createStatement();
			int inserted=stmt.executeUpdate(insertSQL);
			if(inserted==1) {
				JOptionPane.showMessageDialog(null,"Compaliaint Resolved","Resolved Status",JOptionPane.INFORMATION_MESSAGE);
				RemoveComplaintFromHasComplain(resolveComplaint);
			}else {
				JOptionPane.showMessageDialog(null,"Failed to resolved","Resolved Status",JOptionPane.ERROR_MESSAGE);
			}	
		}catch(SQLException e) {
			System.err.println("SQL Exception"+e.getMessage());
			JOptionPane.showMessageDialog(null,"You encountered an SQL error the record was not inserted ",
					"Error status",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	//Advisor
	public static void RemoveComplaintFromHasComplain(ResolveComplaint resolveComplaint) {
		String deleteSQL= "DELETE FROM projectdb.complain_has_student "+
				 " WHERE `StudentId`='"+resolveComplaint.getStudentID()
					+"' AND `StaffId`="+resolveComplaint.getAdvisorId()
					+" AND `ComplainId`="+resolveComplaint.getComplaintID()+";";
		
		try {
			stmt=connection.createStatement();
			int delete=stmt.executeUpdate(deleteSQL);
			if(delete==1) {
				JOptionPane.showMessageDialog(null," Complaint Remove Sucessfully","Remove Complaint Status",JOptionPane.INFORMATION_MESSAGE);	
			}else {
				JOptionPane.showMessageDialog(null," Complaint Remove Unsucessfully","Remove Complaint Status",JOptionPane.ERROR_MESSAGE);	
			}
	}
		catch (SQLException e) {
			// TODO: handle exception 
			System.err.println("SQL Exception"+e.getMessage());
			JOptionPane.showMessageDialog(null," Invalid data entry","Insertion Status",JOptionPane.ERROR_MESSAGE);
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
			
			JOptionPane.showMessageDialog(null," Invalid data entry","Insertion Status",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//advisor
		public static void Advisorhistory(String advisorId) {

			ArrayList<String> staffId = new ArrayList<String>();
			ArrayList<String> studentid = new ArrayList<String>();
			ArrayList<String> complaint = new ArrayList<String>();
			ArrayList<String> reponse = new ArrayList<String>();
			ArrayList<String> complaintdate = new ArrayList<String>();
			ArrayList<String> reponseDate = new ArrayList<String>();
			ArrayList<String> complaintID = new ArrayList<String>();
			ArrayList<String> complaintstatus = new ArrayList<String>();

			String readSQL="SELECT *"
					      +" FROM projectdb.complainhistory"
					      +" WHERE AdvisorId='"+advisorId+"';";
			try {
				stmt=connection.createStatement();
				result=stmt.executeQuery(readSQL);
				while(result.next()) {
					String complain=result.getString("complain");
					String stuId=result.getString("StudentId");
					String time=result.getString("complainDate");
					String status=result.getString("status");
					String complaintID1=result.getString("ComplainId");
					String staffId1=result.getString("AdvisorId");
					String response= result.getString("Response");
					String rdate= result.getString("ResponseDate");
					
					staffId.add(staffId1);
					studentid.add(stuId);
					complaintID.add(complaintID1);
					complaint.add(complain);
					reponse.add(response);
					complaintdate.add(time);
					reponseDate.add(rdate);
					complaintstatus.add(status);

					}
	          staffHistory.setStaffId(staffId);
	          staffHistory.setStudentid(studentid);
	          staffHistory.setComplaintID(complaintID);
	          staffHistory.setComplaint(complaint);
	          
	          staffHistory.setReponse(reponse);
	          staffHistory.setComplaintdate(complaintdate);
	          staffHistory.setReponseDate(reponseDate);
	          staffHistory.setComplaintstatus(complaintstatus);

			}catch(SQLException e) {
				System.err.println("SQL Exception"+e.getMessage());
				JOptionPane.showMessageDialog(null,"You encountered an SQL error","Error status",JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"You encountered an error","Error status",JOptionPane.ERROR_MESSAGE);
			}
		}
	
}
