package sandeep;

class Calculator{

	int num1 = 20;
	int num2 = 5;
	
	void add(){
		int ans = num1 + num2;
		System.out.println("Sum of both the numbers is " +ans);
	}
	
	void sub(){
		int ans = num1 - num2;
		System.out.println("Difference of both the numbers is " +ans);
	}
	
	void mul(){
		int ans = num1 * num2;
		System.out.println("Multiplication of both the numbers is " +ans);
	}
	
	void div(){
		int ans = num1 / num2;
		System.out.println("Division of both the numbers is " +ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		System.out.println("The output is as below");
		System.out.println("");
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
}
		
	