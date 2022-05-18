//Assignment-3
package sanchit;

class StudentResult{
	
	void printStudentGrade(int score){
		if (score >=90 && score <= 100)
			System.out.println("Student's score = "+score+" And Student's grade = A+");
		else if (score >= 80 && score < 90)
			System.out.println("Student's score = "+score+" And Student's grade = A");
		else if (score >= 70 && score < 80)
			System.out.println("Student's score = "+score+" And Student's grade = B+");
		else if (score >= 60 && score < 70)
			System.out.println("Student's score = "+score+" And Student's grade = B");
		else if (score >= 50 && score < 60)
			System.out.println("Student's score = "+score+" And Student's grade = C");
		else if (score >= 0 && score < 50)
			System.out.println("Student's score = "+score+" And Student's grade = Failed");
		else if(score < 0 || score > 100)
			System.out.println("Invalid Input");
	}
	
	public static void main(String[] args){
		StudentResult studentResult = new StudentResult();
		studentResult.printStudentGrade(90);
		studentResult.printStudentGrade(100);
		studentResult.printStudentGrade(80);
		studentResult.printStudentGrade(89);
		studentResult.printStudentGrade(70);
		studentResult.printStudentGrade(79);
		studentResult.printStudentGrade(60);
		studentResult.printStudentGrade(69);
		studentResult.printStudentGrade(50);
		studentResult.printStudentGrade(59);
		studentResult.printStudentGrade(0);
		studentResult.printStudentGrade(49);
		studentResult.printStudentGrade(-1);
		studentResult.printStudentGrade(101);
	}
}