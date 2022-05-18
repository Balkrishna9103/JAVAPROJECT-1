package pragati;

class Calculator{
	int num1=10;
	int num2=2;
	void add(){
		int ans = num1+num2;
		System.out.println("sum is "+ans);
	}
	void sub(){
		int ans = num1-num2;
		System.out.println("sub is "+ans);
	}
	void div(){
		int ans = num1/num2;
		System.out.println("div is "+ans);
	}
	void mul(){
		int ans = num1*num2;
		System.out.println("mul is "+ans);
	}
	public static void main(String[]args){
		Calculator Cal = new Calculator();
		Cal.add();
		Cal.sub();
		Cal.div();
		Cal.mul();
		
	}
	
}