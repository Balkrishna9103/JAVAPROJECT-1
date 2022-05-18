package divya;
class Employee{
	
	  String empName = "Techno";
	  String empDeptId= "IT-10101";
	  int empid = 123;
	  void printData() {
		  System.out.println("Employee name is " + empName + "Employee dept is is " + empDeptId);
		  System.out.println("Employee dept id is " + empDeptId);
	  
	   }
	   
	   public static void main(String[] args){
		   Employee emp = new Employee();
		  // emp.printData();
		   String temp = emp.empName;
		   temp = "krishna";
		   emp.empName = temp;
		   System.out.println(emp.empName);
			
	   }
	   
	
}