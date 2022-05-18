package ashish;

class Employee{
	String empName = "Ashish";
	String empDeptId = "IT-10-1";
	int empId = 123;
	
	void printData(){	
		System.out.println("Employee name is: "+ empName + " and Employee id is: "+ empId);
		System.out.println("Employee dept id is: "+ empDeptId);		
	}
	
	public static void main(String[] args){	
		Employee emp = new Employee();
		emp.printData();
		
	}
}