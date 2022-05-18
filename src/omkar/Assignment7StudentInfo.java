package omkar;

public class Assignment7StudentInfo {
	String name = "Omkar";
	String middleName = "Laxman";
	String surName = "Raut";
	String birthDate = "11 Aug 1990";
	String address = "Sus gaon, Pune";
	int rollNum=99;

	void studentName() {
		System.out.println(name );
		System.out.println(middleName );
		System.out.println(surName);
		System.out.println(birthDate );
	}

	void studentOtherDetails() {
		
		System.out.println(address );
		System.out.println(rollNum );
	}

	public static void main(String[] args) {
		Assignment7StudentInfo assignment7StudentInfo = new Assignment7StudentInfo();
		assignment7StudentInfo.studentName();
		assignment7StudentInfo.studentOtherDetails();
	}

}
