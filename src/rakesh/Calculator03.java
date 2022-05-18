// no seperate methods for add sub mul div
// all under one method
package rakesh;
class Calculator03 {

	int num1 = 50;
	int num2 = 25;
	
	
	void cal(){
		//String numb1 = Integer.toString(num1);
		//String numb2 = Integer.toString(num2);
		System.out.println("Today's numbers are " + num1 +" and "+ num2 );
		int ansAdd = num1 + num2;
		System.out.println("    " + ansAdd + " is the Sum");
		int ansSub = num1 - num2;
		System.out.println("    " + ansSub + " is the Substraction");
		int ansDiv = num1 / num2;
		System.out.println("    " + ansDiv + " is the Division");
		int ansMul = num1 * num2;
		System.out.println("    " + ansMul + " is the Multiplication");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator03"); 
		Calculator03 std = new Calculator03();
		std.cal();
		System.out.println("Thank you for using our Calculator03");
	}

}
 