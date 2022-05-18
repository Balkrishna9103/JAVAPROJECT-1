package divya;

public class StudentInfo {
	
	void studentName(String name, String middlename, String surname) {

		System.out.println("Name = " + name + ", Middle-Name = " + middlename + ", Surname = " + surname);		
	}
	
	void studentOtherDetails(String birthdate, String address, int rollnumber) {
		
		 System.out.println("Birthdate = " + birthdate + ", Address = " + address + ", Rollnumber = " +  rollnumber);		
	}
		
	public static void main(String[] args) {
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Shikha ", "Amit ", "Patel " );
		studentinfo.studentOtherDetails("10th Aug 1998 ", "G-809, Heaven Apartment, Baner, Pune", 34);		
	}
}
