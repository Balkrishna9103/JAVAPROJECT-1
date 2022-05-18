package poojaK;

public class StudentInfo {
		void studentName(String name, String middleName, String surName) {
			System.out.println(name);
			System.out.println(middleName);
			System.out.println(surName);
		}
		
		void studentOtherDetails(int date,String month,int year, String address, int rollNumber) {	
			System.out.println(date+"th "+month+" "+ year);
			System.out.println(address);
			System.out.println(rollNumber);
		}
		
		public static void main(String[] args) {
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.studentName("Shikha","Amit","Patel");
			studentInfo.studentOtherDetails(10, "Aug", 1998, "G-809,Heaven Apartment,Baner,Pune",34);
		}
}

