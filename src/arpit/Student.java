package arpit;

class Student {
	String name = "arpit";
	int rNo = 1;

	void display() {
		System.out.println(name);
		System.out.println(rNo);
	}

	public static void main(String[] args) {
		Student std = new Student();
		std.display();

	}
}