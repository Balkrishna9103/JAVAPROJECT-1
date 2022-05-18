package sanketB;

public class Test1 {
	
	void divisibleBy3And5(int startRange,int endRange){
		for (int num=startRange; num<=endRange;num++) {
			if (num%3 == 0 && num%5 == 0)
			System.out.println(num + " is div by 3 & 5");
			
			else if (num%3 == 0)
				System.out.println(num + " is div by 3");
			
			else if (num%5 == 0)
				System.out.println(num + " is div by 5");
		}
	}
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.divisibleBy3And5(1,100);
	}
}
