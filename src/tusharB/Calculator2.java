package tusharB;

class Calculator2{
	
	int num1=10;
	int	num2=2;
	void operation(){
		
		System.out.println("Sum is " + (num1 + num2));
		System.out.println("Sub is " + (num1 - num2));
		System.out.println("Div is " + (num1 / num2));
		System.out.println("Mul is " + (num1 * num2));
	}
	public static void main(String[] args){
		Calculator2 cal=new Calculator2();
		cal.operation();
	}
	
}