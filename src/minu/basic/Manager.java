package minu.basic;

public class Manager {
	
	
	void display() {
		Employee employee = new Employee();
		employee.num=10;
		System.out.println(employee.num);
		employee.num=1000;
		employee.processData("Technocredits");
	}

	void m1() {
		Employee employee = new Employee();
		employee.processData("Tech");
		System.out.println(employee.num);
	}
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.display();
		manager.m1();
	}

}
