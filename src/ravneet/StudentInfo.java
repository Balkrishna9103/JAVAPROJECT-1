package ravneet;

public class StudentInfo {
	
	String name, middlename, surname, birthdate, address;
	int rollno;
	
	void  studentName(String studentname, String stu_middlename, String stu_surname) {
		name=studentname;
		middlename=stu_middlename;
		surname=stu_surname;
		System.out.println("Name of the Student : "+name+" "+middlename+" "+surname);
	}
	
	void  studentOtherDetails(String stu_birthdate, String stu_address, int stu_rollno) {
		birthdate=stu_birthdate;
		address=stu_address;
		rollno=stu_rollno;
		System.out.println("Birthdate of Student : "+birthdate);
		System.out.println("Address of Student : "+address);
		System.out.println("Rollno. of Student : "+rollno);
	}
	
	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Ravneet", "Kaur", "Basra");
		studentInfo.studentOtherDetails("18-11-1997", "#2840,Punjab,160062", 8);

	}

}
