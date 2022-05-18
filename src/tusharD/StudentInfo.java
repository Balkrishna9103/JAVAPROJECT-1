package tusharD;

public class StudentInfo {
	
	void studentName(String name, String mname, String sname){
		System.out.println("First Name: "+name);
		System.out.println("Middle Name: "+mname);
		System.out.println("Last Name: "+sname);
	}
	void studentOtherDetails(String bday, String addr, int rollNo){
		System.out.println("Birth Date: "+bday);
		System.out.println("Address: "+addr);
		System.out.println("Roll No: "+rollNo);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Tushar", "Manohar", "Dudurkar");
		studentInfo.studentOtherDetails("15th July 1990", "Ecogram socity, Pune.", 34);
	}
}
