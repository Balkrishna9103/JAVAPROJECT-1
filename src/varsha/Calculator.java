package varsha;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	void add(){
		int ans = num1+num2;
		System.out.println("Addition value is: "+ans);
	}
	
	void sub(){
		int ans = num1-num2;
		System.out.println("Substraction value is: "+ans);
	}
	
	void mul(){
		int ans = num1*num2;
		System.out.println("Multiplication value is: "+ans);
	}
	
	void div(){
		int ans = num1/num2;
		System.out.println("Division value is: "+ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
}