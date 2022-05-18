package poojaK;
class CalculatorParameter{
	int digit1 = 10;
	int digit2 =2;
	
	void add (int a,int b){
		System.out.println("Sum of two digit numbers::"+ (a+b));
	
	}
	void sub (int a,int b){
		System.out.println("Substration of two digit numbers::"+ (a-b));
	
	}
	void mul (int a,int b){
		System.out.println("Multiplication of two digit numbers::"+ (a*b));
	
	}
	void div (int a,int b){
		System.out.println("Division of two digit numbers::"+ (a/b));
	
	}
	public static void main(String[] args){
		CalculatorParameter calulatorParameter = new CalculatorParameter();
		calulatorParameter.add(100,200);
		calulatorParameter.sub(200,100);
		calulatorParameter.mul(2,2);
		calulatorParameter.div(10,2);
	}
	

}