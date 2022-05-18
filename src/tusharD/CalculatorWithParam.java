package tusharD;

public class CalculatorWithParam {

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
		CalculatorWithParam calculator = new CalculatorWithParam();
		calculator.add(20,20);
		calculator.sub(56,15);
		calculator.mul(50,2);
		calculator.div(15,3);
	} 
}