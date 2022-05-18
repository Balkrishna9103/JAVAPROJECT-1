package divya;
class StudentGrade{

	void checkGrade(int score){
		
		if(score >=90 && score <= 100)
			System.out.println("The grade obtained on " + score + " is A+. ");
		else if(score >=80 && score <= 90)
			System.out.println("The grade obtained on " + score + " is A. ");
		else if(score >=70 && score <= 80)
			System.out.println("The grade obtained on " + score + " is B+. ");
		else if(score >=60 && score <= 70)
			System.out.println("The grade obtained on " + score + " is B. ");
		else if(score >=50 && score <= 60)
			System.out.println("The grade obtained on " + score + " is C. ");
		else if(score>=0 && score <= 50)
			System.out.println("The grade obtained on " + score + " is Failed. ");
		else if (score <0 || score>100)
			System.out.println("Invalid Input");
		
	}
	
	public static void main(String[] args){
		StudentGrade studentgrade = new StudentGrade();
		studentgrade.checkGrade(97);
		studentgrade.checkGrade(87);
		studentgrade.checkGrade(65);
		studentgrade.checkGrade(48);
		studentgrade.checkGrade(36);
		studentgrade.checkGrade(50);
		studentgrade.checkGrade(90);
		studentgrade.checkGrade(200);
		studentgrade.checkGrade(-10);
		
		
	}

}
	