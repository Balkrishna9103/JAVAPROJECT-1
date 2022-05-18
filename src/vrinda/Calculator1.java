package vrinda;

class Calculator1{
	int num1=10;
	int num2=2;
	
	void add(){
	int ans=num1+num2;
	System.out.println("Sum of number is:"+ans);
	}
	
	void sub(){
	int ans=num1-num2;
	System.out.println("Substractin of number is:"+ans);
	}
	
	void mult(){
	int ans=num1*num2;
	System.out.println("Multiplicatin of number is:"+ans);
	}
	
	void div(){
	int ans=num1/num2;
	System.out.println("Division of number is:"+ans);
	}
	
	public static void main(String[]args){
	
	Calculator1 calculator=new Calculator1();
	calculator.add();
	calculator.sub();
	calculator.mult();
	calculator.div();
	}
}