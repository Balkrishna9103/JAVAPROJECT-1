package arti;
class Employee{
	String empName = "Technocredits";
	String empDeptId = "IT10101";
	int empId = 123;
	
	void printData(){
		System.out.println("Employee name is : "+empName);
		System.out.println("empDeptId is : "+ empDeptId);
		System.out.println();
		
	}
	public static void main(String[] args){
		Employee emp=new Employee();


	//	String temp = emp.empName;

		emp.printData();
	}
}