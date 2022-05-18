
package pragati;

class StudentInfo{
	String name= "Shikha";
	String middlename= "Amit";
	String surname= "Patel";
	void studentName(){
		System.out.println(name+" " +middlename+" " +surname );
	}
	void studentOtherDetails(){
		String birthdate= "10th Aug 1998";
		String address= "G-809 Heaven Apartment, Baner, Pune.";
		int rollnum= 34;
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollnum);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo= new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}