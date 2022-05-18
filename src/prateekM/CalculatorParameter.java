package prateekM;

class CalculatorParameter{
	
	
	void add(int num1 , int num2){
		//int ans = num1+num2;
		System.out.println("Addition of Two number is = "+ (num1+num2));
	}
	void mul(int num1 , int num2){
		//int ans = num1*num2;
		System.out.println("Multiplication of Two number is = "+ (num1*num2));
	}
	void sub(int num1 , int num2){
		//int ans = num2-num1;
		System.out.println("Substraction of Two number is = "+ (num2-num1));
	} 
	void div(int num1 , int num2){
		//int ans = num2/num1;
		System.out.println("Division of Two number is = "+ (num2/num1));
	}
	
	public static void main(String[] args){
		CalculatorParameter cal = new CalculatorParameter();
		cal.add(10 , 20);
		cal.mul(10 , 20);
		cal.sub(10 , 20);
		cal.div(10 , 20);
	}
}