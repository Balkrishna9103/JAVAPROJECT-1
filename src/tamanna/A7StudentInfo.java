package tamanna;

public class A7StudentInfo {
	
	String name="Tamanna", middleName="Rupen", surName="Shah", birthDate="17th Jan 1993", address="Vadodara, Gujarat";
	int rollNo=2;
 
	void studentName() {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
	}
	
	void studentOtherDetails() {
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main(String[] args) {
		A7StudentInfo a7StudentInfo = new A7StudentInfo();
		a7StudentInfo.studentName();
		a7StudentInfo.studentOtherDetails();
	}
}
