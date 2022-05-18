package dnyaneshari;

class Student{
	 String name="Dnyan";
	 int rollno=1;
	 
	 void dispalayInfo(){
		  System.out.println(name);
		  System.out.println(rollno);
	 }
	 
	 public static void main(String[] args){
		 System.out.println("Hello");
		 Student std=new Student();
		 std.dispalayInfo();
		 
	 }

}