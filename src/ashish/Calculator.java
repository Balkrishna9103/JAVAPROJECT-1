package ashish;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	void add(){	
		int a = num1+num2;
		System.out.println("Sum of two number is: "+ a);		
	}
	
	void sub(){	
		int s = num1-num2;
		System.out.println("Substraction of two number is: "+ s);		
	}
	void div(){	
		int d = num1/num2;
		System.out.println("Division of two number is: "+ d);		
	}
	
	void mul(){	
		int m = num1*num2;
		System.out.println("Multiplication of two number is: "+ m);		
	}
	
	public static void main(String[] args){	
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.div();
		cal.mul();
		
	}
}