package amar;

public class Test1{

	void m1(int startR, int endR, int div1, int div2) {
		for(int num=startR; num<=endR; num++) {
			if(num%div1==0 && num%div2==0)
				System.out.println(num+" is div by 3 & 5 ");
			else if(num%div1==0)
				System.out.println(num+" is div by 3");
			else if(num%div2==0)
				System.out.println(num+" is div by 5");							
		}
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.m1(1,100,3,5);
	}
	
	
} 
























