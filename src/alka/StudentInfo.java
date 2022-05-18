package alka;

public class StudentInfo {
	String Name="Shikha";
	String middleName="Amit";
	String surname="Patel";
	String birthdate="10th Aug 1998";
	String Address="G-809, Heaven Apartment, Baner, Pune.";
	int Rollno=34;
	
	void studentName()
	{
		System.out.println(Name); 
		System.out.println(middleName);
		System.out.println(surname);
		
	}
	
	void studentOtherDetails()
	{
		System.out.println(birthdate); 
		System.out.println(Address);
		System.out.println(Rollno);
	}
	
	public static void main(String[] args)
	{
		StudentInfo studentinfo =new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
		
	}
	
	
	

}
