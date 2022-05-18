package balkrishna;

class Student{
	String name="Balkrishna";
	int rno =1;
	
	void DisplayInfo()
	{ 
	   System.out.println(name);
	   System.out.println(rno);
    }
	public static void main(String[] args)
	{
		Student std = new Student();
		std.DisplayInfo();
		
	}
}