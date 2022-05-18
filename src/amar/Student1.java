package amar;

class Student1{
	
	void markSheet(int marks){
		if(marks >=90 && marks <=100)
			System.out.println(marks+" marks, your Grade is A+ ");
		else if(marks >=80 && marks <90)
			System.out.println(marks+" marks, your Grade is A ");
		else if(marks >=70 && marks <80)
			System.out.println(marks+" marks, your Grade is B+ ");
		else if(marks >=60 && marks <70)
			System.out.println(marks+" marks, your Grade is B ");
		else if(marks >=50 && marks <60)
			System.out.println(marks+" marks, your Grade is c ");
		else if(marks >=0 && marks<50)
			System.out.println(marks+" marks, you failed Exam ");
		else 
			System.out.println(marks+" Invalid Input ");
	}
	
	public static void main(String[] args){
		Student1 student1= new Student1();
		student1.markSheet(95);
		student1.markSheet(85);
		student1.markSheet(75);
		student1.markSheet(65);
		student1.markSheet(55);
		student1.markSheet(45);
		student1.markSheet(120);
		student1.markSheet(-55);
		
	}
}