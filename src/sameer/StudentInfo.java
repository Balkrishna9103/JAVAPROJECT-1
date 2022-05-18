package sameer;

public class StudentInfo {

	String name;
	String mName;
	String sName;
	String birthDate ;
	String address ;
	int rollNo ;
	
	//Main method
	public static void main(String[] args)
	{
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
	
	//Method to display StudentName
	void studentName()
	{
		String name = "Shikha";
		System.out.println(name);
		
		String mName = "Amit";
		System.out.println(mName);
		
		String sName = "Patel";
		System.out.println(sName);	
	}

	//Method to display Students Other Details
	void studentOtherDetails()
	{
		String birthDate = "10th Aug 1998";
		System.out.println(birthDate);
		
		String address = "G-809, Heaven Apartment, Baner, Pune.";
		System.out.println(address);
		
		int rollNo = 34;
		System.out.println(rollNo);
		
	}
}
