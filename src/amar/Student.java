package amar;

class Student{
	
	String name= "Amar";
	int rno= 18;
	
	void displayInfo(){
		System.out.println(name);
		System.out.println(rno);
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.displayInfo();
	}
}
	