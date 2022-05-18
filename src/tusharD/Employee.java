package tusharD;

public class Employee {

	String empName = "Tushar";
	String empDeptId = "S022";
	int empid = 3062;
	
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
