package dnyaneshari;
class Result{

     int marks;
	 
	 public static void main(String[] args){
	            Result result=new Result();
				result.grade(81);
				result.grade(-45);
				result.grade(45);
				result.grade(75);
				result.grade(80);
				result.grade(63);
				result.grade(101);
				result.grade(89);
					
	 
	 }
     
	 void grade(int marks){
	      if(marks>=90 && marks<=100){
			   System.out.println("Student Scored "+marks+" with A+ grade");
		  }else if(marks>=80 && marks<90){
			  System.out.println("Student Scored " + marks+" with A grade");
		  }else if(marks>=70 && marks<80){
			  System.out.println("Student Scored " + marks+" with B+ grade");
		  }else if(marks>=60 && marks<70){
			  System.out.println("Student Scored " + marks+" with B grade");
		  }else if(marks>=50 && marks<60){
			  System.out.println("Student Scored " + marks+" with C grade");
		  }else if(marks<0 || marks>100){
			  System.out.println("Invalid input");
	      }else{ 
			 System.out.println("Result is fail");
		  }
		  
	  
	 } 
	 
	 
	 
}