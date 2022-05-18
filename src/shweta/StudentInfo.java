package shweta;

class StudentInfo{
    String name="Shweta";
    String middleName="Ramdas";
    String surName="Sarap";
    String birthDate=("18th Feb 1996");
    String Address ="A-303,Crystal Park Apartment,Hadapsar,Pune ";
    int RollNumber=9;


  void studentName(){
	  System.out.println(name);
	  System.out.println(middleName);
	  System.out.println(surName);
  }

  void studentOtherDetails(){
	  
	  System.out.println(birthDate);
	  System.out.println(Address);
	  System.out.println(RollNumber);
  }


  public static void main(String[] args){
	StudentInfo studentInfo = new StudentInfo();
	studentInfo.studentName();
	studentInfo.studentOtherDetails();
  }

}
