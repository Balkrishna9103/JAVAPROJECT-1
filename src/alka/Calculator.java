package alka;
class Calculator
{
	int num1=10;
	int num2=2;
	
	void add()
	{
		int ans=num1+num2;
		System.out.println("sum is " + ans); 
	}
	
	void sub()
	{
      int ans=num1-num2;
       System.out.println("Sub is "+ ans); 	  
	}
	
	void mul()
	{
		 int ans=num1 * num2;
		 System.out.println("Multiplication is "+ ans);
		 
	}
	
	void div()
	{
		 int ans =num1/num2;
		 System.out.println("Division is "+ans);
	}
	
	
	public  static void main(String[] args)
	{
		 Calculator cal=new Calculator();
		 cal.add();
		 cal.sub();
		 cal.mul();
		 cal.div();
		
	}	
}