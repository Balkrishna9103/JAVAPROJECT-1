//Assignment :2.1
package sandeep;

class Calculator1{
	
	void addition(int n1,int n2){
		System.out.println("The addition of " + n1 + " & " + n2 +" is: " +(n1+n2));
	}
	
	void substraction(int n1,int n2){
		System.out.println("The substraction of " + n1 + " & " + n2 +" is: " +(n1-n2));
	}
	
	void multiplication(int n1,int n2){
		System.out.println("The multiplication of " + n1 + " & " + n2 +" is: " +(n1*n2));
	}
	
	void division(int n1,int n2){
		System.out.println("The division of " + n1 + " & " + n2 +" is: " +(n1/n2));
	}
	
	public static void main(String[] args){
		Calculator1 calculator1 = new Calculator1();
		System.out.println("The output of calculation is as below");
		calculator1.addition(15,25);
		calculator1.substraction(30,20);
		calculator1.multiplication(5,10);
		calculator1.division(50,5);
	}
	
}