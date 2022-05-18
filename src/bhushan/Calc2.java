package bhushan;

class Calc2{
	void add(int n1 ,int n2){
	System.out.println("Sum of " + n1 + " and " +n2+ " IS " + (n1+n2));
	}
	void sub(int n1 ,int n2){
	System.out.println("Sub of " + n1 + " and " +n2+ " IS " + (n1-n2));
	}
	void mul(int n1 ,int n2){
	System.out.println("Mul of " + n1 + " and " +n2+ " IS " + (n1*n2));
	}
	void div(int n1 ,int n2){
	System.out.println("Div of " + n1 + " and " +n2+ " IS " + (n1/n2));
	}
	public static void main(String[] args){
	Calc2 calc2 = new Calc2();
	calc2.add(10,20);
	calc2.sub(100,50);
	calc2.mul(10,10);
	calc2.div(200,20);
	}
}
