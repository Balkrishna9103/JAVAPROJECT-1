package nilofar;

class Employee{
	String empDeptId = "IT-01";
	String empName = "Nilofar";
	int empId = 101;
	
		void displayEmployeeInfo (){ 
		System.out.println("EmployeeID:"+empId);
		System.out.println("EmployeeName:"+empName);
		System.out.println("Employee dept id:"+ empDeptId);
			}
		public static void main (String[] args){
			Employee emp = new Employee ();
			//emp.displayEmployeeInfo ();
			String temp = emp.empName;
			System.out.println (emp.empName);
			
		}
}