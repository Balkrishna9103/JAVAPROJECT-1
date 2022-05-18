//Assignment 07
package rakesh;

public class StudentInfo {

	void studentName(String name, String middleName, String surname) {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthDate, String address, int rollNumber) {
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println("Roll number = "+ rollNumber);
	}
	
	public static void main(String[] arg) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Rakesh", "Hari", "Borse");
		studentInfo.studentOtherDetails("16th Augst 1991", "F313, Aqua Marina, Ravet, Pune-412101", 333);
	}
}
