/*Assignment - 3 : 11th April'2022

Program 1 : Write a program to print student's grade using if else ladder.

If score is between 90 to 100 (including 90 and 100) --> A+ grade
If score is between 80 to 90 (including 80) --> A grade
If score is between 70 to 80 (including 70) --> B+ grade
If score is between 60 to 70 (including 60) --> B grade
If score is between 50 to 60 (including 50) --> C grade
less than 50 --> Failed
Input less than 0 and more than 100 --> invalid input*/

package omkar;

public class Assignment3_StudentGrade {
	
	void display(int percent) {
		if(percent>=90 && percent <=100) {
			System.out.println(percent +" A+ garade ");
		}else if (percent>=80 && percent<90) {
			System.out.println(percent +" A garade ");
		}else if (percent>=70 && percent<80) {
			System.out.println(percent +" B+ garade ");
		}else if (percent>=60 && percent<70) {
			System.out.println(percent +" B+ garade ");
		}else if (percent>=50 && percent<60) {
			System.out.println(percent +" C garade ");
		}else if (percent<50 && percent>0) {
			System.out.println(percent +" failed ");
		}else if (percent<=0 || percent>100) {
			System.out.println(percent +" Invalid Input ");
		}	
	}

	public static void main(String[] args) {
		Assignment3_StudentGrade assignment3_StudentGrade = new Assignment3_StudentGrade();
		assignment3_StudentGrade.display(100);
		assignment3_StudentGrade.display(90);
		assignment3_StudentGrade.display(80);
		assignment3_StudentGrade.display(70);
		assignment3_StudentGrade.display(60);
		assignment3_StudentGrade.display(50);
		assignment3_StudentGrade.display(-1);
		assignment3_StudentGrade.display(00);
		assignment3_StudentGrade.display(101);
		
	}

}
