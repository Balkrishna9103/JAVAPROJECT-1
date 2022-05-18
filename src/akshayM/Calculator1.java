package akshayM;

class Calculator1{
	
	void add(int num1, int num2)
	{
		System.out.println("Sum is " +(num1+num2));
	}
	
	void sub(int num1, int num2)
	{
		System.out.println("Sub is " +(num1-num2));
	}
	
	void div(int num1, int num2)
	{
		System.out.println("Div is " +(num1/num2));
	}
	
	void mul(int num1, int num2)
	{
		System.out.println("Mul is " +(num1*num2));
	}
	
	public static void main(String[] args)
	{
		Calculator1 calculator1 = new Calculator1();
		calculator1.add(10, 20);
		calculator1.sub(200, 10);
		calculator1.div(200,10);
		calculator1.mul(20,10);
	}
}
