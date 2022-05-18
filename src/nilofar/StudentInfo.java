package nilofar;

public class StudentInfo {
	void displayStudentName(String name,String middleName,String surName){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
	}
	
	void displayStudentDetails(String birthDate, String address, int rollNum){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNum);
	}
	public static void main (String[]args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.displayStudentName("Zoya","Imran","Shikalgar");
		studentInfo.displayStudentDetails("11th May 2011","Plot no.-4, Nigadi, Pune",18);
	}
}
	

