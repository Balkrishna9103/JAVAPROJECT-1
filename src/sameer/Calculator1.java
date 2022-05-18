package sameer;

//Assignment 2:
//Programm 1 : Calculator with parameterized method
class Calculator1
{
	//method for adding 2 numbers
	void add(int n1, int n2)
	{
		System.out.println("Sum of " +n1+ " and " +n2 +" is "+ (n1+n2));
	}
	
	//method for substracting 2 numbers
	void sub(int n1, int n2)
	{
		System.out.println("Substraction of " +n1+ " and " +n2 +" is "+ (n1-n2));
	}
	
	//method for Multiply 2 numbers
	void mult(int n1, int n2)
	{
		System.out.println("Multiplication of "  +n1+ " and " +n2 +" is "+ (n1*n2));
	}
	
	//method for devide 2 numbers
	void div(int n1, int n2)
	{
		System.out.println("Division of "  +n1+ " and " +n2 +" is "+ (n1/n2));
	}
	public static void main(String [] args)
	{
		Calculator1 cal1 = new Calculator1();
		cal1.add(5,10);
		cal1.sub(12,7);
		cal1.mult(3,9);
		cal1.div(15,5);
	}
}