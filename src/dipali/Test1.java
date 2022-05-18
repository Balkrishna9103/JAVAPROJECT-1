package dipali;
class StdInfo {
	String Name="Komal";
	String middleName="Sandeep";
	String surname="Patil";
	String birthdate="9th nov 1992";
	String Address="D-203, Sai Apartment, chikhali, Pune.";
	int Rollno=15;
	
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
		StdInfo stdinfo =new StdInfo();
		stdinfo.studentName();
		stdinfo.studentOtherDetails();
		
	}
	
	
	

}


