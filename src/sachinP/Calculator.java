package sachinP;
class Calculator{
	int num1= 100;
	int num2= 20;	
		void add(){
		int ansAdd = num1+num2;
		System.out.println("Addition of " + num1 + " + " + num2 +" = " + ansAdd);
	}
	void div(){
		int ansDiv =num1/num2;
		System.out.println("Devision of " + num1 + " / "+ num2 +" = " + ansDiv);
	}
	void mul(){
		int ansMul =num1*num2;
		System.out.println("Multiplication of " + num1 +" * " + num2 + " = " + ansMul);
	}
	void sub(){
		int ansSub =num1-num2;
		System.out.println("Substraction of "  + num1 +" - " + num2 + " = " + ansSub);
	}	
	public static void main (String[] args){
	Calculator calc= new Calculator();
	System.out.println("                                         ");
	System.out.println("--Calculator Program 9th April 2022 Day 1 --");
	System.out.println("                                         ");
	calc.add();
	System.out.println("                                         ");
	calc.sub();
	System.out.println("                                         ");
	calc.mul();
	System.out.println("                                         ");
	calc.div();
	System.out.println("                                         ");
	System.out.println("****************Thank You****************");
	}
	
}

