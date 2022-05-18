package sachinP;
class StudentInfo{
	String name="Shikha";
	String middlename="Amit";
	String surname="Patel";
	//Date birthdate;
	String address="G-809, Heaven Apartment, Baner, Pune. 34"; 
	int rollNumber=101;
	
	void studentName(){
	
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		
		//System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);		
	}
	
	public static void main(String args[]){
		StudentInfo studentinfo=new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}