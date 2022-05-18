package minalS;

class Calculator{
	
	int num1=10;
	int num2=2;
	
	void add(){
		int ans=num1+num2;
		System.out.println("Sum answer is "+ans);
	}
	
	void sub(){
		int ans=num1-num2;
		System.out.println("Sub answer is "+ans);
	}
	
	void mult(){
		int ans=num1*num2;
		System.out.println("Mult answer is "+ans);
	}
	
	void div(){
		int ans=num1/num2;
		System.out.println("Div answer is "+ans);
	}
	
	public static void main(String[] args){
		Calculator cal=new Calculator();
		cal.add();
		cal.sub();
		cal.mult();
		cal.div();
	}
}