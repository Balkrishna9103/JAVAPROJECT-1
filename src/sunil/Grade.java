package sunil;

class Grade {
	
	void gradeScore(int score){
	if(score >= 90&& score <= 100)
			System.out.println("Your percentage score "  + score +  " % (Excellent) and Grade is A+");
	else if(score >=80 && score < 90)
			System.out.println("Your percentage score "  + score +  " % (Very Good) and Grade is A");
	else if(score >=70 && score < 80)
			System.out.println("Your percentage score "  + score +  " % (Good) and Grade is B+");
	else if(score >=60 && score < 70)
			System.out.println("Your percentage score "  + score +  " % (Satisfactory) and Grade is B");
	else if(score >=50 && score < 60) 
			System.out.println("Your percentage score "  + score +  " % (Average) and Grade is C");
	else if(score >=0 && score < 50)
			System.out.println("Your percentage score "  + score +  " % (BelowAverage) and Grade is Failed");    
	else
			System.out.println("Invalid Input");
	}
	public static void main(String[] args)
	{
		Grade grade = new Grade();
		grade.gradeScore (94);
		grade.gradeScore (85);
		grade.gradeScore (76);
		grade.gradeScore (67);
		grade.gradeScore (58);
		grade.gradeScore (49);
		grade.gradeScore (0);
		grade.gradeScore (102);
		grade.gradeScore (-10);
	}
}