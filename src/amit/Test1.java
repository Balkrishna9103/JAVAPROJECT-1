package amit;

public class Test1 {
	
	void div(int startnum,int endnum) {
		for(int num=startnum;num<=endnum;num++) {
			if (num%3==0 && num%5==0)
				System.out.println(num + "is divisible by 3&5");
			else if  (num%3==0)
				System.out.println(num + "is divisible by 3");
			else if (num%5==0)
				System.out.println(num + "is divisible by 5");
				
				}
			
	}
	public static void  main(String[] args) {
		Test1 test1=new Test1();
		test1.div(1, 100);
	}

}
