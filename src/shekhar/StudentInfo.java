package shekhar;

public class StudentInfo {
	void studentName(String fn,String mn,String ln) {
		System.out.println("Student name is:"+fn+ " "+mn+" "+ln);	
	}
	
	void studentOtherDetails(String dob,String address,int rollNo) {
		System.out.println("Student Date of birth is:"+dob);
		System.out.println("Student address is: " +address);
		System.out.println("Student roll no is:"+rollNo);
	}

	public static void main(String[] args) {
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Shikha", "Amit", "Patel");
		studentinfo.studentOtherDetails("10th Aug 1998","G-809, Heaven Apartment, Baner, Pune.",34);
	}

}
