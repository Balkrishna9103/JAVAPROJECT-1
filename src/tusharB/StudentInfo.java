package tusharB;

public class StudentInfo {

	void studentName(String name, String middlename,String surname ){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	void studentOtherDetails(String birthdate ,String address, int rollno){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
	}
	public static void main(String[] args)
	{
		StudentInfo studentinfo= new StudentInfo();
		studentinfo.studentName("Shikha","Amit","Patel");
		studentinfo.studentOtherDetails("10th Aug 1998" , "G-809, Heaven Apartment Baner, Pune" ,34);
	}
}
