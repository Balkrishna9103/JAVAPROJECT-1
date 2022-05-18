package poojaK;
class Calculator{
	int digit1 = 10;
	int digit2 =2;
	
	void add (){
		int sum = digit1 + digit2;
		System.out.println("Sum of two digit numbers::"+ sum);
	}
	void sub (){
		int sub = digit1 - digit2;
		System.out.println("Substration of two digit numbers::"+ sub);
	
	}
	void mul (){
		int mul = digit1 * digit2;
		System.out.println("Multiplication of two digit numbers::"+ mul);
	
	}
	void div (){
		int div = digit1 / digit2;
		System.out.println("Division of two digit numbers::"+ div);
	
	}
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
	

}