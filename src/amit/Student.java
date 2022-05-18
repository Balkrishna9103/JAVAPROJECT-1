package amit;

class Student{
	String name="Amit";
	int rno=1;
	
	void displayInfo() {
			System.out.println(name); // name->Amit
			System.out.println(rno);
	}

	public static void main(String[] args) {
		Student std = new Student();
		std.displayInfo();
	}
}