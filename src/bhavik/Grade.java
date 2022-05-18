package bhavik;

class Grade{
	
	void displayGrade(int score){
		if (score >=90 && score <=100)
			System.out.println("For score " + score + " , grade is A+");
		else if (score >=80 && score <90)
			System.out.println("For score " + score + " , grade is A");
		else if (score >=70 && score <80)
			System.out.println("For score " + score + " , grade is B+");
		else if (score >=60 && score <70)
			System.out.println("For score " + score + " , grade is B");
		else if (score >=50 && score <60)
			System.out.println("For score " + score + " , grade is C");
		else if (score <50 && score >=0)
			System.out.println("For score " + score + " , grade is Failed");
		else if (score <0 || score >100)
			System.out.println("Invalid input " + score);
	}
	
	public static void main(String[] args){
		Grade grade = new Grade();
		grade.displayGrade(0);
		grade.displayGrade(50);
		grade.displayGrade(64);
		grade.displayGrade(77);
		grade.displayGrade(89);
		grade.displayGrade(92);
		grade.displayGrade(110);
		grade.displayGrade(-25);
	}
}