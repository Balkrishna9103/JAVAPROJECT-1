package amar;

class Calculator{
	
	int n1= 500;
	int n2= 100;
	int ans;
	
	void add (){
		ans= n1 + n2;
		System.out.println("Sum of "+n1+" + "+n2+" = "+ans);
	}
	
	void sub(){
		ans= n1 - n2;
		System.out.println("Sub of "+n1+" - "+n2+" = "+ans);
	}
	
	void mul(){
		ans= n1 * n2;
		System.out.println("Mul of "+n1+" * "+n2+" = "+ans);
	}
	
	void div(){
		ans= n1 /n2;
		System.out.println("Div of "+n1+" / "+n2+" = "+ans);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();	
		calculator.div();
	}
	
}
	
