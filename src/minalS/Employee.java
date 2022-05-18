package minalS;

class Employee{
    String empName="Techno";
	String empDeptId="IT-10101";
	int empId=123;
	
	void printData(){
		System.out.println("Employee name is "+empName);
		System.out.println("Employee dept Id is "+empDeptId);
	}
	public static void main(String[] args){
		Employee emp=new Employee();
		emp.printData();
	}
}