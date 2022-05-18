package pramod;

public class Assignment7 {
	int rollNumber=121;
	String fName="Pramod";
	String mName="Suresh";
	String lName="Raut";
	String dOB="12th January 1992";
	String address="1213, Saibaba Mandir Rd, Shirdi, Ahmednagar";
	void studentName() {
		System.out.println(fName);
		System.out.println(mName);
		System.out.println(lName);
	}
	
	void studentOtherDetails( ){
		System.out.println(dOB);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.studentName();
		assignment7.studentOtherDetails();
	}
}
