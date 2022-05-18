package akshayM;

//Assignment-3: Write a program to print student's grade using if else ladder.
class StudentGrades{
	void gradeSystem(int score){
		if(score>=90 && score<=100)
			System.out.println("You got A+ grade");
		else if(score>=80 && score<90)
			System.out.println("You got A grade");
		else if(score>=70 && score<80)
			System.out.println("You got B+ grade");
		else if(score>=60 && score<70)
			System.out.println("You got B grade");
		else if(score>=50 && score<60)
			System.out.println("You got C grade");
		else if(score>=0 && score<=49)
			System.out.println("Sorry you are failed");
		else
			System.out.println("Invalid Input");
	}
	public static void main(String[] args)
	{
		StudentGrades studentGrades = new StudentGrades();
		studentGrades.gradeSystem(95);
		studentGrades.gradeSystem(60);
		studentGrades.gradeSystem(50);
		studentGrades.gradeSystem(33);
		studentGrades.gradeSystem(-21);
	}
}