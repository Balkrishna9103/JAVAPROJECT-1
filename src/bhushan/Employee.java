package bhushan;

class Employee{
	String empName="techno";
	String empDepID="IT-101";
	void printData(){
		System.out.println(empName);
		System.out.println(empDepID);
	}
	
    public static void main(String[] args){
		Employee emp = new Employee();
		emp.printData();
		System.out.println("welcome");
	}
}