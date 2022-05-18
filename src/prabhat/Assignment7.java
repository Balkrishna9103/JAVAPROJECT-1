package prabhat; 
public class Assignment7 {

String name="Shikha", middleName="Amit", surName="Patel", birthDate="10th Aug 1998", address="G-809, Heaven Apartment, Baner, Pune 34";
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
		Assignment7 assignment7 = new Assignment7();
		assignment7.studentName();
		assignment7.studentOtherDetails();
	}
}