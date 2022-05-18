package minu;

class Calculator {
	
	void addition(int num1,int num2)
	{
		System.out.println("Addition of " + num1 + "+" + num2 + " = " + (num1 + num2));
	}
	
	void substraction(int num1,int num2)
	{
		System.out.println("Substraction of " + num1 + "-" + num2 + " = " +(num1 - num2));
	}
	
	void multiply(int num1,int num2)
	{
		System.out.println("Multiplication of " + num1 + "*" + num2 + " = " +(num1 * num2));
	}
	
	void division(int num1,int num2)
	{
		System.out.println("Division of " + num1 + "/" + num2 + " = " +(num1 / num2));
	}
	
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		calculator.addition(10,5);
		calculator.substraction(20,10);
		calculator.multiply(10,7);
		calculator.division(20,5);
		calculator.addition(40,20);
	}
}