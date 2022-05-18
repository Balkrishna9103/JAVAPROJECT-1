package madhuriR;
// calculator with parameter methodes
class Calculator1{
	
	void additionOperation(int num1,int num2){
		System.out.println("Addition of "+num1+" and "+num2 +" is "+(num1+num2));
	}
	void subtractionOperation(int num1,int num2){
		System.out.println("Subtrsction of "+num1+" and "+num2 +" is "+(num1-num2));
	}
	void multiplicationOperation(int num1,int num2){
		System.out.println("Multiplication of "+num1+" and "+num2 +" is "+(num1*num2));
	}
	void divisionOperation(int num1,int num2){
		System.out.println("Division of "+num1+" and "+num2 +" is "+(num1/num2));
	}
	public static void main(String[] args){
		Calculator1 calculator1 = new Calculator1();
		calculator1.additionOperation(10,5);
		calculator1.subtractionOperation(25,5);
		calculator1.multiplicationOperation(13,3);
		calculator1.divisionOperation(50,10);
	}


}