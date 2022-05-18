package bhavik;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	void add(){
		int ans = num1 + num2;
		System.out.println("Sum of numbers is "+ans );
	}
	void sub(){
		int ans = num1 - num2;
		System.out.println("Substraction of numbers is "+ans );
	}
	void mul(){
		int ans = num1 * num2;
		System.out.println("Multiplication of numbers is "+ans );
	}
	void div(){
		int ans = num1 / num2;
		System.out.println("Div of numbers is "+ans );
	}
	public static void main(String[] args){
		Calculator calc= new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
	
