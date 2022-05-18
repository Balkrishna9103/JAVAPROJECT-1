package minu.basic;

public class Test {
	int x = 10;
	static int y = 20;
	
	void processData() {
		x++;
		y++;
	}
	
	void display() {
		System.out.println("x--> " + x);
		System.out.println("y--> "+ y);
	}

	public static void main(String[] args) {
		Test test1 = new Test();
		test1.processData();
		//test1.display();
		Test test2 = new Test();
		test2.processData();

		test1.display();
		test2.display();
		
	}

}
