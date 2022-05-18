package varsha;
class StudentInfo{

	void studentName(String name, String mname, String sname){
		System.out.println("First Name: "+name);
		System.out.println("Middle Name: "+mname);
		System.out.println("Last Name: "+sname);
	}
	void studentOtherDetails(String bday, String addr, int rollNo){
		System.out.println("Birth Date: "+bday);
		System.out.println("Address: "+addr);
		System.out.println("Roll No: "+rollNo);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shikha", "Amit", "Patel");
		studentInfo.studentOtherDetails("10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune.", 34);
	}
}