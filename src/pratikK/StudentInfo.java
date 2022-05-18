package pratikK;

public class StudentInfo {
	void studentName(String Name,String MiddleName,String Surname){
		System.out.println(Name);
		System.out.println(MiddleName);
		System.out.println(Surname);
	}
	void studentOtherDetails(String Birthdate,String Address,int RollNumber){
		System.out.println(Birthdate);
		System.out.println(Address);
		System.out.println(RollNumber);
	}
	public static void main (String[] args){
		StudentInfo studentinfo=new StudentInfo();
		studentinfo.studentName("Shikha","Amit","Patel");
		studentinfo.studentOtherDetails("10th Aug 1998","G-809, Heaven Apartment, Baner, Pune.",34);
	}		

}
