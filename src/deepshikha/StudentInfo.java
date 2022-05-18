package deepshikha;

public class StudentInfo {
	void studentName(String name,String middleName,String surName) {
		System.out.println("Student first name is: "+ name + " and middle name is: " + middleName+" and last name is: "+ surName);
	}
	void studentOtherDetails(String birthDate, String address, int rollNumber) {
		System.out.println("Student birthday is: "+ birthDate +" and address is: "+ address+ "and roll number is: "+ rollNumber);
	}
public static void main(String[] args) {
	StudentInfo studentinfo= new StudentInfo();
	studentinfo.studentName("Deep","Shikha","Anurag");
	studentinfo.studentOtherDetails("25thoct1990","Shonest Tower wakad pune",63);
}

}
