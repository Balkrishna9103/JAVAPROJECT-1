// Assignment no -03  date-11/04/2022
// write a pqm to print students grade using if else ladder
package balkrishna;
class Grade{
	void CheckGrade(int score){
	   if(score >=90 && score <=100)
		   System.out.println("Your score is = "+score+ " and Grade is A+");
	   else if(score >=80 && score <90)
		   System.out.println("Your score is = "+score+ " and Grade is A");
       else if(score >=70 && score <80)
		   System.out.println("Your score is = "+score+ " and Grade is B+");
       else if(score >=60 && score <70)
		   System.out.println("Your score is = "+score+ " and Grade is B");
	   else if(score >=50 && score <60)
		   System.out.println("Your score is = "+score+ " and Grade is C");
	    else if(score >0 && score <50)
		   System.out.println("Your score is less than 50. You Failed = "+score);
       else if(score <0 || score >100)
		   System.out.println("Invalid input. please Enter valid Input");
    }
	   public static void main(String[] args){
		  Grade Grade = new Grade();
		  Grade.CheckGrade(95);
		  Grade.CheckGrade(85);
		  Grade.CheckGrade(72);
		  Grade.CheckGrade(67);
		  Grade.CheckGrade(51);
		  Grade.CheckGrade(45);
		  Grade.CheckGrade(101);
		  Grade.CheckGrade(-10);
	   }
}	   
	   
	   









