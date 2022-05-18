package amit;

public class StudentInfo {
	int rno=5;
	String name="Amit";
	String middlename="Singh";
	String surname="Rathor";
	String address="B3 502 sucasa wakad Pune";
	String birthdate="10th Sep 1988";
	
	void studentName() {
		
		System.out.println("Name: "+ name+ " "  + middlename+ " " + surname);
	}
	void studentOtherDetails() {
		System.out.println("Other details:" + address+ " " + rno);
	}
	
	public static void main(String[] args) {
		StudentInfo studentinfo=new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
		
	}
		
}
