package tusharB;

class Calculator{
	
	void add(int num1,int num2){
		System.out.println("Sum is " + (num1 + num2));
	}
	void sub(int num1,int num2){
		System.out.println("Sub is " + (num1 - num2));
	}
	void mul(int num1,int num2){
		System.out.println("Mul is " + (num1 * num2));
	}
	void div(int num1,int num2){
		System.out.println("div is " + (num1 / num2));
	}
	public static void main(String[] args){
		Calculator cal= new Calculator();
		cal.add(10,2);
		cal.sub(10,2);
		cal.mul(10,2);
		cal.div(10,2);		
	}
}