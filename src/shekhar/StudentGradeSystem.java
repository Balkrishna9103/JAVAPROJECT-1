package shekhar;

class StudentGradeSystem{
	void studentgrades(int studentmarks){
		
		if(studentmarks>=90 && studentmarks<=100){
			System.out.println("Students marks are " + studentmarks + "% and grade is A+");
			
		}else if(studentmarks>=80 && studentmarks<90){
			System.out.println("Score is " + studentmarks + "% and grade is A");
		}else if(studentmarks>=70 && studentmarks<80){
			System.out.println("Score is " + studentmarks + "% and grade is B+");
		}else if(studentmarks>=60 && studentmarks<70){
			System.out.println("Score is " + studentmarks + "% and grade is B");
		}else if(studentmarks>=50 && studentmarks<60){
			System.out.println("Score is " + studentmarks + "% and grade is C");
		}else if(studentmarks>0 && studentmarks<50){
			System.out.println("Student failed");
		}else if(studentmarks<0 || studentmarks>100){
			System.out.println("Invalid input");
			
		}
	}
	
	public static void main(String[] args){
		StudentGradeSystem studentGradeSystem = new StudentGradeSystem();
		
		studentGradeSystem.studentgrades(95);
		studentGradeSystem.studentgrades(90);
		studentGradeSystem.studentgrades(82);
		studentGradeSystem.studentgrades(78);
		studentGradeSystem.studentgrades(-1);
		studentGradeSystem.studentgrades(61);
		studentGradeSystem.studentgrades(54);
		studentGradeSystem.studentgrades(49);
		studentGradeSystem.studentgrades(110);
		
	}

}