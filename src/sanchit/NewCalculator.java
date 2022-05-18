package sanchit;

class NewCalculator{

	void add(int n1, int n2){
		System.out.println("Addition of "+n1+" and "+n2+" is: "+(n1+n2));
	}
	
	void sub(int n1, int n2){
		System.out.println("Subtraction of "+n1+" and "+n2+" is: "+(n1-n2));
	}
	
	void mul(int n1, int n2){
		System.out.println("Multiplication of "+n1+" and "+n2+" is: "+(n1*n2));
	}
	
	void div(int n1, int n2){
		System.out.println("Division of "+n1+" and "+n2+" is: "+(n1/n2));
	}
	
	public static void main(String[] args){
		NewCalculator newCalculator = new NewCalculator();
		newCalculator.add(30,20);
		newCalculator.sub(70,35);
		newCalculator.mul(25,25);
		newCalculator.div(360,18);
	
	}
}