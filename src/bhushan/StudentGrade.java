package bhushan;

class StudentGrade{
	void percentage(int marks){
		if (marks>=90 && marks<=100){
			System.out.println( + marks + "% garde A+");
		}else if(marks>=80 && marks<90){
			System.out.println( + marks + "% garde A");
	    }else if(marks>=70 && marks<80){
			System.out.println( + marks + "% garde B+");
	    }else if(marks>=60 && marks<70){
			System.out.println( + marks + "% garde B");
	    }else if(marks>=50 && marks<60){
			System.out.println( + marks + "% garde C");
	    }else if(marks>=0 && marks<50){
			System.out.println( + marks + " Failed");
	    }else{
			System.out.println(+ marks+" Invalid Number");
	    }
	}
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.percentage(40);
		studentGrade.percentage(50);
		studentGrade.percentage(60);
		studentGrade.percentage(70);
		studentGrade.percentage(80);
		studentGrade.percentage(90);
		studentGrade.percentage(100);
		studentGrade.percentage(0);
		studentGrade.percentage(-12);
		studentGrade.percentage(102);
		
	}
}