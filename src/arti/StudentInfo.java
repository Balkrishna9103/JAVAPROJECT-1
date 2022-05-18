package arti;

public class StudentInfo {
	String name="Arti"; 
	String middleName="Ganesh";
	String surName="Shinde";
	String address="A203 WestOne Society, Wakad, Pune";
	String birthDate= "18th feb 1989";
	int rollNumber=25;
	
	 void studentName()
	 {
		 System.out.println(name);
		 System.out.println(middleName);
		 System.out.println(surName);
	 }
	 void studentOtherDetails()
	 {
		 System.out.println(birthDate);
		 System.out.println(address);
		 System.out.println(rollNumber);
	 }
	 
	 public static void main(String[] args)
	 {
		 StudentInfo studentInfo=new StudentInfo();
		 studentInfo.studentName();
		 studentInfo.studentOtherDetails();
	 }
}