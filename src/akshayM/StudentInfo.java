package akshayM;

public class StudentInfo {
	String name = "Akshay";
	String middleName = "Arun";
	String surname = "Malshetwar";
	String birthdate = "7th June 1995";
	String address = "Ram Nagar, Chikhli";
	int rollNumber = 87;
	
	void studentName() {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails() {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}
