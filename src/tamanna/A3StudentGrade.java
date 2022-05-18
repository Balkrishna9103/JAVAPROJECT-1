package tamanna;

public class A3StudentGrade {
	
	void printGrade(int score){
		if(score>=90 && score<=100){
			System.out.println("Grade : A+");
		}else if(score>=80 && score<90){
			System.out.println("Grade : A");
		}else if(score>=70 && score<80){
			System.out.println("Grade : B+");
		}else if(score>=60 && score<70){
			System.out.println("Grade : B");
		}else if(score>=50 && score<60){
			System.out.println("Grade : C");
		}else if(score>=0 && score<60){
			System.out.println("Fail");
		}else{
			System.out.println("Invalid Input");
		}
	}
	
	public static void main(String[] args){
		A3StudentGrade a3StudentGrade=new A3StudentGrade();
		a3StudentGrade.printGrade(150);
		a3StudentGrade.printGrade(55);
		a3StudentGrade.printGrade(33);
		a3StudentGrade.printGrade(90);
		a3StudentGrade.printGrade(66);
	}
}
