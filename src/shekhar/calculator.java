package shekhar;


class Calculator{

	int firstNumber =10;
	int secondNumber = 6;
	
	void addition()
	{
		int add = firstNumber + secondNumber;
		System.out.println("Addition of two numbers is:"+add);
	}
	
	void subtraction()
	{
		int sub = firstNumber - secondNumber;
		System.out.println("Subtraction of two numbers is:"+sub);	
	}
	
	void multiplication()
	{
		int mul = firstNumber*secondNumber;
		System.out.println("Multiplication of two numbers is:"+mul);	
	}
	
	void division()
	{
		int div = firstNumber/secondNumber;
		System.out.println("Division of two numbers is:"+div);
	}
	
	public static void main(String[] args)
	{	
		Calculator cal = new Calculator();
		
		cal.addition();
		cal.subtraction();
		cal.multiplication();
		cal.division();
				
	}

}