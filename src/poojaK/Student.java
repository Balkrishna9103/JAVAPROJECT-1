package poojaK;
class Student{
	String name="Pooja";
	int rollno=1;
	
	void displayInfo(){
		System.out.println(name);
		System.out.println(rollno);
		
	}
	public static void main(String[] args)
	{	
		System.out.println("Hello");
		Student std = new Student();
		std.displayInfo();
		System.out.println("Hii");
	}
}