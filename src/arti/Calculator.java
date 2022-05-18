package arti;
class Calculator{
	int num1;
	int num2;
	
	void add(int num1, int num2){
			int ans = num1 + num2;
			System.out.println("Addition is = " + ans);
	}
	
	void sub(int num1, int num2){
			int ans = num1 - num2;
			System.out.println("Subtration is = " + ans);
	}
	
	void mult(int num1 , int num2){
			int ans = num1 * num2;
			System.out.println("Multiplication is = " + ans);
	}
	
	void div(int num1, int num2){
			int ans = num1 / num2;
			System.out.println("Division is = " + ans);
	}
	
	public static void main(String[] args){
		Calculator cal=new Calculator();
		
		cal.add(20,80);
		cal.sub(100,40);
		cal.mult(15,15);
		cal.div(918,9);
	}

}