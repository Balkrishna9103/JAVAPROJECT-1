package ashish;

public class StudentInfo {

	void studentName(String name, String middleName, String surName) {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);

	}

	void studentOtherDetails(String birthDdate, String address, int rollNumber) {
		System.out.println(birthDdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}

	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Ashish", "Ram", "Pethe");
		studentInfo.studentOtherDetails("10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune.", 34);
	}

}
