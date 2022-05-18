package minalS;

//Assignment: 7

public class StudentInfo {
	
	void studentName(String name,String middleName,String surname) {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthDate,String address,int rollNumber) {
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args) {
		StudentInfo studentInfo=new StudentInfo();
		
		studentInfo.studentName("Shivani","Amit","Shah");
		studentInfo.studentOtherDetails("1 july 1995","84 Popular Sciety, Nagpur", 21);
	}
}
