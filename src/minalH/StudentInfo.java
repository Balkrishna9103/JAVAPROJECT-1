package minalH;

public class StudentInfo {
	
	String name = "Minal";
	String middleName = "Bayaji";
	String surName = "Hake";
	String birthDate = "30th April 1991";
	String address = "8, Dreamland Apartment, Airport Road, Pune";
	int rollNum;
	
	void studentName() {
		System.out.println(name );
		System.out.println(middleName );
		System.out.println(surName);
	}
	
	void studentOtherDetails() {
		System.out.println(birthDate );
		System.out.println(address );
	}
	
	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}

}
