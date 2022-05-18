package prasad;

class Calculator1{
	
	void add(int n1, int n2){
		System.out.println("Addition of both the numbers a & b is " + (n1 + n2));
	}
	
	void sub(int n1, int n2){
		System.out.println("Substraction of both the numbers a & b is " + (n1 - n2));
	}
	
	void mul(int n1, int n2){
		System.out.println("Multiplication of both the numbers a & b is " + (n1 * n2));
	}
	
	void div(int n1, int n2){
		System.out.println("Division of both the numbers a & b is " + (n1 / n2));
	}
	
	
	public static void main(String[] args){
		System.out.println("You can check your output below this line");
		System.out.println("");
		Calculator1 calculator = new Calculator1();
		calculator.add(100,20);
		calculator.sub(100,20);
		calculator.mul(100,20);
		calculator.div(100,20);
	}
	
}