package balkrishna;

class StudentInfo{
	 
	 void StudentName(String Name,String Middlename,String Lastname){
		 System.out.println("Name ="+Name);
		 System.out.println("Middlename ="+Middlename);
		 System.out.println("Lastname ="+Lastname);
	 }
	void StudentOtherDetails(String Birthdate, String Address, int RollNumbber){
		System.out.println("Birthdate ="+Birthdate);
		System.out.println("Address ="+Address);
		System.out.println("Roll Number =" + RollNumbber);
	}
	public static void main(String[] args){
		StudentInfo StudentInfo = new StudentInfo();
		StudentInfo.StudentName("Balkrishna","Sukdev","Aware");
		StudentInfo.StudentOtherDetails("12th March 1992", "N-41 AF 2-23-8 SAIBABA NAGAR NASHIK 422009", 21);
	}
	
}	
