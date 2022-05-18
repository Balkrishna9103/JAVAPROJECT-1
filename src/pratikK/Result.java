package pratikK;
class Result{
	void printresult1 (int marks){ 
		if (marks >=90 && marks <=100){
			System.out.println("Student grade is A+");
		}else if(marks >=80 && marks <90){
			System.out.println("Student grade is A");
		}else if(marks >=70 && marks <80){
			System.out.println("Student grade is B+");
		} else if(marks >=60 && marks <70){
			System.out.println("Student grade is B");
		}  else if(marks >=50 && marks <60){
			System.out.println("Student grade is C");
		} else if(marks>=0 && marks <50){
			System.out.println("Student Failed"); 
		} else if(marks <0 || marks >100){
			System.out.println("Invalid input"); 
		}		
	} 
	public static void main (String[] args){
		Result result=new Result();
		result.printresult1(100);	
		result.printresult1(89); 
		result.printresult1(70);
		result.printresult1(60);
		result.printresult1(50);
		result.printresult1(49);
		result.printresult1(-1);
		result.printresult1(101);
	}

}