package varsha;

class Calculator1{
	
	void add(int num1, int num2){
		int ans = num1+num2;
		System.out.println("Addition value is: "+ans);
	}
	
	void sub(int num1, int num2){
		int ans = num1-num2;
		System.out.println("Substraction value is: "+ans);
	}
	
	void mul(int num1, int num2){
		int ans = num1*num2;
		System.out.println("Multiplication value is: "+ans);
	}
	
	void div(int num1, int num2){
		int ans = num1/num2;
		System.out.println("Division value is: "+ans);
	}
	
	public static void main(String[] args){
		Calculator1 cal1 = new Calculator1();
		cal1.add(10,20);
		cal1.sub(30,15);
		cal1.mul(23,2);
		cal1.div(60,3);
	} 
}