package sameer;

class Calculator
{
	int num1 = 10;
	int num2 = 2;
	
	//method for adding 2 numbers
	void add()
	{
		int ansAdd = num1 + num2;
		System.out.println("Sum is "+ ansAdd);
	}
	
	//Method for substacting 2 numbers
	void sub()
	{
		int ansSub= num1-num2;
		System.out.println("Substraction is "+ ansSub);
	}
	
	//method for multiplying 2 numbers
	void mult()
	{
		int ansMul =  num1*num2;
		System.out.println("Multiplication is "+ ansMul);	
	}
	
	//method for dividing 2 numbers
	void div()
	{
		int ansDiv= num1/num2;
		System.out.println("Division of two number is "+ ansDiv);
	}
	
	public static void main(String [] args)
	{
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mult();
		cal.div();
	}
}