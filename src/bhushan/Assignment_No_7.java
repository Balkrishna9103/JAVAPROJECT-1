package bhushan;

 class Assignment_No_7 {
	void studentName(String name,String middleName,String surname) {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthdate,String address,int rollNo) {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNo);
		
	}
  public static void main(String[] args) {
	  Assignment_No_7 assignment_No_7=new Assignment_No_7();
	  assignment_No_7.studentName("Shikha", "Amit", "Patel");
	  assignment_No_7.studentOtherDetails("10th Aug 1998","G-809,heaven Aparment,Baner,Pune",34);
  }
	
}

