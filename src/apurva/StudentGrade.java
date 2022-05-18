package apurva;

class StudentGrade {

	void displayResult(int score) {
		if (score <= 100 && score >= 90)
			System.out.println("Student scored " + score + "% with Grade A+");
		else if (score < 90 && score >= 80)
			System.out.println("Student scored " + score + "% with Grade A");
		else if (score < 80 && score >= 70)
			System.out.println("Student scored " + score + "% with Grade B+");
		else if (score < 70 && score >= 60)
			System.out.println("Student scored " + score + "% with Grade B ");
		else if (score < 60 && score >= 50)
			System.out.println("Student scored " + score + "% with Grade C ");
		else if (score < 50 && score > 0)
			System.out.println("Student failed with " + score + "%");
		else if (score <= 0 || score > 100)
			System.out.println("Invalid Input");
	}

	public static void main(String[] args) {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.displayResult(50);
		studentGrade.displayResult(98);
		studentGrade.displayResult(88);
		studentGrade.displayResult(20);
		studentGrade.displayResult(72);
		studentGrade.displayResult(67);
		studentGrade.displayResult(-1);
		studentGrade.displayResult(200);

	}
}