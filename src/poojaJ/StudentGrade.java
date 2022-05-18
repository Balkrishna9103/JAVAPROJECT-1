// Program 1 : Write a program to print student's grade using if else ladder.
// If score is between 90 to 100 (including 90 and 100) --> A+ grade
// If score is between 80 to 90 (including 80) --> A grade
// If score is between 70 to 80 (including 70) --> B+ grade
// If score is between 60 to 70 (including 60) --> B grade
// If score is between 50 to 60 (including 50) --> C grade
// less than 50 --> Failed
// Input less than 0 and more than 100 --> invalid input
package poojaJ;

class StudentGrade{
	
	void getGrade(int score){
		if (score>=90 && score <=100)
			System.out.println("Student score is" +score+ "and received grade is : A+ grade");
		else if(score>=80 && score <90)
			System.out.println("Student score is" +score+ "and received grade is : A grade");
		else if (score >=70 && score<80)
			System.out.println("Student score is "+score+ "and received grade is : B+ grade");
		else if (score >=60 && score<70)
			System.out.println("Student score is "+score+ "and received grade is : B grade");
		else if (score >=50 && score<60)
			System.out.println("Student score is "+score+ "and received grade is : C grade");
		else if(score >0 && score<50)
			System.out.println("Failed");
		else
			System.out.println("invalid input");
	}
		
	public static void main (String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.getGrade(99);
		studentGrade.getGrade(85);
		studentGrade.getGrade(75);
		studentGrade.getGrade(60);
		studentGrade.getGrade(50);
		studentGrade.getGrade(0);
		studentGrade.getGrade(25);
		studentGrade.getGrade(-100);
		
		}
		
}