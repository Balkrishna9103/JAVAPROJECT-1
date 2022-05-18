package jalpa ;

class Calculator2{
	int num1 = 10;
	int num2 = 5;
	
	void addNum(int num1 , int num2){
		System.out.println("Summation Of "+num1+"+"+num2+"=" + (num1+num2));
	}

    void subNum(int num1 , int num2){
		System.out.println("Substraction of "+num1+"-"+num2+"="+(num1-num2));
	}

    void mulNum(){
		int ans = num1*num2;
		 System.out.println("Multiplication of "+num1+"*"+num2+"=" + ans);
	}

	void divNum(int num1 , int num2){
		System.out.println("Division of "+num1+"/"+num2+"="+(num1/num2));
	}
	
	public static void main(String[]args){ 
	 Calculator2 calculator2 = new Calculator2 ();
	  calculator2.addNum(10,5);
	  calculator2.subNum(20,10);
	  calculator2.mulNum();
	  calculator2.divNum(75,5);
	}
}