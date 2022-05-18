package sunil;

class Student{
	String name= "Sunil Holambe";
	int rollno=07;
	
	void displayinfo(){
		System.out.println(name);
		System.out.println(rollno);
	}	
	
	public static void main(String[] args){
		System.out.println("Hello");
		Student std = new Student();
		std.displayinfo();
		System.out.println("Hi");
	}
}