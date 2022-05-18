package yash;

class Calculator{
	
	int n1 = 500;
	int n2 = 100;
	
	void add(){
		int ans = n1 + n2;
		System.out.println("Sum of "+ n1+" + "+ n2+" = "+ans);
		
	}
	
	void sub(){
		int ans = n1 - n2;
		System.out.println("Sub of "+n1 +" - "+n2 +" = "+ans);
	}
	
	void mul(){
		int ans = n2 * n2;
		System.out.println("Mul of "+n1 +" * "+n2 +" = "+ans);
	}
	
	void div(){
		int ans = n2 / n2;
		System.out.println("Div of "+n1 +" / "+n2 +" = "+ans);
	}

	
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		System.out.println("                                 ");
		calculator.sub();
		System.out.println("                                 ");
		calculator.mul();
		System.out.println("                                 ");
		calculator.div();
	}
}