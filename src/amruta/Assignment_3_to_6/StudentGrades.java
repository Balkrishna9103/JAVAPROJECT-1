/* Assignment - 3 : 11th April'2022
Program 1 : Write a program to print student's grade using if else ladder.
If score is between 90 to 100 (including 90 and 100) --> A+ grade
If score is between 80 to 90 (including 80) --> A grade
If score is between 70 to 80 (including 70) --> B+ grade
If score is between 60 to 70 (including 60) --> B grade
If score is between 50 to 60 (including 50) --> C grade
less than 50 --> Failed
Input less than 0 and more than 100 --> invalid input  */

package amruta.Assignment_3_to_6;

class StudentGrades{
	
	void studentsGradeInfo(int score){
		
		if(score > 0 || score == 0){
			if(score > 90 && score < 100)
				System.out.println("Student pass with A+ Grade...");
			else if(score > 80 && score < 90)
				System.out.println("Student pass with A Grade...");
			else if(score > 70 && score < 80)
				System.out.println("Student pass with B+ Grade...");
			else if(score > 60 && score < 70)
				System.out.println("Student pass with B Grade...");
			else if(score > 50 && score < 60)
				System.out.println("Student pass with C Grade...");
			else 
				System.out.println("Student Failed :( ... ");
			
		}else{
			System.out.println("...Invalid Input... ");
		}
	}
	
	public static void main(String[] args){
		StudentGrades studtendgrade = new StudentGrades();
		
		studtendgrade.studentsGradeInfo(95);
		System.out.println("");
		studtendgrade.studentsGradeInfo(88);
		System.out.println("");
		studtendgrade.studentsGradeInfo(73);
		System.out.println("");
		studtendgrade.studentsGradeInfo(66);
		System.out.println("");
		studtendgrade.studentsGradeInfo(58);
		System.out.println("");
		studtendgrade.studentsGradeInfo(41);
		System.out.println("");
		studtendgrade.studentsGradeInfo(-20);
	}
}