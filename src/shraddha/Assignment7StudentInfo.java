package shraddha;

class Assignment7StudentInfo 
{	
	String name = "Shikha";
	String middlename = "Amit";
	String surname = "Patel";
	String birthdate = "10th Aug 1998";
	String Address = "G-809, Heaven Apartment, Baner, Pune.";
	int rollnumber = 34;
	
	void studentName()
	{
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails()
	{
		System.out.println(birthdate);
		System.out.println(Address);
		System.out.println(rollnumber);
	}
	
	public static void main(String[] args)
	{
		Assignment7StudentInfo studentinfo = new Assignment7StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}