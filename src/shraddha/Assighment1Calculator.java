package shraddha;

class Assighment1Calculator
{
	int num1 = 20;
	int num2 = 10;

	void addition()
	{
		int addition = num1+num2;
		System.out.println("Sum is " +addition);
	}
	void subtraction()
	{
		int subtraction = num1-num2;
		System.out.println("subtraction is " +subtraction);
	}
	void multiplication()
	{
		int multiplication = num1*num2;
		System.out.println("multiplication is " +multiplication);
	}
	void division()
	{
		int division = num1/num2;
		System.out.println("division is " +division);
	}

	public static void main(String[] args)
	{
	Assighment1Calculator calculator = new Assighment1Calculator();
	calculator.addition();
	calculator.subtraction();
	calculator.multiplication();
	calculator.division();
	}
}