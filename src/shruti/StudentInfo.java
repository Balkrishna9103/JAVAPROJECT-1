package shruti;

public class StudentInfo {
	void studentName(String name,String middle ,String surName) {
		System.out.println("Name " + name + " Middle " + middle + " Surname " + surName);
	}	
	
	void studentOtherDetails(String birthDate , String address ,int rollNo) {
		System.out.println("Birthdate " + birthDate + " Address " + address + "Rollno " + rollNo);
	}
	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shikha" , "Amit" , "Patel");
		studentInfo.studentOtherDetails("10 Aug 1998", " G-809, Heaven Apartment, Baner, Pune.", 34); 
		
		
	}
	

}
