package jalpa ;
class Student{
	String name ="jalpa";
	int rno = 1;
	
	void displayInfo(){

		System.out.println(name);
		System.out.println(rno);
}
	public static void main(String[]args){ 
		Student std = new Student ();
		std.displayInfo();
	}
}