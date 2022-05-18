package dnyaneshari;

public class StudentInfo {


	
	void studentName(String name,String middleName,	String surname) {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthDate,String address,int rollno){
		System.out.println(address);
		System.out.println(birthDate);
		System.out.println(rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.studentName("Dnyaneshwari","Ganesh","Panchal");
		studentInfo.studentOtherDetails("27th May 1994","G-809, Heaven Apartment, Baner, Pune.", 27);
	}

}


