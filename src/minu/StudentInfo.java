package minu;

public class StudentInfo {
	
	String name = "Minu";
	String middleName = "Kumari";
	String surName = "Jha";
	String birthDate = "10th Aug 1998";
	String address = "G-809, Heaven Apartment, Baner, Pune";
	int rollNumber = 34;
	
	void studentName() {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
	}
	
	void studentOtherDetails() {
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}

	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}

}
