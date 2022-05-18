package poojaJ;

class Calculator{
	int num1=10;
	int num2=20;
	
	void add(){
		int ans = num1 + num2;
		System.out.println("Sum of two nos are as follows: " +ans);
	}
	
	void sub(){
		int sub = num2-num1;
		System.out.println("Subtraction of two nos are as follows: "+sub);
	}
	
	void multi(){
		int multi = num1*num2;
		System.out.println("Multiplication of two nos are as follows: "+multi);
	}
	
	void div(){
		int div = num2/num1;
		System.out.println("Division of two nos are as follows: "+div);
	}
	
	public static void main (String[] args){
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.multi();
		calc.div();
	}
}