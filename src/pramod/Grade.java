/* Assignment - 3 : 11th April'2022

Program 1 : Write a program to print student's grade using if else ladder.

If score is between 90 to 100 (including 90 and 100) --> A+ grade
If score is between 80 to 90 (including 80) --> A grade
If score is between 70 to 80 (including 70) --> B+ grade
If score is between 60 to 70 (including 60) --> B grade
If score is between 50 to 60 (including 50) --> C grade
less than 50 --> Failed
Input less than 0 and more than 100 --> invalid input */
package pramod;
class Grade{

	void score(int num){
		
		if(num>=90 && num<=100)
			System.out.println("Grade of student for marks - " + num +" is A+");
		
		else if(num>=80 && num <90)
			System.out.println("Grade of student for marks - " + num +" is A");
		
		else if (num>=70 && num <80)
			System.out.println("Grade of student for marks - " + num +" is B+");
		
		else if (num>=60 && num <70)
			System.out.println("Grade of student for marks - " + num +" is B");
		
		else if (num >=50 && num < 60)
			System.out.println("Grade of student for marks - " + num +" is C");
		
		else if (num<0 || num>100)
			System.out.println("Please enter valid value for Marks as " + num + " is not accaptable value");
		
		else
			System.out.println("Student with marks - " +num +" is Failed");
	}
	
	public static void main(String[] args){
		Grade grade = new Grade();
		grade.score(85);
		grade.score(35);
		grade.score(55);
		grade.score(60);
		grade.score(50);
		grade.score(-101);
	}
}