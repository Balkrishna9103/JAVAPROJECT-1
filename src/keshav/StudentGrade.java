package keshav;

/*Assignment - 3 : 11th April'2022

Program 1 : Write a program to print student's grade using if else ladder.

If score is between 90 to 100 (including 90 and 100) --> A+ grade
If score is between 80 to 90 (including 80) --> A grade
If score is between 70 to 80 (including 70) --> B+ grade
If score is between 60 to 70 (including 60) --> B grade
If score is between 50 to 60 (including 50) --> C grade
less than 50 --> Failed
Input less than 0 and more than 100 --> invalid input */

class StudentGrade {
    void studentPercentage(int score) {
        if (score >= 90 && score <= 100)
            System.out.println("Student's score is " + score + " and grade is A+");
        else if (score >= 80 && score <= 90)
            System.out.println("Student's score is " + score + " and grade is A");
        else if (score >= 70 && score <= 80)
            System.out.println("Student's score is " + score + " and grade is B+");
        else if (score >= 60 && score <= 70)
            System.out.println("Student's score is " + score + " and grade is B");
        else if (score >= 50 && score <= 60)
            System.out.println("Student's score is " + score + " and grade is C");
        else if (score >=0 && score<50)
            System.out.println("Student's score is " + score + " and Failed");
        else if (score <=0 || score >100)
            System.out.println("Invalid input");
    }
    public static void main (String[] args){
        StudentGrade studentGrade = new StudentGrade();
		studentGrade.studentPercentage(91);
        studentGrade.studentPercentage(87);
        studentGrade.studentPercentage(73);
        studentGrade.studentPercentage(66);
        studentGrade.studentPercentage(60);
        studentGrade.studentPercentage(59);
        studentGrade.studentPercentage(48);
		studentGrade.studentPercentage(0);
        studentGrade.studentPercentage(-10);
        studentGrade.studentPercentage(101);

    }
}
