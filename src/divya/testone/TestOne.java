package divya.testone;

public class TestOne{
	
	void divisibleByThreeAndFive(int startRange, int endRange) {
		
		for(int index = startRange; index <= endRange; index++) {
			
			if(index%3==0) {
				System.out.println(index + " is divisible by "+ 3);
			}
			
			else if(index%5==0) {
				System.out.println(index + " is divisible by "+ 5);
			}
			
			 if(index%3==0 && index%5==0) {
				System.out.println(index + " is divisible by "+ "5 & 3");
			}
		}
		
	}

	public static void main(String[] args) {
		TestOne test1 = new TestOne();
		test1.divisibleByThreeAndFive(1, 100);
	}
}
