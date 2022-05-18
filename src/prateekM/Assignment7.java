package prateekM;

public class Assignment7 {

//StudentInfo//	
	void studentName(String name ,String middlename ,String surname) {
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthdate ,String address ,int rollnumber) {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollnumber);
	}
	
	public static void main(String[] args) {
		
		Assignment7 studentinfo = new Assignment7();
		studentinfo.studentName("Prateek", "Kumar", "Maheshwari");
		studentinfo.studentOtherDetails("18th Dec 1992", "A5-701 Rohan Abhilasha society Pune", 101);
	}
}
