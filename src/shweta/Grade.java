package shweta;

class Grade{


  void checkGrade(int marks){

    if (marks >=90 && marks <=100)
	System.out.println("A+ GRADE SHOULD BE DISPLAYED");
	
	else if (marks >=80 && marks <90)
	System.out.println("A GRADE SHOULD BE DISPLAYED");
	
	else if (marks >=70 && marks <80)
	System.out.println("B+ GRADE SHOULD BE DISPLAYED");
	
	else if (marks >=60 && marks <70)
	System.out.println("B GRADE SHOULD BE DISPLAYED");
	
	else if (marks >=50 && marks <60)
	System.out.println("C GRADE SHOULD BE DISPLAYED");
	
	else if (marks >=0 &&marks <50 )
	System.out.println("FAILED STATUS SHOULD BE DISPLAYED");
	
	else if (marks < 0 || marks >100 )
	System.out.println("ENTERED INPUT IS INVALID");



	
  }
  public static void main (String[] args){
	  Grade grade= new Grade();
	  grade.checkGrade(65);
	  grade.checkGrade(95);
	  grade.checkGrade(75);
	  grade.checkGrade(05);
	  grade.checkGrade(20);
	  grade.checkGrade(99);
	  grade.checkGrade(100);
	  grade.checkGrade(0);
	  grade.checkGrade(110);
	  grade.checkGrade(-5);
	  grade.checkGrade(-25);
  }
}
	
