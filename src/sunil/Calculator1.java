package sunil;

class Calculator1{	
	void addition(int num1, int num2){
		System.out.println("Addition of num1 & num2 is="+ (num1+num2));
	}
	void subtraction(int num1, int num2){
		System.out.println("Subtraction of num1 & num2 is="+ (num1-num2));
	}
	void multiplication(int num1, int num2){
		System.out.println("Multiplication of num1 & num2 is="+ (num1*num2));
	}
	void division(int num1, int num2){
		System.out.println("Division of num1 & num2 is="+ (num1/num2));
	}
	public static void main(String[] args){
		Calculator1 calculator1 = new Calculator1();
		calculator1.addition(18,9);
		calculator1.subtraction(27,18);	
		calculator1.multiplication(36,27);
		calculator1.division(36,2);
	}
}











