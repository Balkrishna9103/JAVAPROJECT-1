package prateekM;

class StudentGrade{
	
	void grade(int score){
		
		if(score>=90 && score<=100){
			System.out.println("Your Score is = "+score+". You are passed with A+ Grade" );
		}else if(score>=80 && score<90){
			System.out.println("Your Score is = "+score+". You are passed with A Grade");
		}else if(score>=70 && score<80){
			System.out.println("Your Score is = "+score+". You are passed with B+ Grade");
		}else if(score>=60 && score<70){
			System.out.println("Your Score is = "+score+". You are passed with B Grade");
		}else if(score>=50 && score<60){
			System.out.println("Your Score is = "+score+". You are passed with C Grade");
		}else if(score<50 && score>=0){
			System.out.println("Your Score is = "+score+". You are Failed");
		}else{
			System.out.println("Invalid Input");
		}
	}
		
	public static void main(String[] args){
		StudentGrade student = new StudentGrade();
		student.grade(91);
		student.grade(89);
		student.grade(77);
		student.grade(61);
		student.grade(50);
		student.grade(5);
		student.grade(-1);
		student.grade(101);
	}
}