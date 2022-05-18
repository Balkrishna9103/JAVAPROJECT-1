package minalS;

//Assignment: 3
//WAP to print student's grade using if else ladder.

class StudentGrade{
	
	void getGrade(int score){
		
		if(score>=90 && score<=100){
			System.out.println("Total score is "+score+" and grade is A+");
		}else if(score<90 && score>=80){
			System.out.println("Total score is "+score+" and grade is A");
		}else if(score<80 && score>=70){
			System.out.println("Total score is "+score+" and grade is B+");
		}else if(score<70 && score>=60){
			System.out.println("Total score is "+score+" and grade is B");
		}else if(score<60 && score>=50){
			System.out.println("Total score is "+score+" and grade is C");
		}else if(score<50){
			System.out.println("Total score is "+score+" : Fail");
		}else if(score<0 || score>100){
			System.out.println("Invalid input");
		}
	}
	
	public static void main(String[] args){
		StudentGrade studentGrade=new StudentGrade();
		
		studentGrade.getGrade(67);
		studentGrade.getGrade(28);
		studentGrade.getGrade(0);
		studentGrade.getGrade(87);
		studentGrade.getGrade(55);
		studentGrade.getGrade(107);
	}
}