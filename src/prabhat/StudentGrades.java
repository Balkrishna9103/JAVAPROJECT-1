package prabhat;
class StudentGrades{

	void markSheet(int marks){
		if (marks >= 90 && marks <=100)
			System.out.println("Congratulation You got Grade A+");
		else if (marks >= 80 && marks <90)
			System.out.println("Congratulation You got Grade A");
		else if (marks >= 70 && marks <80)
			System.out.println("Congratulation You got Grade B+");
		else if (marks >= 60 && marks <70)
			System.out.println("Congratulation You got Grade B");
		else if (marks >= 50 && marks <60)
				System.out.println("Congratulation You got Grade C");
		else if (marks >= 0 && marks <49)
				System.out.println("You are Failed");
		else if (marks <0 || marks > 100)
				System.out.println("Invalid Input");
	}
		
	public static void main(String[] args){
		StudentGrades studentGrades = new StudentGrades();
		
		studentGrades.markSheet(99);
		studentGrades.markSheet(111);
		studentGrades.markSheet(39);
		studentGrades.markSheet(51);
		studentGrades.markSheet(65);
		studentGrades.markSheet(75);
		studentGrades.markSheet(44);
		studentGrades.markSheet(85);
		}
	}
		
	
	
	
	

	
	
	