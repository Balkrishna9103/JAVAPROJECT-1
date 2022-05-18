package prateekM;

class Calculator{
	
	int num1 = 10;
	int num2 = 20;
	
	void add(){
		int ans = num1+num2;
		System.out.println("Addition of Two number is ="+ans);
	}
	void mul(){
		int ans = num1*num2;
		System.out.println("Multiplication of Two number is ="+ans);
	}
	void sub(){
		int ans = num2-num1;
		System.out.println("Substraction of Two number is ="+ans);
	}
	void div(){
		int ans = num2/num1;
		System.out.println("Division of Two number is ="+ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.mul();
		cal.sub();
		cal.div();
	}
}