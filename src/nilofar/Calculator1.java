package nilofar;

class Calculator1 {

	void add(int num1, int num2){
		int ans = num1+num2;
		System.out.println("Sum is: " + ans);
	}
	
	void sub(int num1, int num2){
		int ans = num1-num2;
		System.out.println("Substraction is: " + ans);
	}
	
	void mult(int num1, int num2){
		int ans = num1*num2;
		System.out.println("Multiplication is: " + ans);
	}
	
	void div(int num1, int num2){
		int ans = num1/num2;
		System.out.println("Division is: " + ans);
	}
	
	public static void main(String[]args){
		Calculator1 calculator1 = new Calculator1();
		calculator1.add(20,10);
		calculator1.sub(50,20);
		calculator1.mult(25,5);
		calculator1.div(25,5);
	}
}