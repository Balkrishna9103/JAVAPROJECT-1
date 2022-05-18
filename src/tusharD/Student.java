package tusharD;

public class Student {
	
	String name = "Tushar";
	int rno = 101;
	
	void displayInfo(){
		System.out.println(name);	
		System.out.println(rno);	
	}
	public static void main(String[] args){ //executio start from here line 1
		Student std = new Student();	
		std.displayInfo();		
	}
}