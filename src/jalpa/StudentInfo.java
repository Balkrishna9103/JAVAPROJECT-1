package jalpa;

public class StudentInfo {

	
		void studentName (String name, String middleName , String surName  ) {
			System.out.println(name);
			System.out.println(middleName);
			System.out.println(surName);

		}
		void studentOtherDetails (String address , String birthDate , int rollNum) {
			System.out.println(address);
			System.out.println(birthDate);
			System.out.println(rollNum);
		}
		public static void main(String[] args) {
			StudentInfo studentinfo = new StudentInfo ();
			studentinfo.studentName("Shikha" , "Amit" , "Patel");
			studentinfo.studentOtherDetails("G-809, Heaven Apartment, Baner, Pune" , "10th Aug 1998", 34);
				
		}


}
