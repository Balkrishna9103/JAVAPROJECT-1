package arti;
class StudentGrade{
					void displayGrade(int score){
					if(score>=90 && score<=100)
					System.out.println("Your Score is " + score + " with A+ grade \n");
										
					else if(score>=80 && score<90)
						System.out.println("Your Score is " + score + " with A grade \n");
					
					else if(score>=70 && score<80)
						System.out.println("Your Score is " + score + " with B+ grade \n");
					
					else if(score>=60 && score<70)
						System.out.println("Your Score is " + score + " with B grade \n");
					
					else if(score>=50 && score<60)
						System.out.println("Your Score is " + score + " with C grade \n");
					
					else if(score>=0 && score<50)
						System.out.println("You are Fail, please try again \n ");
					
					else
						System.out.println("You have entered invalid input \n");
					}
				
				public static void main(String[] args){
					
					StudentGrade studentGrade= new StudentGrade();
					
					studentGrade.displayGrade(95);
					studentGrade.displayGrade(81);
					studentGrade.displayGrade(90);
					studentGrade.displayGrade(75);
					studentGrade.displayGrade(69);
					studentGrade.displayGrade(56);
					studentGrade.displayGrade(35);
					studentGrade.displayGrade(-40);
					studentGrade.displayGrade(120);
					}
}