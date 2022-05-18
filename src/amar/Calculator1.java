package amar;

class Calculator1{
	
	int ans;
	
	void add(int n1, int n2){
		ans= n1 + n2;
		System.out.println("Sum of "+n1+" + "+n2+" = "+ans);
	}
		
	void sub(int n1, int n2){
		ans= n1 - n2;
		System.out.println("Sub of "+n1+" - "+n2+" = "+ans);
	}
	
	void mul(int n1, int n2){
		ans= n1 * n2;
		System.out.println("Mul of "+n1+" * "+n2+" = "+ans);
	}
	
	void div(int n1, int n2){
		ans= n1 / n2;
		System.out.println("Div of "+n1+" / "+n2+" = "+ans);
	}
	
	public static void main(String[] args){
		Calculator1 calculator1 = new Calculator1();
		calculator1.add(5000, 500);
		calculator1.sub(4500, 1500);
		calculator1.mul(30, 20);
		calculator1.div(500,100);
	}
		
}