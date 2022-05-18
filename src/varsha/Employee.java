package varsha;
class Employee{
	String empName = "Technocredits";
	String empDeptId = "IT-10101";
	int empid = 123;
	
	void printData(){
		System.out.println("Employee Name is "+ empName);
		System.out.println("Employee dept id is "+empDeptId);
		System.out.println("Employee id is "+empid);
	}
	
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.printData();
		System.out.println(emp.empName);
	}
}