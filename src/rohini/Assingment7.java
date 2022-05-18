package rohini;

public class Assingment7 {
	
	String name, middle_name, sur_name, birthdate, address;
	int roll_no;
	
	void studentName(String name, String middle_name, String sur_name) {
		System.out.println("Name of the Student : "+ name+" "+middle_name+" "+sur_name);
	}
	
	void studentOtherDetails(String birthdate, String address, int roll_no){
		System.out.println("Additional Details of the Student: "+ birthdate+" "+address+" "+roll_no);
	}

	public static void main(String[] args) {
		
		Assingment7 ass = new Assingment7();
		
		ass.studentName("Rohini", "Bharat", "Birari");
		ass.studentOtherDetails("18-June", "Pune",101);
		
	}
}
