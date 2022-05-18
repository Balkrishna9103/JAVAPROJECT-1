package trupti;

public class StudentInfo {
	String name = "Shikha";
	String middleName = "Amit";
	String surName = "Patel";
	String birthdate = "10th Aug 1998";

	String address = "G-809, Heaven Apartment, Baner, Pune.";
	int rollNumber = 34;

	void studentName() {

		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
		System.out.println(birthdate);
	}

	void studentOtherDetails() {
		System.out.println(address);
		System.out.println(rollNumber);

	}

	public static void main(String[] args) {
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}

}
