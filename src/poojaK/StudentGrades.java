package poojaK;
class StudentGrades{
	int marks=101;
	void markSheet(int marks){
		if (marks >= 90 && marks <=100)
			System.out.println("Congratulation You got *A+* Grade");
		else if (marks >= 80 && marks < 90)
			System.out.println( "Congratulation You got *A* Grade");
		else if (marks >= 70 && marks <80)
			System.out.println("Congratulation You got *B+* Grade");
		else if (marks >= 60 && marks <70)
			System.out.println("Congratulation You got *B* Grade");
		else if (marks >= 50 && marks <60)
			System.out.println("Congratulation You got *C* Grade");
		else if (marks >=0 && marks <= 49)
			System.out.println("You are Failed");
		else if (marks <0 || marks > 100) 
			System.out.println("Invalid Input");
	}
	public static void main(String[] args)
	{	StudentGrades studentGrades = new StudentGrades();
		studentGrades.markSheet(97);
		studentGrades.markSheet(-97);
		studentGrades.markSheet(101);
		studentGrades.markSheet(11);
		studentGrades.markSheet(51);
		studentGrades.markSheet(65);
		studentGrades.markSheet(55);
		studentGrades.markSheet(77);
		studentGrades.markSheet(85);
	}
}