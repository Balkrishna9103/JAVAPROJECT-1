package prasad;

class StudentInfo{

	void studentName(String name, String middleName, String surname){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthdate, String address, int rollNumbber){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println("roll Number " + rollNumbber);
	}
	
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Prasad", "Prabhakar", "Mahale");
		studentInfo.studentOtherDetails("20th June 1988", "Flat 2 Saishradha Aprt, Ayodhya Nagar, Dhule", 111);
	}
}
