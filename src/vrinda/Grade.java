package vrinda;

class Grade{

	void getPercent(int percent){
		if(percent>=90&&percent<=100)
		System.out.println("Score:"+percent+"%, Grade:A+");
		else if(percent>=80&&percent<90)
		System.out.println("Score:"+percent+"%, Grade:A");
		else if(percent>=70&&percent<80)
		System.out.println("Score:"+percent+"%, Grade:B+");
		else if(percent>=60&&percent<70)
		System.out.println("Score:"+percent+"%, Grade:B");
		else if(percent>=50&&percent<60)
		System.out.println("Score:"+percent+"%, Grade:C");
		else if(percent>=0&&percent<50)
		System.out.println("Score:"+percent+"%, Grade:Fail");
		else if(percent>100||percent<0)
		System.out.println("Invalid Data");
		}
		
		public static void main(String[]args){
		
			Grade grade=new Grade();
			grade.getPercent(98);
			grade.getPercent(87);
			grade.getPercent(74);
			grade.getPercent(65);
			grade.getPercent(58);
			grade.getPercent(44);
			grade.getPercent(-55);
			}
	}
			