package madhuriR;
public class StudentInfo {
	
	void studentName(String name, String middleName, String surname)
	{
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetail(String birthdate,String address,int rollNumber) {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args) {
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Madhuri","Vishnu","Rajole");
		studentinfo.studentOtherDetail("2 dec 1998", "At Post Eklahare,\nNashik, 422105.", 15);	
	}
}
