package rakesh;
class Employee {
	String empName = "Techno";
	String empBrand = "CATIA";
	int empId = 00044300;

	void printData () {
		System.out.println("      Employee name is "+empName);
		System.out.println("      Employee department is "+empBrand);
		System.out.println("      Employee ID is "+empId);
	}
	public static void main(String[] args) {
		System.out.println("Hello team"); 
		Employee std = new Employee();   //std will hold new object to take class to memory
		std.printData();   //to get method displayInfo from std object
		System.out.println("Thank you for the details "); 
		
	}

}