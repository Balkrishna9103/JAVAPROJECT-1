// int is converted to String using Integer.toString()
package rakesh;
class Calculator02 {

	int num1 = 2;
	int num2 = 10;
		
	void Numbers(){
		String numb1 = Integer.toString(num1);
		String numb2 = Integer.toString(num2);
		System.out.println("Today's numbers are " + numb1 +" and "+ numb2 );
	}
	
	void add(){
		int ansAdd = num1 + num2;
		System.out.println("    " + ansAdd + " is the Sum");
	}
	void sub(){
		int ansSub = num1 - num2;
		System.out.println("    " + ansSub + " is the Substraction");
	}
	void div(){
		int ansDiv = num1 / num2;
		System.out.println("    " + ansDiv + " is the Division");
	}
	void mul(){
		int ansMul = num1 * num2;
		System.out.println("    " + ansMul + " is the Multiplication");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator02"); 
		Calculator02 std = new Calculator02();
		std.Numbers();
		std.add(); 
		std.sub();
		std.div();
		std.mul();	
		System.out.println("Thank you for using our Calculator02");
	}

}
 