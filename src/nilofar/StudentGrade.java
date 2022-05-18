package nilofar;

class StudentGrade{
	
	void calculateGrade(int marks){
		if (marks>= 90 && marks <=100){
			System.out.println("Your total score is " + marks);
			System.out.println("Your grade is A");
			System.out.println("                                        ");
		}else if (marks>=75 && marks <90){
			System.out.println("Your total score is " + marks);
			System.out.println("Your grade is B");
			System.out.println("                                        ");
		}else if (marks>=40 && marks <75){
			System.out.println("Your total score is " + marks);
			System.out.println("Your grade is C");
			System.out.println("                                        ");
		}else if (marks>=0 && marks <40){
			System.out.println("Your total score is " + marks);
			System.out.println("You are failed in this exam, please try again");
			System.out.println("                                        ");
		}else{
			System.out.println("Invalid Input");
			System.out.println("                                        ");
		}
	}
		public static void main (String[]args){
		StudentGrade studentGrade = new StudentGrade ();
		studentGrade.calculateGrade(78);
		studentGrade.calculateGrade(50);
		studentGrade.calculateGrade(30);
		studentGrade.calculateGrade(94);
		studentGrade.calculateGrade(75);
		studentGrade.calculateGrade(90);
		studentGrade.calculateGrade(40);
		studentGrade.calculateGrade(0);
		studentGrade.calculateGrade(101);
		studentGrade.calculateGrade(-3);
	}
			
}