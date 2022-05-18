package tusharB;

class Employee{
	String empName="Tushar";
	String empDepid="IT-8416";
	int empID=553832;
	
	void printData(){
	System.out.println("Employee Name is " + empName + "Employee id is " +empDepid );
	System.out.println("Employee id is " + empID );
	}
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		
		emp.printData();
	}
}