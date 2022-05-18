package sunil;

class Calculator{	
	int num1=18;
	int num2=16;
	
	void addition(){
		int add = num1+num2;
		System.out.println("Addition of Two Number Is="+ add);
	}
	void subtraction(){
		int sub = num1-num2;
		System.out.println("Subtraction of Two Number Is="+ sub);
	}
	void multiplication()
	{
		int mul = num1*num2;
		System.out.println("Multiplication of Two Number Is="+ mul);
	}
	void division()
	{
		int div = num1/num2;
		System.out.println("Division of Two Number Is="+ div);
	}
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();	
		calculator.multiplication();
		calculator.division();
	}
}