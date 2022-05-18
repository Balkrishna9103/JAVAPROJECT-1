package tusharD;

public class StudentGrade {
	
	void printGrade(int score){
		if (score<=100 && score>=90){
			System.out.println("Student's score is: "+score+ " and passed with grade A+");
		}else if(score<90 && score>=80){
			System.out.println("Student's score is: "+score+ " and passed with grade A");
		}else if(score<80 && score>=70){
			System.out.println("Student's score is: "+score+ " and passed with grade B+");
		}else if(score<70 && score>=60){
			System.out.println("Student's score is: "+score+ " and passed with grade B");
		}else if(score<60 && score>=50){
			System.out.println("Student's score is: "+score+ " and passed with grade C");
		}else if(score<50 && score>=0){
			System.out.println("Student's score is: "+score+ " and FAIL");
		}else if(score<0 || score>100){
			System.out.println(+score+" is Invalid Input");
			System.out.println("Please enter score between 0 to 100");
		}
	}
	
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.printGrade(81);
		studentGrade.printGrade(95);
		studentGrade.printGrade(100);
		studentGrade.printGrade(64);
		studentGrade.printGrade(72);
		studentGrade.printGrade(49);
		studentGrade.printGrade(34);
		studentGrade.printGrade(0);
	}
}
