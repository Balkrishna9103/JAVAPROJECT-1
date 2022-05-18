package jalpa ;

class Calculator{
	int num1 = 10;
	int num2 = 5;
	
	void addNum(){
		int ans = num1+num2;
		System.out.println("Sum Is : " + ans);
	}
    void subNum(){
		int ans = num1-num2;
		System.out.println("Substraction Is : " + ans);
	}
    void mulNum(){
		int ans = num1*num2;
		System.out.println("Multiplication Is : " + ans);
	}
	void divNum(){
		int ans = num1/num2;
		System.out.println("Division Is : " + ans);
	}
	
	public static void main(String[]args){ 
	Calculator cal = new Calculator ();
	cal.addNum();
	cal.subNum();
	cal.mulNum();
	cal.divNum();
	}
}