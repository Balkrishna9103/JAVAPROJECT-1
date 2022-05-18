package pramod;
class Calculator{
	int firstNumber = 25;
	int secondNumber = 15;
	float result;
		
	void add(){
		result = firstNumber+secondNumber;
		System.out.println("Addition of both Numbers is - " + result);
	}
	
	void sub(){
		result = firstNumber-secondNumber;
		System.out.println("Subtraction of both Number is - " + result);
	}
	
	void mul(){
		result = firstNumber*secondNumber;
		System.out.println("Multiplication of both Numbers is - " + result);
	}
	
	void div(){
		result = firstNumber/secondNumber;
		System.out.println("Division of both Number is - " + result);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
}