package prasad;

class Employee{
	String empName = "Sirus";
	String empDeptId = "Pras209";
	int empid = 210;
	
	void printData(){
		System.out.println("Employee name is " + empName);
		System.out.println("Emplyee dept id is " +empDeptId);
		System.out.println("Employee id is " +empid);
	}
	
	public static void main (String[] args){
		Employee emp = new Employee();	
		emp.printData();
		
	}
}