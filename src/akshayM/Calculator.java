package akshayM;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	void add()
	{
		int ans = num1+num2;
		System.out.println("Sum is " +ans);
	}
	
	void sub()
	{
		int ans = num1-num2;
		System.out.println("Sub is " +ans);
	}
	
	void div()
	{
		int ans = num1/num2;
		System.out.println("Div is " +ans);
	}
	
	void mul()
	{
		int ans = num1*num2;
		System.out.println("Mul is " +ans);
	}
	
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.div();
		cal.mul();
	}
}
