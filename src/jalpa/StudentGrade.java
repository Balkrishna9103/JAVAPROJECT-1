package jalpa ;
class StudentGrade{
	void displayGrade (int score){

		if (score >=90 && score <=100){
				System.out.println("Score is "+ score + " :A+ GRADE");
		}else if (score >=80 && score < 90){
				System.out.println("Score is "+ score + " :A GRADE");
		}else if (score >=70 && score < 80){
				System.out.println("Score is "+ score + " :B+ GRADE");
		}else if (score >=60 && score < 70){
				System.out.println("Score is "+ score + " :B GRADE");
		}else if (score >=50 && score < 60){
				System.out.println("Score is "+ score + " :C GRADE");
		}else if (score >=0 && score < 50 ){
				System.out.println("Score is "+ score + " :FAIL");
		}else {
				System.out.println("Entered Score is Invalid Input");
		}
	}
	public static void main (String [] args){
			StudentGrade studentgrade = new StudentGrade() ;
			studentgrade.displayGrade(90);
			studentgrade.displayGrade(78);
			studentgrade.displayGrade(85);
			studentgrade.displayGrade(55);
			studentgrade.displayGrade(0);
			studentgrade.displayGrade(110);
			studentgrade.displayGrade(-20);
	}
}