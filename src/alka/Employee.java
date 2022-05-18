package alka;
class Employee{
	String empName="Alka";
	String empDeptId="IT-01";
	int empid= 123;
	
	void printData()
	{
		System.out.println("Employee name is "+empName+"  and Employee Id  "+empid );
				
	}
	
	public static void main(String[] args)
	{
		Employee e =new Employee();
		e.printData();
		
	}
	
	
}