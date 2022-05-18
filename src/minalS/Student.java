package minalS;

class Student{
    String name="Minal";
	int rollNumber=1;
	
	void displayInfo(){
		System.out.println(name);
		System.out.println(rollNumber);
	}
	public static void main(String[] args){
		Student std=new Student();
		std.displayInfo();
	}
}