package tamanna;

public class A2CalculatorWithParams {
	void addition(int num1,int num2){
		System.out.println("Addition is : "+ (num1+num2));
	}
	
	void substraction(int num1,int num2){
		System.out.println("Substraction is : "+(num1-num2));
	}
	
	void multiplication(int num1, int num2){
		System.out.println("Multiplication is : "+ (num1*num2));
	}
	
	void division(int num1, int num2){
		System.out.println("Division is : "+ (num1/num2));
	}
	
	public static void main(String[] args){
		A2CalculatorWithParams a2CalculatorWithParams=new A2CalculatorWithParams();
		a2CalculatorWithParams.addition(10,2);
		a2CalculatorWithParams.substraction(10,2);
		a2CalculatorWithParams.multiplication(10,2);
		a2CalculatorWithParams.division(10,2);
	}
}
