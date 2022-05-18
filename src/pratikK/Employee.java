package pratikK;
class Employee{
 
  String empName = "Technocredits";
  String empDeptId = "IT-0101";
  int empid = 123;
  
  void printData(){
    System.out.println ("Employee name is  "+ empName);
    System.out.println ("Employee ID is  "+ empDeptId);
  }
  public static void main(String[] args){
	Employee emp=new Employee();
	String temp=emp.empName;
	System.out.println(temp);
  }
    
  }




