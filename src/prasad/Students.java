package prasad;

class Student {
	String name = "Prasad";
	int rno = 1;
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(rno);
	}
	public static void main(String[] args){
		System.out.println("myself");
		Student std = new Student();
		std.displayInfo();
		System.out.println("and only one");
		
	}
}