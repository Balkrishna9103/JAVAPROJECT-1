package varsha;
class Student{
	String name = "Varsha";
	int rno = 1;
	
	void displayInfo(){
		System.out.println(name);	//4
		System.out.println(rno);	//5
	}
	public static void main(String[] args){ //executio start from here line 1
		Student std = new Student();	//2
		std.displayInfo();		//3
	}
}