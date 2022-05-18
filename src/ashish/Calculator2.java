package ashish;

class Calculator2{
		
	void add(int num1, int num2 ){		
		System.out.println("Summation of "+ num1 + " and " + num2 + " is: "+ (num1+num2));		
	}
	
	void sub(int num1, int num2){			
		System.out.println("Subtraction of "+ num1 + " and " + num2 + " is: "+ (num1-num2));		
	}
	void div(int num1, int num2){			
		System.out.println("Division of "+ num1 + " and " + num2 + " is: "+ (num1/num2));		
	}
	
	void mul(int num1, int num2){			
		System.out.println("Multiplication of "+ num1 + " and " + num2 + " is: "+ (num1*num2));		
	}
	
	public static void main(String[] args){	
		Calculator2 calculator2 = new Calculator2();
		calculator2.add(100,150);
		calculator2.sub(200,50);
		calculator2.div(400,10);
		calculator2.mul(20,100);		
	}
}