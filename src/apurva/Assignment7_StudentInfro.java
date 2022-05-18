package apurva;

public class Assignment7_StudentInfro {

	String name = "Apurva";
	String middleName = "Anil";
	String surname = "Deshmukh";
	String birthdate = "25th Jan 1994";
	String address = "XYZ square";
	int rollNo = 7;

	void studentName() {
		System.out.println(name + "\n" + middleName + "\n" + surname);
	}

	void studentOtherDetails() {
		System.out.println(birthdate + "\n" + address + "\n" + rollNo);
	}

	public static void main(String[] args) {
		Assignment7_StudentInfro studentInfo = new Assignment7_StudentInfro();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}
