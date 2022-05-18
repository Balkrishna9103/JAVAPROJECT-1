package pragati;

class StudentGrade{
	void studentPercentage(int score){
		if(score>=90 && score<=100)
		System.out.println("Student's score is "+ score +" and grade is A+");
		else if(score>=80 && score<90)
			System.out.println("Student's score is "+ score +" and grade is A");
		else if(score>=70 && score<80)
			System.out.println("Student's score is "+ score +" and grade is B+");
		else if(score>=60 && score<70)
			System.out.println("Student's score is "+ score +" and grade is B");
		else if(score>=50 && score<60)
			System.out.println("Student's score is "+ score +" and grade is C");
		else if(score<50)
			System.out.println("Student's score is "+score+ " Failed");
		else if(score<=0 || score>100)
			System.out.println("Invalid input");
		
	}
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.studentPercentage(0);
		studentGrade.studentPercentage(90);
		studentGrade.studentPercentage(85);
		studentGrade.studentPercentage(73);
		studentGrade.studentPercentage(62);
		studentGrade.studentPercentage(55);
		studentGrade.studentPercentage(40);
		studentGrade.studentPercentage(101);
	}
}