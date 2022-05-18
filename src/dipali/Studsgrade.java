package dipali;
class Studsgrade
{
     void printgrade(int score)
   {
        if (score>=90 && score<=100){  
      		System.out.println("Student Marks" + score +" % Assign with grade A+");
        }else if(score>=80 && score<90){
			System.out.println("Student Marks" + score +" % Assign with grade A");
        }else if(score>=70 && score<80){
			System.out.println("Student Marks" + score +" % Assign with grade B+");
        }else if(score>=60 && score<70){
			System.out.println("Student Marks" + score +" % Assign with grade B");
        }else if(score>=50 && score<60){
			System.out.println("Student Marks" + score +" % Assign with grade C");
        }else if(score>=0 && score<50){
			System.out.println("Student Marks" + score +" % Failed");
        }else if(score>0 || score<100){
			System.out.println("Student Marks" + score +" % Invalid Input");
    }
   }
   public static void main(String[] args){
        Studsgrade grade=new Studsgrade();
        grade.printgrade(96);
        grade.printgrade(84);
        grade.printgrade(77);
        grade.printgrade(70);
        grade.printgrade(58);
        grade.printgrade(37);
        grade.printgrade(-25);
        grade.printgrade(119);
  }
  }