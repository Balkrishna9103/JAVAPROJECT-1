package jalpa;

public class Test1 {
	int num ;
	void divisibleByNum () 
	{
		for (num=1 ; num<=100 ; num++) {
			if (num%3==0 && num%5==0) 
			    System.out.println(num +" divisible by 3 & 5");	
			else if (num%3==0) 
				System.out.println(num +" divisible by 3");
			else if (num%5==0) 
			    System.out.println(num +" divisible by 5");
			}
	}
		public static void main(String[] args) {
			Test1 test1 = new Test1 ();
			test1.divisibleByNum ();
			}
}

