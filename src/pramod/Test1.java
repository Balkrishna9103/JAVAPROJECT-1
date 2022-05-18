package pramod;

public class Test1 {
	
	void processData(int sRange, int eRange) {
		for(int num=sRange; num<=eRange; num++) {
			if(num%3==0 && num%5==0)
				System.out.println(num + " is divisible by 3 and 5");
			else if(num%3==0)
				System.out.println(num + " is divisible by 3");
			else if(num%5==0)
				System.out.println(num + " is divisible by 5");
		}
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.processData(1,100);
	}

}
