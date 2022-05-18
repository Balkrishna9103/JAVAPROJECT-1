package ravneet;

class StudentGrade {

	void studentMarks(int marks) {
		if (marks >= 90 && marks <= 100)
			System.out.println("You achieved A+ Grade");
		else if (marks > 79 && marks < 91)
			System.out.println("You achieved A Grade");
		else if (marks > 69 && marks < 81)
			System.out.println("You achieved B+ Grade");
		else if (marks > 59 && marks < 71)
			System.out.println("You achieved B Grade");
		else if (marks > 49 && marks < 61)
			System.out.println("You achieved C Grade");
		else if (marks > 0 && marks < 50)
			System.out.println("We regret to inform you that you are failed");
		else
			System.out.println("Value you entered is invalid");
	}

	public static void main(String args[]) {
		StudentGrade studentgrade = new StudentGrade();
		studentgrade.studentMarks(101);
	}
}