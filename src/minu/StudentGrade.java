package minu;

class StudentGrade {
	
	void gradeCheck(int marks)
	{
		if(marks >= 90 && marks <= 100) {
			System.out.println("Your marks is " + marks + " and grade is: A+"); 
		}
		else if(marks >= 80 && marks < 90){
			System.out.println("Your marks is " + marks + " and grade is: A");
		}
		else if(marks >= 70 && marks < 80){
			System.out.println("Your marks is " + marks + " and grade is: B+");
		}
		else if(marks >= 60 && marks < 70){
			System.out.println("Your marks is " + marks + " and grade is: B");
		}
		else if(marks >= 50 && marks < 60){
			System.out.println("Your marks is " + marks + " and grade is: C");
		}
		else if(marks >= 0 && marks < 50){
			System.out.println("Your marks is " + marks + " and you are Failed");
		}
		else if(marks < 0 || marks > 100)
			System.out.println("Invalid input");
	}
	
	public static void main(String[] args)
	{
		StudentGrade studentGrade=new StudentGrade();
		studentGrade.gradeCheck(105);
		studentGrade.gradeCheck(90);
		studentGrade.gradeCheck(85);
		studentGrade.gradeCheck(77);
		studentGrade.gradeCheck(68);
		studentGrade.gradeCheck(56);
		studentGrade.gradeCheck(45);
		studentGrade.gradeCheck(-9);
	}
}