package nilofar;

class Calculator{
	int a = 25;
	int b = 5;
		
	void add (){
		int ans = a+b;
		System.out.println("Sum is: "+ans);
	}
	void sub (){
		int ans = a-b;
		System.out.println("Substraction is: "+ans);
	}
	void mult (){
		int ans = a*b;
		System.out.println("Multiplication is: "+ans);
	}
	void div(){
		int ans = a/b;
		System.out.println("Division is: "+ans);
	}
			public static void main (String[]args){
			Calculator cal = new Calculator();
			cal.add();
			cal.sub();
			cal.mult();
			cal.div();	
		}
}


