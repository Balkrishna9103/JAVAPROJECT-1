
package sachinP;
class Student
{
	String name = "Sachin";
	int rno=10;
	
	void displayInfo(){
			System.out.println(name);
			System.out.println(rno);
	}
	public static void main (String [] args){
		//System.out.println("Hello");
		Student std = new Student ();
		std.displayInfo();
	}
}
