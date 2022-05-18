package deepshikha;

public class Test_1 {
	void divisibleData(int startRange, int endRange) {
		for(int num=startRange;num<=100;num++) {
			if(num%3==0 && num%5==0) {
				System.out.println(num + " is divisible by 3 & 5");
			}else if(num%3==0) {
				System.out.println(num +" is divisible by 3");
			}else if(num%5==0) {
				System.out.println(num+ " is divisible by 5");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Test_1 test_1= new Test_1();
		test_1.divisibleData(1, 100);
	}
}
