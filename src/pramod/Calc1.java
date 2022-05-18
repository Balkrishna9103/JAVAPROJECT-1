package pramod;
class Calc1{

	void add(int num1, int num2){
		System.out.println("Addition of "+ num1 +" and "+ num2 +" is - " + (num1 + num2) );
	}
	
	void sub(int num1, int num2){
		System.out.println("Subtraction of "+ num1 +" and "+ num2 +" is - " + (num1 - num2) );
	}
	
	void mul(int num1, int num2){
		System.out.println("Multiplication of "+ num1 +" and "+ num2 +" is - " + (num1 * num2) );
	}
	
	void div(int num1, int num2){
		System.out.println("Division of "+ num1 +" and "+ num2 +" is - " + (num1 / num2) );
	}
	
	public static void main(String[] args){
		Calc1 calc1 = new Calc1();
		calc1.add(100,200);
		calc1.sub(500,200);
		calc1.mul(40,20);
		calc1.div(250,25);
	}
}

/*Assignment 2 : 10th April'2022

Program 1:
Calculator with parameterized method

Program 2:
Create a class called Bank having debit, credit and print balance facility.
initial balance should be 1000. 
Perform debit & credit activities multiple time and print balance after all activities.

Hint: 
balance = 1000;

debitAmt(int amt)
creditAmt(int amt)
printBalance()

main(){
	debitAmt(200);
	creditAmt(500);
	creditAmt(1000);
	debitAmt(300);
	creditAmt(4000);
	printBalance();
} */