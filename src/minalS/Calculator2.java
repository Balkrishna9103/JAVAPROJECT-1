package minalS;

//Assignment: 2
//Program1:Calculator with parameterized method. 

class Calculator2{
	
	void addition(int num1,int num2){
		System.out.println("Addition of "+num1 +" & "+num2+" is : "+(num1+num2));
	}
	
	void substraction(int num1,int num2){
		System.out.println("Substraction of "+num1+" & "+num2+" is : "+(num1-num2));
	}
	
	void multiplication(int num1,int num2){
		System.out.println("Multiplication of "+num1+" & "+ num2 +" is : "+(num1*num2));
	}
	
	void division(int num1,int num2){
		System.out.println("Division of "+num1+" & "+num2+" is : "+(num1/num2));
	}
	
	public static void main(String[] args){
		Calculator2 calculator2=new Calculator2();
		
		calculator2.addition(45,35);
		calculator2.substraction(25,12);
		calculator2.multiplication(22,42);
		calculator2.division(60,12);
	}
}