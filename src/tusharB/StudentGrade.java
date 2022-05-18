package tusharB;

class StudentGrade{
	
	void student(int grade){
		if(grade >= 90 && grade <= 100)
			System.out.println("Your percentage is " + grade +   " % and Grade is A+ ");
		else if(grade >=80 && grade <= 90)
			System.out.println("Your percentage is " + grade +   " % and Grade is A ");
		else if(grade >=70 && grade <= 80)
			System.out.println("Your percentage is " + grade +   " % and Grade is B+ ");
		else if(grade >=60 && grade <= 70)
			System.out.println("Your percentage is " + grade +   " % and Grade is B ");
		else if(grade >=50 && grade <= 60)
			System.out.println("Your percentage is " + grade +   " % and Grade is c ");
		else if(grade >=0 && grade <= 50)
			System.out.println("Your percentage is less than " + grade +   "% Failed ");
		else if(grade <= -1 || grade  >= 100)
			System.out.println("Invalid Input " + grade);
	}
	public static void main(String[] args){
		
		StudentGrade studentGrade=new StudentGrade();
		studentGrade.student(97);
		studentGrade.student(83);
		studentGrade.student(76);
		studentGrade.student(64);
		studentGrade.student(53);
		studentGrade.student(49);
		studentGrade.student(101);
		studentGrade.student(-1);
	}
}

/*Program 1 : Write a program to print student's grade using if else ladder.

If score is between 90 to 100 (including 90 and 100) --> A+ grade
If score is between 80 to 90 (including 80) --> A grade
If score is between 70 to 80 (including 70) --> B+ grade
If score is between 60 to 70 (including 60) --> B grade
If score is between 50 to 60 (including 50) --> C grade
less than 50 --> Failed
Input less than 0 and more than 100 --> invalid input*/