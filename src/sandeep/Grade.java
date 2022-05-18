//Assignment: 3
//Program 1 : Write a program to print student's grade using if else ladder.
package sandeep;

class Grade{
	void getPercent(int percent){
		if (percent >= 90 && percent <= 100)
			System.out.println("For " + percent + "% the Grade acheived is: A+");
		else if (percent >= 80 && percent < 90)
			System.out.println("For " + percent + "% the Grade acheived is: A");
		else if (percent >= 70 && percent < 80)
			System.out.println("For " + percent + "% the Grade acheived is: B+");
		else if (percent >= 60 && percent < 70)
			System.out.println("For " + percent + "% the Grade acheived is: B");
		else if (percent >= 50 && percent < 60)
			System.out.println("For " + percent + "% the Grade acheived is: C");
		else if (percent >= 0 && percent < 50)
			System.out.println("For " + percent + "% the Grade acheived is: Failed");
		else if (percent < 0 || percent > 100)
			System.out.println(percent + " is invalid input");
	}
	
	public static void main(String[] args){
		Grade grade = new Grade();
		grade.getPercent(94);
		grade.getPercent(86);
		grade.getPercent(72);
		grade.getPercent(68);
		grade.getPercent(56);
		grade.getPercent(25);
		grade.getPercent(-15);
		grade.getPercent(126);
	}
}