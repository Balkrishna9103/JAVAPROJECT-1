package prasad;

class Calculator{
	int a = 10;
	int b = 2;
	
	void add(){
		int ans = a + b;
		System.out.println("Addition of both the numbers a & b is " + ans);
	}
	
	void sub(){
		int ans = a - b;
		System.out.println("Substraction of both the numbers a & b is " + ans);
	}
	
	void mul(){
		int ans = a * b;
		System.out.println("Multiplication of both the numbers a & b is " + ans);
	}
	
	void div(){
		int ans = a / b;
		System.out.println("Division of both the numbers a & b is " + ans);
	}
	
	
	public static void main(String[] args){
		System.out.println("You can check your output below this line");
		System.out.println("");
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
	
}
