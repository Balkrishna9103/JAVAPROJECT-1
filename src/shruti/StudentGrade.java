package shruti;
public class StudentGrade {
	void evaluateGrade(int score){
		
		if(score >=90 && score <= 100)
			System.out.println("student get " +  "  A+ grade ");
		else if(score >=80 && score < 90)
			System.out.println("student get " +  "  A grade ");
		else if(score >=70 && score <80)
			System.out.println("student  get " +  "  B+ grade ");
		else if(score >=60 && score < 70)
			System.out.println("student  get " + "  B grade ");
		else if(score >=50 && score < 60)
			System.out.println("student  get " + "  C grade ");
		else if(score>=0 && score < 50)
			System.out.println("student is Failed. ");
		else if (score <0 || score>100)
			System.out.println("Invalid Input");
		
	}
	
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.evaluateGrade(96);
		studentGrade.evaluateGrade(83);
		studentGrade.evaluateGrade(76);
		studentGrade.evaluateGrade(49);
		studentGrade.evaluateGrade(35);
		studentGrade.evaluateGrade(65);
		studentGrade.evaluateGrade(-4);
		studentGrade.evaluateGrade(101);
		studentGrade.evaluateGrade(72);
		
		
		
		
	}


}


