package akshayM;

public class Test1 {

	void processData(int startRange, int endRange){
		for(int index = startRange; index <= endRange; index++)
		{
			if(index%3 == 0 && index%5 == 0)
				System.out.println(index+ " is divisible by 3 & 5");
			else if(index%3 == 0)
				System.out.println(index+ " is divisible by 3");
			else if(index%5 == 0)
				System.out.println(index+ " is divisible by 5");
		}
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.processData(1, 100);
	}
}
