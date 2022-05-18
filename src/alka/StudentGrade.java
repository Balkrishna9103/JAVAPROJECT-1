package alka;
class StudentGrade
{
	  void chkScore(int score)
	  {
		   if(score>=90 && score<=100)
		   {
			  System.out.println("A+ Grade");
		   }
		   else if(score>=80 && score<90)
		   {
			    System.out.println("A Grade");
		   }
		   else if(score>=70 && score<80)
		   {
			    System.out.println("B+ Grade");
		   }
		   
		  else if(score>=60 && score<70)
		   {
			    System.out.println("B Grade");
		   }
		    else if(score>=50 && score<60)
		   {
			    System.out.println("C Grade");
		   }
		   else if(score<50 && score >0)
		   {
			    System.out.println("Failed");
		   }
		   else if(score < 0 || score >100)
		   {
			    System.out.println("Invalid Input");
		   }
	  }
	  public static void main(String[] args)
	  {
		 StudentGrade studentgrade=new   StudentGrade();
		 
		  studentgrade.chkScore(90);studentgrade.chkScore(89);studentgrade.chkScore(71);
		  studentgrade.chkScore(60);
		  studentgrade.chkScore(59);
		  studentgrade.chkScore(49);
		  studentgrade.chkScore(-1);
		  studentgrade.chkScore(101);
		  
	  }
	
}