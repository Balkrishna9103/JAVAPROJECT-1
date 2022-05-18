package ashish;

class Grade{
 
	void checkGrade(int score){
		if(score >=90 && score <=100)
			System.out.println("Your score is " + score + " and grade is: A+");
		else if(score >=80 && score <90)
			System.out.println("Your score is " + score + " and grade is: A");
		else if(score >=70 && score <80)
			System.out.println("Your score is " + score + " and grade is: B+");
		else if(score >=60 && score <70)
			System.out.println("Your score is " + score + " and grade is: B");
		else if(score >=50 && score <60)
			System.out.println("Your score is " + score + " and grade is: C");
		else if(score > 0 && score <50)
			System.out.println("Your score is " + score + " and grade is: Failed");
		else if(score < 0 || score > 100)
			System.out.println("Invalid input");		
	}
		
		public static void main(String[] args){
			Grade grade = new Grade();			
			grade.checkGrade(92);
			grade.checkGrade(85);
			grade.checkGrade(62);	
			grade.checkGrade(50);			
			grade.checkGrade(47);
			grade.checkGrade(120);
			grade.checkGrade(-5);
				
		}
}
