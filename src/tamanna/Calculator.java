package tamanna;

public class Calculator {
	int num1=10;
	int num2=2;
	
	void sum(){
		int ans=num1+num2;
		System.out.println("Sum is "+ ans);
	}
	
	void sub(){
		int ans=num1-num2;
		System.out.println("Sub is "+ ans);
	}
	
	void mul(){
		int ans=num1*num2;
		System.out.println("Mul is "+ ans);
	}
	
	void div(){
		int ans=num1/num2;
		System.out.println("Div is "+ ans);
	}
	
	public static void main(String[] args){
		Calculator calculator=new Calculator();
		calculator.sum();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}
